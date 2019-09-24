package customer_api_test.appium_project;

import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class browsingcrickbuzz extends chromebase {
	@Test(priority=1)
	public void crickbuzz() throws MalformedURLException {
		
		AndroidDriver<MobileElement> driver = capabilities();
		//driver.get("https://www.cricbuzz.com/");
//		driver.findElement(By.linkText("Live Scores")).click();
//		System.out.println(driver.getCurrentUrl());
		driver.get("https://m.cricbuzz.com/");
		//driver.findElementByXPath("//a[@href='#menu']").click();
		//driver.findElement(By.xpath("//a[@href='#menu']")).click();
		//driver.findElement(By.cssSelector("a[title='Cricbuzz Home']")).click();
		//driver.findElementByCssSelector("a[title='Cricbuzz Home']").click();
		System.out.println(driver.getCurrentUrl());
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		   jse.executeScript("window.scrollBy(0,480)", "");
		   Assert.assertTrue(driver.findElement(By.xpath("//h4[text()='Top Stories']")).getAttribute("class").contains("header"));
}
}
