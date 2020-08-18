package com.HerokuAppTests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.HerokuApp.Pages.DynamicControlsPage;


import baseModel.TestBase;

public class DynamicControlsTest extends TestBase{
	
	DynamicControlsPage dynamicControlsPage;
	
	public DynamicControlsTest(){
		super();
	}
	
	@BeforeMethod
	public void setUp(){
		initialization();
		goToDynamicControlsPage();
		dynamicControlsPage = new DynamicControlsPage();	
	}

	@Test(priority=1)
	public void enableAndDisableButtonShould(){
		Assert.assertTrue(dynamicControlsPage.clickEnable().contains("It's enabled!"));
		Assert.assertFalse(dynamicControlsPage.isEditFieldDisabled());
		
		Assert.assertTrue(dynamicControlsPage.clickDisable().contains("It's disabled!"));
		// cannot find where text isDislpayed in attributes to make this next assert
	}

	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}


}
