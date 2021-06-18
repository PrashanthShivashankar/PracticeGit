package com.practice.TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestNGDependency 
{
	@BeforeClass
	public void startBrowser()
	{
		System.out.println("Browser started====");
	}
	@Test
	public void startApp()
	{
		System.out.println("Starting app");
		Assert.assertEquals(12, 12);
	}

	@Test(dependsOnMethods="startApp")
	public void loginApp()
	{
		System.out.println("Login into app");
	}

	@Test
	public void logoutApp()
	{
		System.out.println("logout app");
	}
	
	@Test(priority=1,description="verify the title of the page")
	public void verifyApplicationTitle()
	{
		System.setProperty("webdriver.chrome.driver", "F:\\Salenium- Leaaring-Software\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		
		
		Assert.assertEquals(driver.getTitle(), "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in");
		
		System.out.println("Testcase completed==");
		driver.quit();
	}
	@AfterClass
	public void closeApp()
	{
		System.out.println("Final line=====");
	}
	

}
