package com.qa.tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.base.Testbase;
import com.qa.pages.HomePage;
import com.qa.pages.LoginPage;

public class LoginTest extends Testbase{
	
	LoginPage loginPage;
	HomePage homePage;
	
	public LoginTest(){
		super();
	}
	
	@BeforeMethod
	public void setUp(){
		initialization();
		loginPage = new LoginPage();
		homePage = new HomePage();
		homePage.clickSign();
	}
	
		
	@Test(priority=1)
	public void validateLogin(){		
		String title = loginPage.validateTitle();
		Assert.assertTrue(title.contains("Login"));
	}
	
	@Test(priority=2)
	public void loginwithcredential(){		
		loginPage.enterCredential(prop.getProperty("username"), prop.getProperty("password"));
		
	}
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
	
}
