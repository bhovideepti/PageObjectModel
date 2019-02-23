package com.qa.tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.base.Testbase;
import com.qa.pages.HomePage;


public class HomePageTest extends Testbase{
	
	HomePage homePage;
	
	public HomePageTest(){
		super();
	}

	@BeforeMethod
	public void setUp(){
		initialization();
		homePage = new HomePage();
	}
	
	@Test
	public void validateTile(){
		String title = homePage.validateTitle();
		System.out.println(title);
		Assert.assertTrue(title.contains("CRM"));
	}
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
	
}
