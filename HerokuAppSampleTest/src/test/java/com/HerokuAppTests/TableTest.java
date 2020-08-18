package com.HerokuAppTests;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.HerokuApp.Pages.TablePage;

import baseModel.TestBase;



public class TableTest extends TestBase{
	
	TablePage tablePage;
	
	public TableTest(){
		super();
	}
	
	@BeforeMethod
	public void setUp(){
		initialization();
		goTablePage();
		tablePage = new TablePage();	
	}
// TODO: still needs work
	@Test(priority=1)
	public void shouldDisplayAtoZList(){
		ArrayList<String> lastNamesAtoZ = tablePage.getElementsListText();
		Collections.sort(lastNamesAtoZ);
		System.out.println(lastNamesAtoZ);

//		assert referenceValues.equals(tableValues);
	}
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}

	

}
