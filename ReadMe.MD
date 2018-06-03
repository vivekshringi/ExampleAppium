#Project Details - An Appium Example

##Tools used 
- Maven
- testng
- Appium Server
- Appium java client 

##IDE used 
Eclipse 

##Project Architecture 
###Resources 
- apk files for installation on target device 
- System properties to provide all desired capabilities and Test data - Separate file like csv,xml can be created for providing bulk test data

###TestAppium
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

###Page Object Classes 
- All mobile elements 
- Activities

##How to run tests 
- mvn test
- or run testng for TestAppium  

##Tasks Left 
1.Fail Tests should fetch screenshot-done
2.special handling on logout for planing related test-done
3.Always change orientation to portrait-done
4.Add efficient tests for wait for element to be present-on going 
5.More to do on error handling part-on going
6.How to continue running tests if test fails -done
 
