package com.appium.tests;

import org.testng.ITestContext ;		
import org.testng.ITestListener ;		
import org.testng.ITestResult ;

public class ListenerDemo extends TestAppium implements ITestListener {
	   public static int testStatus;
	   public static String testName;
	
	    @Override		
	    public void onFinish(ITestContext arg0) {					
	        // TODO Auto-generated method stub				
	        		
	    }		

	    @Override		
	    public void onStart(ITestContext arg0) {					
	        // TODO Auto-generated method stub				
	        		
	    }		

	    @Override		
	    public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {					
	        // TODO Auto-generated method stub				
	        		
	    }		

	    @Override		
	    public void onTestFailure(ITestResult Result) {					
	        // TODO Auto-generated method stub				
	    	System.out.println("The name of the testcase is failed");
	    	testStatus=Result.getStatus();
	    testName=Result.getMethod().getMethodName();

	    	
	    }		

	    @Override		
	    public void onTestSkipped(ITestResult arg0) {					
	    	System.out.println("The name of the testcase is skipped");				
	        		
	    }		

	    @Override		
	    public void onTestStart(ITestResult arg0) {					
	        // TODO Auto-generated method stub				
	        		
	    }		

	    @Override		
	    public void onTestSuccess(ITestResult Result) {					
	      	System.out.println("The name of the testcase is passed");	
	      	testStatus=Result.getStatus();
	      	testName=Result.getMethod().getMethodName();
	        		
	    }
	}		
	
