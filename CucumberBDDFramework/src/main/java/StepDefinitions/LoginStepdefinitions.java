package StepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;

public class LoginStepdefinitions {

	@Given("^user is already on Login Page$")
	public void user_is_already_on_Login_Page(){
	    // Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.ebay.com/");
		driver.findElement(By.xpath("//*[@id='gh-ug']/a")).click();
	   
	}
	
	

}