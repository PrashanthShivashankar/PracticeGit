package com.practice.TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

/*
 * Different types of TestNG Assertion
 * Hardassert and softassert
 * Hardassert - if assert is failed i won'y exceute further
 * Softassert - if assert is failed, it will continue with next assertion ---- assertAll() method
 * 
 */
public class TestNGAssertion 
{

	@Test
	public void testSoft()
	{
		SoftAssert assertion=new SoftAssert();
		System.out.println("TEst1 started==");
		assertion.assertEquals(12, 12);
		System.out.println("Test1 Completes==");
		assertion.assertAll();
		
		
	}
	@Test
	public void testhard()
	{
		System.out.println("Test2 Started==");
		Assert.assertTrue(true);
		System.out.println("TEst2 completes==");
	}
	@Test
	public void VerifyTitle()
	{
		System.setProperty("webdriver.chrome.driver", "F:\\Salenium- Leaaring-Software\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		
		driver.get("https://www.google.co.in");
		Assert.assertEquals(driver.getTitle(), driver.getTitle());
		driver.close();
	}
	
}
