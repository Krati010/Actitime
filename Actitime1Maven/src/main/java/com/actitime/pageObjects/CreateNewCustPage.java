package com.actitime.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateNewCustPage 
{
@FindBy(name="name")
private WebElement custNameTxtBx;

@FindBy(id="active_customers_action")
private WebElement activeProjCustRadioBtn;

@FindBy(name="createCustomerSubmit")
private WebElement createCustomerBtn;


public CreateNewCustPage(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}


public WebElement getCustNameTxtBx() {
	return custNameTxtBx;
}


public WebElement getActiveProjCustRadioBtn() {
	return activeProjCustRadioBtn;
}


public WebElement getCreateCustomerBtn() {
	return createCustomerBtn;
}

public void createCustomer(String customerName)
{
	custNameTxtBx.sendKeys(customerName);
	if(activeProjCustRadioBtn.isSelected()) //true
	{
		
	}
	else
	{
		activeProjCustRadioBtn.click();
	}
	
	createCustomerBtn.click();
}
}
