package com.HerokuAppTests;


import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.HerokuApp.Pages.NewWindowPage;
import com.HerokuApp.Pages.WindowsPage;

import baseModel.TestBase;


public class WindowsTest extends TestBase{
	
	WindowsPage windowsPage;
	NewWindowPage newWindowPage;
	
	public WindowsTest(){
		super();
	}
	
	@BeforeMethod
	public void setUp(){
		initialization();
		goWindowsPage();
		windowsPage = new WindowsPage();
		newWindowPage = new NewWindowPage();
	}
	@Test(priority=1)
	public void shouldClickToOpenNewWindow(){
		windowsPage.clickHere();
		Assert.assertTrue(newWindowPage.getNewWinowHandle());
	}
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}


}
