package com.actitime.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CreateNewProjectPage 
{
  @FindBy(name="customerId")
  private WebElement customerDrpDwn;
  
  @FindBy(name="name")
  private WebElement projNameTxtBx;
  
  @FindBy(name="createProjectSubmit")
  private WebElement createProjBtn;
  
  public CreateNewProjectPage(WebDriver driver)
  {
	  PageFactory.initElements(driver, this);
  }

public WebElement getCustomerDrpDwn() {
	return customerDrpDwn;
}

public WebElement getProjNameTxtBx() {
	return projNameTxtBx;
}

public WebElement getCreateProBtn() {
	return createProjBtn;
}
  
  public void createNewProject(String customerName, String projectName)
  {
	  Select sel = new Select(customerDrpDwn);
	  sel.selectByVisibleText(customerName);
	  
	  projNameTxtBx.sendKeys(projectName);
	  
	  createProjBtn.click();
	  	  
  }
  
}
