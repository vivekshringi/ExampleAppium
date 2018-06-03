# *Project Details - An Appium Example*
## *Tools used* 
- Maven
- testng
- Appium Server
- Appium java client 

## *IDE used*
- Eclipse 

## *Project Architecture* 

### *Resources* 
- apk files for installation on target device 
- System properties to provide all desired capabilities and Test data - Separate file like csv,xml can be created for providing bulk test data

### *TestAppium*
- All supporting functions - Later on it can be switched to Test Base file 
- Initializing driver 
- All tests 
- Login Test - Verify successfully login to application 
- Verify that all sports tours are more than a single activity tours 
- Verify that increasing radius in map have more tours 
- Verify Selecting all difficult level have more tours than a single difficult level 
- Verify Starting and Stop tracking 
- Verify Selecting different activities in plan screen
- Logout is successful

### *Page Object Classes* 
- All mobile elements 
- Activities

## *How to run tests* 
```
mvn test
```

or run testng.xml from the project

## *Tasks Left* 
- Fail Tests should fetch screenshot - *Done*
- Special handling on logout for planing related test - *Done*
- Always change orientation to portrait - *Done*
- Add efficient tests for wait for element to be present - *In Progress* 
- More to do on error handling part- *In Progress*
- How to continue running tests if test fails- *Done*
 
