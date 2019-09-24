package com.crm.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.crm.qa.base.BaseClass;

public class PracticePage extends BaseClass{

	
	@FindBy(css="#homepage > header > div.navbar.navbar-default.navbar-static-top > div > nav > ul > li:nth-child(5) > a")
	WebElement practice;

	@FindBy(xpath="//*[@id=\'radio-btn-example\']/fieldset/label[1]/input")
	WebElement radiobutton1;
	
	@FindBy(xpath="//*[@id=\'radio-btn-example\']/fieldset/label[2]/input")
	WebElement radiobutton2;
	
	@FindBy(xpath="//*[@id=\'radio-btn-example\']/fieldset/label[3]/input")
	WebElement radiobutton3;
	
	@FindBy(id="checkbox-example")
	WebElement checkbox;
	
	@FindBy(id="checkBoxOption1")
	WebElement ch1;
	
	@FindBy(id="checkBoxOption2")
	WebElement ch2;
	
	@FindBy(id="checkBoxOption3")
	WebElement ch3;
	
	@FindBy(id="dropdown-class-example")
	WebElement stsel;
	
	public PracticePage() {
		PageFactory.initElements(driver, this);
	}

	public void practiceclick() {
		practice.click();
	}
	
	public void r1selected() {
		radiobutton1.click();
		Assert.assertTrue(radiobutton1.isSelected());
		System.out.println("radio button 1 -  "+radiobutton1.isSelected());
	}
	public void r2selected() {
		radiobutton2.click();
		Assert.assertTrue(radiobutton2.isSelected());
		System.out.println("radio button 2 -  "+radiobutton2.isSelected());
	}
	public void r3selected() {
		radiobutton3.click();
		Assert.assertTrue(radiobutton3.isSelected());
		System.out.println("radio button 3 -  "+radiobutton3.isSelected());
	}
	
	//Selecting Checkbox and using isSelected Method		
    					
    public void checkboxselected() {						
   											
        ch1.click(); 			
        System.out.println("Checkbox Status is -  "+ch1.isSelected());
        System.out.println("Checkbox Status is -  "+ch2.isSelected());
        System.out.println("Checkbox Status is -  "+ch3.isSelected());
    	
    }
    
    public void staticselect() {
    	Select select=new Select(stsel);
    	select.selectByValue("option1");
    	select.selectByIndex(2);
    	select.selectByVisibleText("Option3");
    	
    	
    }
}
