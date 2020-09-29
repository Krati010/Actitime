package com.actitime.pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;

public class CompletedTaskPage
{
   @FindBy(xpath="//table[@class='listTable']")
   private WebElement completedTaskTable;
   
   
   public CompletedTaskPage(WebDriver driver)
   {
	   PageFactory.initElements(driver, this);
   }


   public WebElement getCompletedTaskTable() {
	return completedTaskTable;
}
   public void validateCompletedTask(String customerName, String projectName, String taskName)
   {
	   List<WebElement> rows = completedTaskTable.findElements(By.tagName("tr"));
	   for(int i = 1; i<rows.size(); i++)//list ka mthd size
	   {
		   
		   List<WebElement> cols = rows.get(i).findElements(By.tagName("td"));//list of ele bcz table
if(cols.get(0).getText().equalsIgnoreCase(customerName) && cols.get(1).getText().equalsIgnoreCase(projectName))
  {//if match hua toh under aaye
	WebElement thirdcol = cols.get(2);//third colum me ans..match vala..or validate
	String actualTaskName = thirdcol.findElement(By.tagName("a")).getText();//if both equal//actitime me 3rd cell ka
	Assert.assertEquals(actualTaskName, taskName);//task name given by us in script
	Reporter.log("Completed Task "+taskName+" is verified", true);
	break;
   }
		    	   
	   }
   }
   
}
