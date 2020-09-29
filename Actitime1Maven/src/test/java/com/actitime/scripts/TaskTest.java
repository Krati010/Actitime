package com.actitime.scripts;

import org.testng.annotations.Test;

import com.actitime.generic.BaseLib;
import com.actitime.generic.ExcelLib;
import com.actitime.pageObjects.ActiveProjCustPage;
import com.actitime.pageObjects.CompletedTaskPage;
import com.actitime.pageObjects.CreateNewCustPage;
import com.actitime.pageObjects.CreateNewProjectPage;
import com.actitime.pageObjects.CreateNewTaskPage;
import com.actitime.pageObjects.EnterTimeTrackPage;
import com.actitime.pageObjects.LoginPage;
import com.actitime.pageObjects.OpenTaskPage;

public class TaskTest extends BaseLib
{
	
	@Test
	public void checkCompletedTask()
	{
  String filepath="./testdata/testdata.xlsx";
  ExcelLib elib= new ExcelLib(filepath);
  
 String username= elib.readData("Sheet1", 3, 1);
 String password=elib.readData("Sheet1", 3, 2);
 String customerName=elib.readData("Sheet1", 3, 3);
 String projectName= elib.readData("Sheet1", 3, 4);
 String taskName= elib.readData("Sheet1", 3, 5);
 String billingType=elib.readData("Sheet1", 3, 6);
 
 LoginPage lp=new LoginPage(driver);
 lp.login(username, password);
 
 EnterTimeTrackPage ettp=new EnterTimeTrackPage(driver);
 ettp.getTaskEle().click();
 
 OpenTaskPage otp= new OpenTaskPage(driver);
 otp.getProjCustLink().click();
 
 ActiveProjCustPage apcp= new ActiveProjCustPage(driver);
 apcp.getCreateNewCustBtn().click();
 
 
 CreateNewCustPage cncp= new CreateNewCustPage(driver);
 cncp.createCustomer(customerName);

 apcp.getCreateNewProjBtn().click();
 
 CreateNewProjectPage cnpp=new CreateNewProjectPage(driver);
 cnpp.createNewProject(customerName, projectName);
 
 apcp.getOpenTaskBtn().click();
 
 otp.getCreateNewTaskBtn().click();
 
 CreateNewTaskPage cntp=new CreateNewTaskPage(driver);
 cntp.createSingleTask(customerName, projectName, taskName, billingType);
 
 otp.moveToCompletedTask();
 
 otp.getCompletedTaskLink().click();
 
 CompletedTaskPage ctp=new CompletedTaskPage(driver);
 ctp.validateCompletedTask(customerName, projectName, taskName);
 
}
}
 
 
 
  

