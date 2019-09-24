package customer_api_test.appium_project;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import static io.appium.java_client.touch.offset.ElementOption.element;
import static io.appium.java_client.touch.TapOptions.tapOptions;
import static io.appium.java_client.touch.LongPressOptions.longPressOptions;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;
import static java.time.Duration.ofSeconds;

public class gestures extends base {

	@Test
	public void tapoption() throws MalformedURLException {

		AndroidDriver<MobileElement> driver = init();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElementByXPath("//android.widget.TextView[@text='Views']").click();
		// Tap
		TouchAction t = new TouchAction(driver);
		WebElement expandList = driver.findElementByXPath("//android.widget.TextView[@text='Expandable Lists']");
		t.tap(tapOptions().withElement(element(expandList))).perform();
	
	 driver.findElementByXPath("//android.widget.TextView[@text='1. Custom Adapter']").click();
	 WebElement pn=
	 driver.findElementByXPath("//android.widget.TextView[@text='People Names']");
	
	 t.longPress(longPressOptions().withElement(element(pn)).withDuration(ofSeconds(2))).release().perform();
	 //Thread.sleep(2000);
	 System.out.println(driver.findElementById("android:id/title").isDisplayed());
	}
}
