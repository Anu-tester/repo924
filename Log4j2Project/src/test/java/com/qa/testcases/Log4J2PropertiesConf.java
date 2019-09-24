package com.qa.testcases;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Log4J2PropertiesConf {

	public static WebDriver driver;
	
	    public static Logger logger = LogManager.getLogger(Log4J2PropertiesConf.class);
	    
	    @Test(priority=0)
	    public void performSomeTask(){
	    	logger.trace("This is trace message");
	        logger.debug("This is a debug message");
	        logger.info("This is an info message");
	        logger.warn("This is a warn message");
	        logger.error("This is an error message");
	        logger.fatal("This is a fatal message");
	        
	    }
	    @Test(priority=1)
	    public void dynamicdropdown() throws IOException  {
	    	
	    	System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("https://www.spicejet.com"); // URL in the browser
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();

			driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
			
			//takescreenshot("before error");
			
			driver.findElement(By.xpath("//a[@value='BLR']")).click();
			driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_destinationStation1_TNR'] //a[@value='MAA']")).click();
			//driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();
			//driver.quit();
			
	    }
	    
//	    public void takescreenshot(String filename)  {
//	    	File file=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//		
//				try {
//					FileUtils.copyFile(file, new File("C:/Users/Anu/Ecommercenew/Log4j2Project/screenshots/" + filename+".png"));
//				} catch (IOException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//			
//				
//	    }
	    
	    public static String screenshot(String name) throws IOException {
	    	TakesScreenshot ts=	(TakesScreenshot) driver;
	    	File source=ts.getScreenshotAs(OutputType.FILE);
	    	String dest=System.getProperty("user.dir")+"/screenshots/"+name+".png";
	    	File destination=new File(dest);
	    	FileUtils.copyFile(source, destination);
	    	Date objDate = new Date();
	    	logger.error(dest+objDate.toString());
			return dest;
	    	
	    }

	
}
