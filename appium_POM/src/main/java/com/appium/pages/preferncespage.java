package com.appium.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import com.appium.base.basepom;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidBy;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class preferncespage extends basepom {

	public preferncespage() {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	// driver.findElementByXPath("//android.widget.TextView[@text='Views']").click();
	// driver.findElementByAndroidUIAutomator("new UiScrollable(new
	// UiSelector()).scrollIntoView(text(\"WebView\"));");
	// System.out.println(driver.findElementsByAndroidUIAutomator("new
	// UiSelector().clickable(true)").size());

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Views']")
	public MobileElement views;
	@AndroidBy(uiAutomator = ("new UiScrollable(new UiSelector()).scrollIntoView(text(\"WebView\"));"))
			//"new UiScrollable(new UiSelector()).scrollIntoView(text(\"WebView\"));")
	public MobileElement listscroll;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Preference']")
	public MobileElement preferences;

	// driver.findElementByAndroidUIAutomator("attribute("value")")
	@AndroidBy(uiAutomator = "text(\"3. Preference dependencies\")")
	public MobileElement Preferencedependencies;

	public void viewclick() {
		views.click();
	}

	public void scrolldown() {
		listscroll.click();

	}

	public void clickonpreference() {
		preferences.click();
	}

	public void clickondependency() {
		Preferencedependencies.click();
	}
}
