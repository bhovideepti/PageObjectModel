package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.Testbase;

public class HomePage2 extends Testbase {

	@FindBy(linkText="Login/Register")
	WebElement LoginBtn;
	
		
	public HomePage2(){
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
