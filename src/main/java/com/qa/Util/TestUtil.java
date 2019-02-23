package com.qa.Util;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qa.base.Testbase;

public class TestUtil extends Testbase {
	public static long PAGE_LOAD_TIMEOUT = 20;
	public static long IMPLICIT_WAIT = 20;
	
	WebDriverWait wait = new WebDriverWait(driver, 10);
	
	public static void ElementisPresent(WebElement element){
		ExpectedConditions.visibilityOf(element);
	}
}
