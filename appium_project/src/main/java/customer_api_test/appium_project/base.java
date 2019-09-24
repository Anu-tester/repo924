package customer_api_test.appium_project;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class base {

	public static AndroidDriver<MobileElement> init() throws MalformedURLException {
		File appDir = new File("src");
		File app = new File(appDir, "ApiDemos-debug.apk");
		
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Android914");
		capabilities.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
		capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "ANDROID");
		// capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME,"C:\\Users\\Anu\\Ecommercenew\\appium_project\\src\\uiautomatorviewer.bat");
		AndroidDriver<MobileElement> driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"),
				capabilities);

		return driver;
	}
}
