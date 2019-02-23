package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.Testbase;

public class LearningPage extends Testbase{
	
	@FindBy(id="menubar_quickCreate")
	WebElement quickCreate;
	
	@FindBy(xpath="(.//*[normalize-space(text()) and normalize-space(.)='Create'])[1]/following::div[12]")
	WebElement quickContact;
	
	public LearningPage(){
		PageFactory.initElements(driver, this);
	}

}
