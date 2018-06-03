# *Project Details - An Appium Example*
## *Tools used* 
- Maven
- testng
- Appium Server
- Appium java client
- check appium doctor to check if all appium components are installed 
- to check elements locator use inspector session 

## *IDE used*
- Eclipse 
- testng plugin

## *Project Architecture* 
-src/test/java

---com.appium.pages

-----HomePage

-----LoginPage

---com.appium.tests

-----ListenerDemo

-----TestAppium

src/test/resources

-----de.komoot.android.apk

-----System.properties

pom.xml

testng.xml

ReadMe.MD


### *Resources Folder* 
- apk file for installation on target device 
- System properties to provide all desired capabilities and Test data - Separate file like csv,xml can be created for providing bulk test data

### *TestAppium.java*
- Initializing driver 
- All tests 
- Login Test - Verify successfully login to application 
- Verify that all sports tours are more than a single activity tours 
- Verify that increasing radius in map have more tours 
- Verify Selecting all difficult level have more tours than a single difficult level 
- Verify Starting and Stop tracking 
- Verify Selecting different activities in plan screen
- Logout is successful
- All supporting functions - Later on it can be switched to Test Base file 

### *Page Object Classes LoginPage and Home Page* 
- All mobile elements 
- Activities

## *How to run tests* 
```
mvn test
```

or run testng.xml from the project

## *Tasks Left* 
- ~~Fail Tests should fetch screenshot~~ - *Done*
- ~~Special handling on logout for planing related test~~ - *Done*
- ~~Always change orientation to portrait~~ - *Done*
- Add efficient tests for wait for element to be present - *In Progress* 
- More to do on error handling part- *In Progress*
- ~~How to continue running tests if test fails~~- *Done*
 
