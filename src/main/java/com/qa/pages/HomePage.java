package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.Testbase;

public class HomePage extends Testbase {

	@FindBy(id="customloginlink")
	WebElement LoginBtn;
	
		
	public HomePage(){
		PageFactory.initElements(driver, this);
	}
	
	public String validateTitle(){
		return driver.getTitle();
	}
	
	public LoginPage clickSign(){
		LoginBtn.click();
		return new LoginPage();
	}	
}
