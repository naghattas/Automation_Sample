package com.HerokuApp.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseModel.TestBase;

public class SecurePage extends TestBase {
	
	@FindBy(css="#flash")
	WebElement HeaderText;
	
	@FindBy(css="#password")
	WebElement Password;
	
	@FindBy(css="button[type='submit']")
	WebElement LoginBttn;
	
	
	
	public SecurePage() {
		PageFactory.initElements(driver, this);
	}

	public String validateSecurePageTitle() {
		return driver.getTitle();
	}
	
	public String getTextSecureArea() {
        return HeaderText.getText();
    }
	
	

}
