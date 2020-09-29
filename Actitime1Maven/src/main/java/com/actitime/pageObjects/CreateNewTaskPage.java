package com.actitime.pageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CreateNewTaskPage
{
  @FindBy(name="customerId")
  private WebElement customerDrpDwn;
  
  @FindBy(name="projectId")
  private WebElement projectDrpDwn;
  
  @FindBy(css="input[name*='.name']")
  private List<WebElement> taskNameTxtBx;
  
  @FindBy(css="select[name*='.billingType']")
  private List<WebElement> billingTypeDrpDwn;
  
  @FindBy(css="input[name*='markedToBeAddedToUserTasks']")
  private List<WebElement> addMyTimeTrackCheckBox;
  
  @FindBy(xpath="//input[@value='Create Tasks']")
  private WebElement createTaskBtn;
  
  public CreateNewTaskPage(WebDriver driver)
  {
	  PageFactory.initElements(driver, this);
  }

public WebElement getCustomerDrpDwn() {
	return customerDrpDwn;
}

public WebElement getProjectDrpDwn() {
	return projectDrpDwn;
}

public List<WebElement> getTaskNameTxtBx() {
	return taskNameTxtBx;
}

public List<WebElement> getBillingTypeDrpDwn() {
	return billingTypeDrpDwn;
}

public List<WebElement> getAddMyTimeTrackCheckBox() {
	return addMyTimeTrackCheckBox;
}

public WebElement getCreateTasksBtn() {
	return createTaskBtn;
}
  
public void createSingleTask(String customerName, String projectName, String taskName, String billingType)
  
  {
	  Select sel=new Select(customerDrpDwn);
	  sel.selectByVisibleText(customerName);
	  
	  Select sel2= new Select(projectDrpDwn);
	  sel2.selectByVisibleText(projectName);
	  
	  taskNameTxtBx.get(0).sendKeys(taskName);
	  Select sel3= new Select(billingTypeDrpDwn.get(0));
	  sel3.selectByVisibleText(billingType);
	  
	  
	  WebElement chkBx = addMyTimeTrackCheckBox.get(0);
	  if(chkBx.isSelected())
	  {
		  
	  }else
	  {
		  chkBx.click();
	  }
	  
	  createTaskBtn.click();
			  		  
  }
  
  
}

