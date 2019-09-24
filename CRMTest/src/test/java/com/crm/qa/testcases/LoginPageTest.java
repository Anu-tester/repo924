package com.crm.qa.testcases;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.crm.qa.base.BaseClass;
import com.crm.qa.pages.LoginPage;

public class LoginPageTest extends BaseClass {
	public static Logger log= LogManager.getLogger(LoginPageTest.class);

	LoginPage loginpg;
	
	
	public LoginPageTest() {
		super();
	}
	

	@BeforeTest
	public void setup() {
		log.info("Initializing driver");
		
		initialization();
		loginpg = new LoginPage();

	}

	@Test(priority = 0)
	public void loginpagetitletest() {
		log.debug(loginpg);
		String title = loginpg.LoginPageTitle();
		Assert.assertEquals(title,
				"QA Click Academy | Selenium,Jmeter,SoapUI,Appium,Database testing,QA Training Academy");

	}

	@Test(priority = 1)
	public void login() {
		loginpg.loginclick();
		loginpg.logintext(prop.getProperty("username"), prop.getProperty("password"));
		loginpg.logout();
	}

	@AfterTest
	public void teardown() {
		driver.quit();

	}
}
