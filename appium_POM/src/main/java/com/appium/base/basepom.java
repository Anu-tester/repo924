package com.appium.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;



public class basepom {

	public static DesiredCapabilities capabilities;
	public static Properties prop;
	public static AndroidDriver<MobileElement> driver;

	public basepom() {
		try {
			prop = new Properties();

			FileInputStream ip = new FileInputStream(
					"C:\\Users\\Anu\\Ecommercenew\\appium_POM\\src\\main\\java\\com\\appium\\config\\config.properties");

			prop.load(ip);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void initialization() throws MalformedURLException {
		 capabilities = new DesiredCapabilities();
		 File appDir = new File("resources");
			File app = new File(appDir,prop.getProperty("appname"));
		capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "AnuEmulator");
		capabilities.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
		// capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME,"C:\\Users\\Anu\\Ecommercenew\\appium_project\\src\\uiautomatorviewer.bat");
		driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"),
				capabilities);

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	}


