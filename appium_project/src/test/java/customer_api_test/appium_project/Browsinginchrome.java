package customer_api_test.appium_project;

import java.net.MalformedURLException;

import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class Browsinginchrome extends chromebase {

	@Test(priority=0)
	public void chromebrowse() throws MalformedURLException {
		// TODO Auto-generated method stub
		AndroidDriver<MobileElement> driver = capabilities();
		driver.get("https://m.facebook.com/");
		driver.findElementByXPath("//input[@id='m_login_email']").sendKeys("testing");
		driver.findElementByXPath("//input[@id='m_login_password']").sendKeys("testing");
		driver.findElementByXPath("//button[@value='Log In']").click();
		//driver.close();
	}
	
	}


