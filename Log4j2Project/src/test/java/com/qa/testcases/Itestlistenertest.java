package com.qa.testcases;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.commons.io.FileUtils;

import org.openqa.selenium.OutputType;

import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Itestlistenertest implements ITestListener {

	public static Logger logger = LogManager.getLogger(Itestlistenertest.class);

	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		logger.info("Test Case Started" + result.getName());
	}

	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		logger.info("Test case Done");
	}

	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub

		try {
			String name=result.getName();
			Log4J2PropertiesConf.screenshot(name);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub

	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		logger.info("onTestFailedButWithinSuccessPercentage " + result.getName());
	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub

	}

	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		logger.debug(context.getName());
	}

}
