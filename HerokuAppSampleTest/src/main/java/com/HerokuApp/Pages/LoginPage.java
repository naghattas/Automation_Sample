package com.HerokuApp.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseModel.TestBase;


public class LoginPage extends TestBase {
	
	@FindBy(css="#username")
	WebElement UserName;
	
	@FindBy(css="#password")
	WebElement Password;
	
	@FindBy(css="button[type='submit']")
	WebElement LoginBttn;
	
	@FindBy(css="#flash")
	WebElement errorMssgInvalidLogin;
	
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	public String validateLoginPageTitle() {
		return driver.getTitle();
	}

	public SecurePage login(String user, String pass){
		UserName.sendKeys(user);
		Password.sendKeys(pass);
		// Thread.sleep(3000);
		LoginBttn.click();
		
		return new SecurePage();
	}

	public String getLoginErrortext() {
		return errorMssgInvalidLogin.getText();
	}

}	
