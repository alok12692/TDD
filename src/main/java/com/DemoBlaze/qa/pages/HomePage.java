package com.DemoBlaze.qa.pages;

import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.DemoBlaze.qa.base.TestBase;

public class HomePage extends TestBase{

	@FindBy(id = "nameofuser")
	WebElement userNameLabel;
	
	@FindBy(xpath = "//b[normalize-space()='About Us']")
	WebElement AboutUs;
	
	@FindBy(xpath = "//p[contains(text(),'We believe performance needs to be validated at ev')]")
	WebElement AboutUsPara;
	
	@FindBy(xpath = "//a[normalize-space()='About us']")
	WebElement AboutUsLink;
	
	@FindBy(xpath = "//video[@class='vjs-tech']")
	WebElement AboutUsVideo;
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	public String verifyHomePageTitle()
	{
		return driver.getTitle();
	}
	
	public boolean userNameLogo() throws InterruptedException
	{
		Thread.sleep(2000);
		return userNameLabel.isDisplayed();
	}
	
	public boolean aboutUs()
	{
		return AboutUs.isDisplayed();
	}
	
	public boolean aboutUsPara()
	{
		return AboutUsPara.isDisplayed();
	}
	
	public void aboutUsLink() throws InterruptedException
	{
		Thread.sleep(2000);
		AboutUsLink.click();
		Thread.sleep(2000);
		List<WebElement> video = (List<WebElement>) AboutUsVideo;
		video.get(0).click();
	}
	
	
}
