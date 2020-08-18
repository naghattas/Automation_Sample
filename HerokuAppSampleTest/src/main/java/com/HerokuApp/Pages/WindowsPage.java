package com.HerokuApp.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseModel.TestBase;

public class WindowsPage extends TestBase{
	
	@FindBy(xpath="//*[@id=\"content\"]/div/a")
	WebElement ClickHereBttn;
	
	public WindowsPage() {
		PageFactory.initElements(driver, this);
	}
	
//	public String validateLoginPageTitle() {
//		return driver.getTitle();
//	}

	public NewWindowPage clickHere() {
		ClickHereBttn.click();
		
		return new NewWindowPage();
	}
	
	
//	public ArrayList<String> getElementsListText() {
//		List<WebElement> elements = driver.findElements(By.cssSelector("#table1 tr td:nth-child(1)"));
//		for (WebElement element : elements) {
//		    System.out.println(element.getText()); 
//	}
	  

}
