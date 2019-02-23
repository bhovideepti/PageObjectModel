package com.qa.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.qa.Util.TestUtil;

public class JavascriptDate {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "/Users/dbhovi/Downloads/chromedriver/chromedriver.exe");	
		driver = new ChromeDriver(); 
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		
		driver.get("https://www.spicejet.com/");
		Thread.sleep(3000);
		String dav = "22-01-2019";
		
		/*driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.linkText("Gorakhpur (GOP)")).click();
		
		driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXT")).click();
		driver.findElement(By.linkText("Pune (PNQ)")).click();
*/	
	//	WebElement ele =  driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Depart date'])[1]/following::button[1]"));
		WebElement ele =  driver.findElement(By.id("ctl00_mainContent_txt_Fromdate"));
		
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("arguments[0].setAttribute('value','"+dav+"');", ele);
		
		Thread.sleep(4000);
		driver.quit();


	}

}
