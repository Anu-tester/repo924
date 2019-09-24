package customer_api_test.appium_project;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class chromebase {
	public static  AndroidDriver<MobileElement> capabilities() throws MalformedURLException
	{
	AndroidDriver<MobileElement>  driver;

	// TODO Auto-generated method stub
	/* File appDir = new File("src");
	     File app = new File(appDir, "ApiDemos-debug.apk");*/
	     DesiredCapabilities capabilities = new DesiredCapabilities();
	    
	     capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "AnuDevice");
	     
	     capabilities.setCapability(MobileCapabilityType.BROWSER_NAME,"Chrome");
	    
	  //   capabilities.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
	    driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
	   
	   return driver;
	}
}
