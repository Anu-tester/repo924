package customer_api_test.appium_project;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class firesttest extends base {
	@Test(priority=0)
	public void basictests() throws MalformedURLException {
		
		AndroidDriver<MobileElement> driver=init();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//android.widget.TextView[@text='Preference']")).click();
		driver.findElement(By.xpath("//android.widget.TextView[@index='2']")).click();
		
		driver.findElement(By.id("android:id/checkbox")).click();
		
		driver.findElement(By.xpath("(//android.widget.TextView)[4]")).click();
		
		driver.findElement(By.id("android:id/edittext_container")).sendKeys("testing");
		driver.findElement(By.id("android:id/button1")).click();
		System.out.println("Done");
		
	
	
	}
	

}
