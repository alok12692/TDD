package com.DemoBlaze.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.DemoBlaze.qa.base.TestBase;
import com.DemoBlaze.qa.pages.HomePage;
import com.DemoBlaze.qa.pages.LoginPage;

public class LoginPageTest extends TestBase{
	
	LoginPage loginPage;
	HomePage homePage;
	
	public LoginPageTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp()
	{
		intialization();
		loginPage = new LoginPage();
	}
	
	
	@Test(priority = 1)
	public void loginPageTitleTest()
	{
		String title = loginPage.validateLoginPageTilte();
		Assert.assertEquals(title, "STORE");
	}
	
	@Test(priority = 2)
	public void loginLogoTest() throws InterruptedException
	{
		boolean flag = loginPage.loginLogo();
		Assert.assertTrue(flag);
	}
	
	
	@Test(priority = 3)
	public void loginTest()
	{
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}

}
