package com.actitime.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OpenTaskPage 
{
@FindBy(linkText="Projects & Customers")
private WebElement projCustLink;

@FindBy(xpath="//input[@value='Create New Tasks']")
private WebElement createNewTaskBtn;

@FindBy(css="input[name^='taskSelected']")
private WebElement selectTaskChkBx;

@FindBy(xpath="//input[@value='Complete Selected Tasks']")
private WebElement completeSelectedTaskBtn;

@FindBy(linkText="Completed Tasks")
private WebElement completedTaskLink;


public OpenTaskPage(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}


public WebElement getSelectTaskChkBx() {
	return selectTaskChkBx;
}


public WebElement getCompleteSelectedTaskBtn() {
	return completeSelectedTaskBtn;
}


public WebElement getCompletedTaskLink() {
	return completedTaskLink;
}


public WebElement getProjCustLink() {
	return projCustLink;
}


public WebElement getCreateNewTaskBtn() {
	return createNewTaskBtn;
}

  public void moveToCompletedTask()
  {
	  if(selectTaskChkBx.isSelected())
	  {
      }else
      {
    	  selectTaskChkBx.click();
      }
	 
	  completeSelectedTaskBtn.click();
}
  
}
  
  
  
