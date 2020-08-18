package com.HerokuApp.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import baseModel.TestBase;

public class DynamicControlsPage extends TestBase{
	
	@FindBy(xpath ="//*[@id=\"input-example\"]/button")
	WebElement enableDisableBttn;
	
	@FindBy(id ="message")
	WebElement enabledOrDisabledTxt;
	
	@FindBy(xpath ="//*[@id=\"input-example\"]/input")
	WebElement editField;
	
	public DynamicControlsPage() {
		PageFactory.initElements(driver, this);
	}
	
	public String clickEnable() {
		enableDisableBttn.click();
		WebDriverWait wait = new WebDriverWait(driver,7);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='input-example']/p")));
		return enabledOrDisabledTxt.getText();
	}
	
	public String clickDisable() {
		enableDisableBttn.click();
		WebDriverWait wait = new WebDriverWait(driver,7);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='input-example']/p")));
		return enabledOrDisabledTxt.getText();
	}
	
	public boolean isEditFieldDisabled(){
		editField.sendKeys("testing123#@!");	
		boolean editFieldDisabled = editField.getAttribute("disabled") != null;
		return editFieldDisabled;
	}
}
	

