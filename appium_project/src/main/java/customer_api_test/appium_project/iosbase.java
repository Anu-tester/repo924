package customer_api_test.appium_project;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.remote.AutomationName;
import io.appium.java_client.remote.MobileCapabilityType;

public class iosbase {

	
	public static IOSDriver<IOSElement> init() throws MalformedURLException {
		File appDir = new File("src");
		File app = new File(appDir, "desktop/uicatalog");//uicatalog is from xcode just drag to desktop
		
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Iphone6");
		capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "IOS");
		//if you are using more than 10 Mac version then add these capapbilities  AutomationName.IOS_XCUI_TEST
		capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, AutomationName.IOS_XCUI_TEST);
		capabilities.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
		
		IOSDriver<IOSElement> driver = new IOSDriver<IOSElement>(new URL("http://127.0.0.1:4723/wd/hub"),
				capabilities);

		return driver;
	}
}
