package com.DemoBlaze.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.DemoBlaze.qa.base.TestBase;

public class LoginPage extends TestBase{
	
	@FindBy(id = "login2")
	WebElement login_Primary_button;
	
	@FindBy(id = "logInModalLabel")
	WebElement login_Logo;
	
	
	
	
	

	@FindBy(id = "loginusername")
	WebElement username;
	
	@FindBy(id = "loginpassword")
	WebElement password;
	
	@FindBy(xpath = "//button[normalize-space()='Log in']")
	WebElement login_button;
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	public String validateLoginPageTilte()
	{
		return driver.getTitle();
	}
	
	public boolean loginLogo() throws InterruptedException
	{
		login_Primary_button.click();
		Thread.sleep(2000);
		return login_Logo.isDisplayed();
	}
	
	public HomePage login(String un, String pwd)
	{
		login_Primary_button.click();
		username.sendKeys(un);
		password.sendKeys(pwd);
		login_button.click();
		
		return new HomePage();
		
	}
}
