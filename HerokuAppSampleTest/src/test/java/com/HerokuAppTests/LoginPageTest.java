package com.HerokuAppTests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.HerokuApp.Pages.LoginPage;
import com.HerokuApp.Pages.SecurePage;

import baseModel.TestBase;

public class LoginPageTest extends TestBase {
	
	LoginPage loginPage;
	SecurePage securePage;
	
	public LoginPageTest(){
		super();
	}
	
	@BeforeMethod
	public void setUp(){
		initialization();
		goToLoginPage();
		loginPage = new LoginPage();	
	}

	@Test(priority=1)
	public void loginPageTitleTest(){
		String title = loginPage.validateLoginPageTitle();
		Assert.assertEquals(title, "The Internet");
	}
	
		@Test(priority=2)
		public void loginTestShould() throws InterruptedException{
			securePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
			Thread.sleep(1000);
			String displaySecureText = securePage.getTextSecureArea();
			Assert.assertTrue(displaySecureText.contains("You logged into a secure area!"));
		}
		
		@Test(priority=3)
		public void failedLoginTestShould() throws InterruptedException{
			loginPage.login(prop.getProperty("badUsername"), prop.getProperty("badPassword"));
			String displayErrorMssg = loginPage.getLoginErrortext();
			Assert.assertTrue(displayErrorMssg.contains("Your username is invalid!"));
		}

	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}

}

