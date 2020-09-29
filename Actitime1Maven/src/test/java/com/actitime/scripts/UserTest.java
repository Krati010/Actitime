package com.actitime.scripts;

import org.testng.annotations.Test;

import com.actitime.generic.BaseLib;
import com.actitime.generic.ExcelLib;
import com.actitime.pageObjects.CreateNewUserPage;
import com.actitime.pageObjects.EnterTimeTrackPage;
import com.actitime.pageObjects.LoginPage;
import com.actitime.pageObjects.UserListPage;

public class UserTest extends BaseLib
{
  @Test
  public void userCreateTask()
  {
	  String filepath="./testdata/testdata.xlsx";
	  ExcelLib elib= new ExcelLib(filepath);
	  
	  String username = elib.readData("Sheet1", 4, 1 );
	  String password = elib.readData("Sheet1", 4, 2);
	  String username2 = elib.readData("Sheet1", 4, 3);
	  String password2 = elib.readData("Sheet1", 4, 4);
	  String retypPassword = elib.readData("Sheet1", 4, 5);
	  String firstName = elib.readData("Sheet1", 4, 6);
	  String lastName = elib.readData("Sheet1", 4, 7);
	  String email = elib.readData("Sheet1", 4, 8);
	  
	  LoginPage lp = new LoginPage(driver);
	  lp.login(username, password);
	  
	  EnterTimeTrackPage ettp= new EnterTimeTrackPage(driver);
	  ettp.getUserEle().click();
	  
	  UserListPage ul= new UserListPage(driver);
	  ul.getCreateNewUserBtn().click();
	  
	  CreateNewUserPage cnup=new CreateNewUserPage(driver);
	  cnup.createUser(username2, password2, retypPassword, firstName, lastName, email);
	  
	  ul.getLogoutBtn().click();
	  
	  
	  
	  
	  
	  
			  





	  		
  }
}
