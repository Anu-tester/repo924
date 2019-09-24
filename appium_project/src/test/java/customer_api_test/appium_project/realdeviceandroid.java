package customer_api_test.appium_project;



	import java.io.File;
	import java.net.MalformedURLException;
	import java.net.URL;
	import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
	import io.appium.java_client.android.AndroidElement;
	import io.appium.java_client.remote.MobileCapabilityType;

	public class realdeviceandroid {
	public static  AndroidDriver<MobileElement> capabilities(String device) throws MalformedURLException
	{
	AndroidDriver<MobileElement>  driver;

	// TODO Auto-generated method stub
	File appDir = new File("src");
	     File app = new File(appDir, "ApiDemos-debug.apk");
	     DesiredCapabilities capabilities = new DesiredCapabilities();
	     
	     //capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Rahulemulator");
	     if(device.equals("real"))
	     capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Device");
	     else
	         capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Rahulemulator");
	   //  capabilities.setCapability(MobileCapabilityType.BROWSER_NAME, "chrome");
	    capabilities.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
	    driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
	   
	   return driver;
	}

	}
	
	

