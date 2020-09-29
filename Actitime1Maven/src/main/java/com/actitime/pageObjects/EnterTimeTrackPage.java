package com.actitime.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EnterTimeTrackPage extends BasePage
{
@FindBy(xpath="//td[text()='Enter Time-Track']")   //store
private WebElement enterTimeTrackEle;

public EnterTimeTrackPage(WebDriver driver)  //parameterised construtor
{
	super(driver);
	PageFactory.initElements(driver, this);  //initialise
}

public WebElement getEnterTimeTrackEle() {
	return enterTimeTrackEle;
}
 

}
