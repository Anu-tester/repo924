package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.crm.qa.base.BaseClass;

public class LoginPage extends BaseClass {

	@FindBy(linkText = "Login")
	WebElement login;

	@FindBy(linkText = "NO THANKS")
	WebElement alertbox;

	@FindBy(id = "user_email")
	WebElement username;

	@FindBy(id = "user_password")
	WebElement password;
	
	@FindBy(name="commit")
	WebElement commit;
	
	@FindBy(className="gravatar")
	WebElement avatar;
	
	@FindBy(className="user-signout")
	WebElement logout;

	public LoginPage() {
		PageFactory.initElements(driver, this);
	}

	public String LoginPageTitle() {
		return driver.getTitle();
	}

	public void alertbox() {

		boolean alert = (alertbox.isDisplayed());
		if (alert == true) {
			alertbox.click();
		}
	}

	public void loginclick() {
		login.click();
	}

	public void logintext(String lg, String pwd) {
		username.sendKeys(lg);
		password.sendKeys(pwd);
		commit.click();

	}
	public void logout() {
		avatar.click();
		logout.click();
	}

}
