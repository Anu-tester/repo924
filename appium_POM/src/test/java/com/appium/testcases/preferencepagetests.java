package com.appium.testcases;

import java.net.MalformedURLException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.appium.base.basepom;
import com.appium.pages.preferncespage;

public class preferencepagetests extends basepom {
	
	preferncespage prepage;
	
	public  preferencepagetests() {
		
		super();
	}
	
	
	@Test
	public void setup() throws MalformedURLException {	
		initialization();
		prepage=new preferncespage();
		prepage.clickonpreference();
		prepage.clickondependency();
//		prepage.viewclick();
//		prepage.scrolldown();
//		//driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"WebView\"));");
//		 System.out.println(driver.findElementsByAndroidUIAutomator("new UiSelector().clickable(true)").size()); 
			
	}
	
}
