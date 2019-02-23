package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.qa.Util.TestUtil;
import com.qa.base.Testbase;

public class LoginPage extends Testbase {

	@FindBy(name="username")
	WebElement user;
	
	@FindBy(name="password")
	WebElement pwd;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement submitBtn;
	
	@FindBy(xpath="(//input[@value=''])[2]")
	WebElement searchInput;
	
	public LoginPage(){
		PageFactory.initElements(driver, this);
	}
	
	public String validateTitle(){
		return driver.getTitle();
	}
	
	public void enterCredential(String un, String pass){
		user.sendKeys(un);
		pwd.sendKeys(pass);
		submitBtn.click();
		TestUtil.ElementisPresent(searchInput);
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
