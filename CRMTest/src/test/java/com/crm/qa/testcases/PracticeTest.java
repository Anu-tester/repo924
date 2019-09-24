package com.crm.qa.testcases;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.crm.qa.base.BaseClass;
import com.crm.qa.pages.PracticePage;

public class PracticeTest extends BaseClass {
	public static Logger log= LogManager.getLogger(LoginPageTest.class);
	PracticePage practice;
	

	public PracticeTest() {
		super();
	}

//	@BeforeTest
//	public void setup() {
//
//		initialization();
//		practice = new PracticePage();
//		
//
//	}

//	@Test(priority = 0)
//	public void practiceclick() {
//
//		practice.practiceclick();
//		// driver.quit();
//	}
//
//	@Test(priority = 1)
//	public void checkradiobutton() {
//		practice.r1selected();
//		practice.r2selected();
//		practice.r3selected();
//	}
//
//	@Test(priority = 2)
//	public void checkbox() {
//		practice.checkboxselected();
//	}
//
//	@Test(priority = 3)
//	public void staticdropdown() {
//		practice.staticselect();
//		driver.close();
//	}

	@Test(priority = 4)
	public void dynamicdropdown() {
		log.trace("dynamic drop");
		System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.spicejet.com"); // URL in the browser
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();

		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		
		
		
		driver.findElement(By.xpath("//a[@value='BLR']")).click();
		driver.findElement(By.xpath("//a[@value='MAA']")).click();
		//driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_originStation1_CTXT'] //a[@value='MAA']")).click();
		driver.quit();
	}
	
//	driver.findElement(By.xpath("//a[@value='BLR']")).click();
//
//	// driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();
//
//	driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']"))
//			.click();
//
//	//driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();
////	driver.close();
//	driver.quit();
}
