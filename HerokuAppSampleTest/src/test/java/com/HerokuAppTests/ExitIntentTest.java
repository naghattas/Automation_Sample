package com.HerokuAppTests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.HerokuApp.Pages.ExitIntentPage;

import baseModel.TestBase;

public class ExitIntentTest extends TestBase{
	
	ExitIntentPage exitIntentPage;
	
	public ExitIntentTest(){
		super();
	}
	
	@BeforeMethod
	public void setUp(){
		initialization();
		goExitIntentPage();
		exitIntentPage = new ExitIntentPage();	
	}
	
//	@Test(priority=1)
//	public void modalShouldDisplay(){
//		boolean flag = exitIntentPage.isModalDisplayed();
//		Assert.assertTrue(flag);
//	}
	
//	@Test(priority=1)
//	public void isModalVisibleAfterClose() throws InterruptedException{
//		exitIntentPage.dismissModal();
//		boolean flag = exitIntentPage.isModalDisplayed();
//		Assert.assertFalse(flag);
//	}
	
	@Test(priority=1)
	public void exitIntentTxtIsDisplayed(){
		Assert.assertTrue(exitIntentPage.isExitIntentTxtDisplayed());
	}
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
	

}
