package com.HerokuApp.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;

import baseModel.TestBase;

public class ExitIntentPage extends TestBase {
	
//	@FindBy(css=".modal-title")
//	WebElement modal;
//	
//	@FindBy(css=".modal-footer")
//	WebElement modalFooter;
	
	@FindBy(xpath="//h3[text()='Exit Intent']")
	WebElement exitIntentTxt;
	
	public ExitIntentPage() {
		PageFactory.initElements(driver, this);
	}
	
//	public void dismissModal() throws InterruptedException {
//		WebDriverWait wait = new WebDriverWait(driver, 10);
//		wait.until(ExpectedConditions.visibilityOf(modal)).isDisplayed();
//		modalFooter.click();
//	}
//
//	public boolean isModalDisplayed() {
//		if(modal.isDisplayed()) {
//			return true;
//	    }
//		return false;
//	}
	
	public boolean isExitIntentTxtDisplayed() {		
		boolean flag = exitIntentTxt.isDisplayed();
		return flag;
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

	
	
	

}
