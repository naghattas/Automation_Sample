package com.HerokuApp.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseModel.TestBase;

public class NewWindowPage extends TestBase {
	
	@FindBy(className ="example")
	WebElement NewWindowText;
	
	public NewWindowPage() {
		PageFactory.initElements(driver, this);
	}
	
	public String getNewWindowURL() {
		System.out.println(driver.getCurrentUrl());
		return driver.getCurrentUrl();
	}
	
	public boolean getNewWinowHandle() {
		return NewWindowText.isDisplayed();
	}

}
