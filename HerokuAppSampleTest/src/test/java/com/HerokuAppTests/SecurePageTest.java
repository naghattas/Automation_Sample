package com.HerokuAppTests;

//import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
//import org.testng.annotations.Test;

import com.HerokuApp.Pages.SecurePage;

import baseModel.TestBase;

public class SecurePageTest extends TestBase {
	
	SecurePage securePage;
	
	public SecurePageTest(){
		super();
	}
	
	@BeforeMethod
	public void setUp(){
		initialization();
		securePage = new SecurePage();	
	}
	
//	@Test(priority=1)
//	public void securePageTitleTest(){
//		String title = securePage.validateSecurePageTitle();
//		Assert.assertEquals(title, "The Internet");
//	}

}
