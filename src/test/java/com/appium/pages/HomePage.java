package com.appium.pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class HomePage {
	public String activity = ".app.InspirationActivity";

	@AndroidFindBy(accessibility = "DISCOVER")
	public MobileElement discover;

	@AndroidFindBy(accessibility = "PLAN")
	public MobileElement plan;

	@AndroidFindBy(accessibility = "MAP")
	public MobileElement map;

	@AndroidFindBy(id = "de.komoot.android:id/imageViewTabProfile")
	public MobileElement profile;

	@AndroidFindBy(accessibility = "REGION")
	public MobileElement region;

	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.view.View[1]/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ListView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.TextView[1]")
	public MobileElement findYourPerfectTour;

	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.view.View[1]/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ListView/android.widget.LinearLayout/android.widget.LinearLayout/android.support.v7.widget.RecyclerView/android.widget.FrameLayout[1]/android.widget.ImageView")
	public MobileElement bikingIcon;

	@AndroidFindBy(id = "de.komoot.android:id/dtsfbv_selected_sport_name_tv")
	public MobileElement selectedSport;

	@AndroidFindBy(id = "de.komoot.android:id/dscbv_show_content_tb")
	public MobileElement tourFound;

	@AndroidFindBy(id = "de.komoot.android:id/dtsfbv_base_row_container_ll")
	public MobileElement sportType;

	@AndroidFindBy(id = "de.komoot.android:id/dtsfbv_selected_sport_name_tv")
	public MobileElement sportName;

	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.support.v4.view.ViewPager/android.widget.RelativeLayout/android.widget.ListView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.support.v7.widget.RecyclerView/android.widget.FrameLayout[1]/android.widget.ImageView")
	public MobileElement allSport;

	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.support.v4.view.ViewPager/android.widget.RelativeLayout/android.widget.ListView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.support.v7.widget.RecyclerView/android.widget.FrameLayout[2]/android.widget.ImageView")
	public MobileElement hikingSport;

	@AndroidFindBy(id = "de.komoot.android:id/psfb_selected_sport_name_tv")
	public MobileElement sporttypeName;

	@AndroidFindBy(id = "de.komoot.android:id/pflfb_title_ttv")
	public MobileElement oneWay;

	@AndroidFindBy(id = "de.komoot.android:id/dtdifbv_difficulty_title_ttv")
	public MobileElement fitnessLevel;

	@AndroidFindBy(id = "de.komoot.android:id/dtdifbv_difficulty_easy_tcb")
	public MobileElement easyFitnessLevel;

	@AndroidFindBy(id = "de.komoot.android:id/dtdifbv_difficulty_easy_selected_v")
	public MobileElement easyFitnessLevelSelected;

	@AndroidFindBy(id = "de.komoot.android:id/dtdifbv_difficulty_intermediate_tcb")
	public MobileElement intermediateFitnessLevel;

	@AndroidFindBy(id = "de.komoot.android:id/dtdifbv_difficulty_intermediate_selected_v")
	public MobileElement intermediateFitnessLevelSelected;

	@AndroidFindBy(id = "de.komoot.android:id/dtdifbv_difficulty_expert_tcb")
	public MobileElement expertFitnessLevel;

	@AndroidFindBy(id = "de.komoot.android:id/dtdifbv_difficulty_expert_selected_v")
	public MobileElement expertFitnessLevelSelected;

	@AndroidFindBy(id = "de.komoot.android:id/pwb_location_name_tatv")
	public MobileElement currentLocation;

	@AndroidFindBy(id = "de.komoot.android:id/dshv_decrease_radius_ib")
	public MobileElement radiusDecrease;

	@AndroidFindBy(id = "de.komoot.android:id/dshv_increase_radius_ib")
	public MobileElement radiusIncrease;

	@AndroidFindBy(id = "de.komoot.android:id/uihiv_settings_ib")
	public MobileElement settings;

	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.view.View[1]/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ListView/android.widget.LinearLayout[9]/android.widget.RelativeLayout/android.widget.TextView")
	public MobileElement logout;

	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.FrameLayout[1]/android.widget.ImageView")
	public MobileElement navigationBack;

	@AndroidFindBy(id = "de.komoot.android:id/button_tracking_start")
	public MobileElement startTrackingButton;

	@AndroidFindBy(id = "de.komoot.android:id/msb_stop_button_tb")
	public MobileElement stopTrackingButton;

	@AndroidFindBy(id = "de.komoot.android:id/mbmb_camera_ib")
	public MobileElement startCameraButton;
	
	@AndroidFindBy(id = "de.komoot.android:id/psfb_selected_sport_name_tv")
	public MobileElement selectSportActivity;
	
	@AndroidFindBy(id = "psfb_base_row_container_ll")
	public MobileElement selectDifferentSportActivity;

	
	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.view.View[1]/android.widget.FrameLayout[2]/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.support.v7.widget.RecyclerView/android.widget.FrameLayout[3]/android.widget.ImageView")
	public MobileElement selectThirdSportActivity;
	
	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.view.View[1]/android.widget.FrameLayout[2]/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.support.v7.widget.RecyclerView/android.widget.FrameLayout[4]/android.widget.ImageView")
	public MobileElement selectFourthSportActivity;
	
	@AndroidFindBy(id = "android:id/button1")
	public MobileElement yesButton;

	
	}
