package com.actitim.generic;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class ListerImpementation implements ITestListener{

	@Override
	public void onTestStart(ITestResult result) {
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		String res = result.getName();
		Reporter.log(res +"Has been Passed");
	}

	@Override
	public void onTestFailure(ITestResult result) {
//		String res = result.getName();
//		TakesScreenshot ts = (TakesScreenshot)driver;
//		File src= ts.getScreenshotAs(OutputType.FILE);
//		File dest=new File("./screenshots/"+res+".png");
//		try {
//			FileUtils.copyFile(src,dest);
//			
//		}catch (IOException e) {}
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		String res = result.getName();
		Reporter.log(res +"Has been Skipped ");
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		
	}

	@Override
	public void onStart(ITestContext context) {
			}

	@Override
	public void onFinish(ITestContext context) {
		}

}
