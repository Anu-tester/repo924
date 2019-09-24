package customer_api_test.appium_project;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class scrolldown extends base {

	@Test
	public void scrolldowntest() throws MalformedURLException {
		AndroidDriver<MobileElement> driver = init();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	     driver.findElementByXPath("//android.widget.TextView[@text='Views']").click();
	 driver.findElementByAndroidUIAutomator
	 ("new UiScrollable(new UiSelector()).scrollIntoView(text(\"WebView\"));").click();
	 System.out.println(driver.findElementsByAndroidUIAutomator("new UiSelector().clickable(true)").size()); 
		
	}
	
}
