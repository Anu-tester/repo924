package customer_api_test.appium_project;

import java.io.File;
import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.MobileBy.ByAndroidUIAutomator;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

import io.appium.java_client.remote.MobileCapabilityType;
import static io.appium.java_client.touch.TapOptions.tapOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;
import static io.appium.java_client.touch.LongPressOptions.longPressOptions;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;
import static java.time.Duration.ofSeconds;

public class swippingtests extends base {

	@Test
	public void swipegesture() throws MalformedURLException {

		AndroidDriver<MobileElement> driver = init();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElementByXPath("//android.widget.TextView[@text='Views']").click();

		driver.findElementByXPath("//android.widget.TextView[@text='Date Widgets']").click();;
		 driver.findElementByXPath("//android.widget.TextView[@text='2. Inline']").click();
		
		 driver.findElementByXPath("//*[@content-desc='9']").click();
		 
		 WebElement fifteen = driver.findElementByXPath("//*[@content-desc='15']");
		WebElement fortyfive = driver.findElementByXPath("//*[@content-desc='45']");
		
		TouchAction t = new TouchAction(driver);
		
		t.longPress(longPressOptions().withElement(element(fifteen)).withDuration(ofSeconds(2))).moveTo(element(fortyfive))
				.release().perform();
		
		
	}
	

}
