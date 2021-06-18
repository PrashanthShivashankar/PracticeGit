package com.practice.TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

/*
 * 
 * TestNg supports Negavitive priority also
 * -3 is less than 1
 */

public class TestNGIntroduction 
{
	
	@Test(priority=1, description="This test case will verify login functionality")
	public void loginApplication()
	{
		System.out.println("Hello this is my first test");
		
		Assert.assertEquals(12,13);
		
	}
	
	/*Creatinng Dependency between testcases
	 * 
	 * 
	 */
	@Test(priority=2, description="This test case will verify logout functionality")
	public void loginApplication1()
	{
		System.out.println("Hello this is my Second test");
		
	}
	@Test(priority=3, description="This test case will verify add functionality")
	public void loginApplication2()
	{
		System.out.println("Hello this is my third test");
		
	}

}
