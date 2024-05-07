package com.DemoBlaze.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.DemoBlaze.qa.base.TestBase;
import com.DemoBlaze.qa.pages.HomePage;
import com.DemoBlaze.qa.pages.LoginPage;

public class HomePageTest extends TestBase{

	LoginPage loginPage;
	HomePage homePage;
	
	public HomePageTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp()
	{
		intialization();
		loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	@Test(priority = 1)
	public void homePageTitleTest()
	{
		String title = homePage.verifyHomePageTitle();
		Assert.assertEquals(title, "STORE");
	}
	@Test(priority = 2)
	public void userNameLogoTest() throws InterruptedException
	{
		boolean flag = homePage.userNameLogo();
		Assert.assertTrue(flag);
	}
	@Test(priority = 3)
	public void aboutUsTest()
	{
		boolean flag = homePage.aboutUs();
		Assert.assertTrue(flag);
	}
	@Test(priority = 4)
	public void aboutUsParaTest()
	{
		boolean flag = homePage.aboutUsPara();
		Assert.assertTrue(flag);
	}
	@Test(priority = 5)
	public void aboutUsLinkTest() throws InterruptedException
	{
		homePage.aboutUsLink();
	}
	
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
}
