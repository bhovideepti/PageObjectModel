package com.qa.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.Util.TestUtil;
import com.qa.base.Testbase;
import com.qa.pages.HomePage;
import com.qa.pages.LoginPage;

public class DateTest {
	
	LoginPage loginPage;
	HomePage homePage;
	
	public DateTest(){
		super();
	}
	

	
		
	@Test()
	public void validateLogin() throws InterruptedException{		
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "/Users/dbhovi/Downloads/chromedriver/chromedriver_2.45.exe");	
		driver = new ChromeDriver(); 
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		
		driver.get("https://www.spicejet.com/");
			
	/*	JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("document.getElementById('ctl00_mainContent_view_date1').removeAttribute('readonly',0);");
		WebElement ele =  driver.findElement(By.id("ctl00_mainContent_view_date1"));
		ele.clear();
		ele.sendKeys("23/01");
*/		Thread.sleep(1000);
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.linkText("Gorakhpur (GOP)")).click();
		
		driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXT")).click();
		driver.findElement(By.linkText("Pune (PNQ)")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("23")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();
		Thread.sleep(4000);
		driver.quit();

	}
	
}
