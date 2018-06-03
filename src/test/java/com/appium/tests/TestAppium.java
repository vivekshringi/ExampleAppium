package com.appium.tests;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.remote.MobileCapabilityType;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URL;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.appium.pages.HomePage;
import com.appium.pages.LoginPage;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.remote.AndroidMobileCapabilityType;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class TestAppium {

	private AndroidDriver<MobileElement> driver;
	private LoginPage loginPage;
	private HomePage homePage;

	@BeforeClass
	public void setUp() throws Exception {
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, getPropertyValue("PLATFORM_VERSION"));
		capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, getPropertyValue("PLATFORM_NAME"));
		capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, getPropertyValue("DEVICE_NAME"));
		capabilities.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, getPropertyValue("APP"));
		capabilities.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, getPropertyValue("APP_ACTIVITY"));
		capabilities.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, getPropertyValue("APP_PACKAGE"));
		driver = new AndroidDriver<>(new URL(getPropertyValue("APPIUM_SERVER_URL")), capabilities);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		loginPage = new LoginPage();
		PageFactory.initElements(
				new AppiumFieldDecorator(driver, Integer.parseInt(getPropertyValue("IMPLICIT_WAIT")), TimeUnit.SECONDS),
				loginPage);
		homePage = new HomePage();
		PageFactory.initElements(
				new AppiumFieldDecorator(driver, Integer.parseInt(getPropertyValue("IMPLICIT_WAIT")), TimeUnit.SECONDS),
				homePage);

	}

	@BeforeMethod
	public void loginTest() throws InterruptedException {
		waitForElement(loginPage.termsAndConditions);
		String termsText = loginPage.termsAndConditions.getText();
		assertEquals(termsText, getPropertyValue("TERMS_TEXT"));
		String currentActivity = driver.currentActivity();
		assertEquals(currentActivity, getPropertyValue("STARTING_ACTIVITY"));
		waitForElement(loginPage.selectEmail);
		loginPage.selectEmail.click();
		waitForElement(loginPage.noneOfAbove);
		loginPage.noneOfAbove.click();
		waitForElement(loginPage.enterEmail);
		loginPage.enterEmail.sendKeys(getPropertyValue("USERNAME"));
		loginPage.nextButton.click();
		currentActivity = driver.currentActivity();
		assertEquals(currentActivity, loginPage.activity);
		loginPage.enterPassword.sendKeys(getPropertyValue("PASSWORD"));
		loginPage.loginButton.click();
		waitForElement(homePage.discover);
		String tourText = homePage.findYourPerfectTour.getText();
		assertEquals(tourText, getPropertyValue("TOUR_TEXT"));
		currentActivity = driver.currentActivity();
		assertEquals(currentActivity, homePage.activity);
	}

	// @Test
	public void Test001_selectTourFromHome() {
		waitForElement(homePage.plan);
		homePage.plan.click();
		waitForElement(homePage.discover);
		homePage.discover.click();
		waitForElement(homePage.bikingIcon);
		homePage.bikingIcon.click();
		assertEquals(homePage.selectedSport.getText(), getPropertyValue("SELECTED_TOUR"));
		String bikingTour = homePage.tourFound.getText();
		int bikingTourCount = countTours(bikingTour);
		System.out.println(bikingTourCount);
		waitForElement(homePage.sportType);
		homePage.sportType.click();
		homePage.allSport.click();
		waitForElement(homePage.sportType);
		homePage.sportType.click();
		String allTours = homePage.tourFound.getText();
		int allToursCount = countTours(allTours);
		System.out.println(allToursCount);
		homePage.sportType.click();
		homePage.navigationBack.click();
		assertTrue(allToursCount >= bikingTourCount);
	}

	@Test
	public void Test002_changingRadius() {
		// check the page if you are on currentPage
		waitForElement(homePage.bikingIcon);
		homePage.bikingIcon.click();
		homePage.radiusIncrease.click();
		int goodCount = countTours(homePage.tourFound.getText());
		System.out.println(homePage.tourFound.getText());
		homePage.radiusIncrease.click();
		int betterCount = countTours(homePage.tourFound.getText());
		assertTrue(betterCount >= goodCount);
		System.out.println(homePage.tourFound.getText());
		homePage.radiusIncrease.click();
		int bestCount = countTours(homePage.tourFound.getText());
		assertTrue(bestCount >= betterCount);
		System.out.println(homePage.tourFound.getText());
		homePage.navigationBack.click();
	}

	@Test
	public void Test003_changingDifficulty() {
		waitForElement(homePage.bikingIcon);
		homePage.bikingIcon.click();
		homePage.fitnessLevel.click();
		int allToursCount = countTours(homePage.tourFound.getText());
		System.out.println(homePage.tourFound.getText());
		homePage.easyFitnessLevel.click();
		int excludingEasyCount = countTours(homePage.tourFound.getText());
		homePage.intermediateFitnessLevel.click();
		int difficultCount = countTours(homePage.tourFound.getText());
		waitForElementToDisappear(By.id("de.komoot.android:id/dtdifbv_difficulty_easy_selected_v"));
		waitForElementToDisappear(By.id("de.komoot.android:id/dtdifbv_difficulty_intermediate_selected_v"));
		assertTrue(allToursCount >= excludingEasyCount);
		assertTrue(excludingEasyCount >= difficultCount);
		homePage.navigationBack.click();
	}
	
	@Test
	public void Test004_startTracking() {
		waitForElement(homePage.map);
		homePage.map.click();
		homePage.startTrackingButton.click();
		waitForElement(homePage.startCameraButton);
		new TouchAction(driver).press(homePage.stopTrackingButton).waitAction(5000).release().perform();
		waitForElement(homePage.startTrackingButton);
	}
	
	@Test
	public void Test005_planTest() {
		waitForElement(homePage.plan);
		homePage.plan.click();
		System.out.println(homePage.selectSportActivity.getText());
		assertEquals(homePage.selectSportActivity.getText(),getPropertyValue("BIKE_TOUR"));
		homePage.selectDifferentSportActivity.click();
		waitForElement(homePage.selectThirdSportActivity);
		homePage.selectThirdSportActivity.click();
		System.out.println(homePage.selectSportActivity.getText());
		assertEquals(homePage.selectSportActivity.getText(),getPropertyValue("MOUNTAIN_BIKING"));
		homePage.selectFourthSportActivity.click();
		System.out.println(homePage.selectSportActivity.getText());
		assertEquals(homePage.selectSportActivity.getText(),getPropertyValue("ROAD_CYCLING"));
	}

	@AfterMethod
	public void logout() {
		waitForElement(homePage.profile);
		homePage.profile.click();
		waitForElement(homePage.profile);
		homePage.settings.click();
		bottomTopswipe(3000);
		homePage.logout.click();
		waitForElement(loginPage.termsAndConditions);

	}

	@AfterClass
	public void tearDown() {
		driver.closeApp();
		driver.quit();

	}

	public void takeScreenShot(String fileName) {
		File file = new File(fileName + ".png");
		File tmpFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(tmpFile, file);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public String getFileAbsolutePath(String fileName) {
		ClassLoader classLoader = getClass().getClassLoader();
		File file = new File(classLoader.getResource(fileName).getFile());
		return file.getAbsolutePath();
	}

	public String getPropertyValue(String key) {
		String rootPath = Thread.currentThread().getContextClassLoader().getResource("").getPath();
		String appConfigPath = rootPath + "System.properties";

		Properties appProps = new Properties();
		try {
			appProps.load(new FileInputStream(appConfigPath));
		} catch (IOException e) {
			e.printStackTrace();
		}
		return appProps.getProperty(key);
	}

	public void waitForElement(MobileElement element) {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOf(element));
	}

	public void waitForElementToDisappear(By by) {
		WebDriverWait wait = new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(by));
	}

	public void bottomTopswipe(int timeduration) {
		Dimension size = driver.manage().window().getSize();
		System.out.println(size);
		int starty = (int) (size.height * 0.60);
		int endy = (int) (size.height * 0.10);
		int startx = size.width / 2;
		System.out.println("Start swipe operation");
		driver.swipe(startx, starty, startx, endy, timeduration);

	}

	public int countTours(String Text) {
		return Integer.parseInt(Text.substring(0, Text.length() - 14));
	}

}
