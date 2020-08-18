package com.HerokuApp.Pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;

import baseModel.TestBase;

public class TablePage extends TestBase{
	
	@FindBy(css="#table1 tr td:nth-child(1)")
	WebElement lastNameList;
	
	@FindBy(xpath="//table[@id='table1']//span[contains(.,'Last Name')]")
	WebElement ColumnName;
	
	
	public TablePage() {
		PageFactory.initElements(driver, this);
	}
	
	public ArrayList<String> getElementsListText() {
		List<WebElement> elements = driver.findElements(By.cssSelector("#table1 tr td:nth-child(1)"));
		for (WebElement element : elements) {
		    System.out.println(element.getText()); 
	}
	  
	
//	public List<String> getElementsListText(List<WebElement> elementList) {
//        List<String> elementListText = new ArrayList<String>();
//        for(WebElement element : elementList){
//            String elementText = getWebElementAttribute(element, "innerText");
//            elementListText.add(elementText);
//        }
//        return elementListText;
//        System.out.println(elementListText);
//    }
//	
//
//    public String getWebElementAttribute(WebElement element, String attribute) {
//			return lastNameList.getAttribute(attribute);
//		}
//    }


	
	
}
