package customer_api_test.appium_project;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;
public class draganddrop extends base {

	
	@Test
	public void dragdrop() throws MalformedURLException {
		
		AndroidDriver<MobileElement> driver=init();
	     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	     
	     driver.findElementByXPath("//android.widget.TextView[@text='Views']").click();
	     driver.findElementByXPath("//android.widget.TextView[@text='Drag and Drop']").click();
	     WebElement source=driver.findElementsByClassName("android.view.View").get(0);
	     WebElement destination=driver.findElementsByClassName("android.view.View").get(1);
	     
	     
	     TouchAction t = new TouchAction(driver);
	     //longpress(source)/move(destination)//release
	     t.longPress(longPressOptions().withElement(element(source))).moveTo(element(destination)).release().perform();
	     t.longPress(element(source)).moveTo(element(destination)).release().perform();
	     
	}
}
