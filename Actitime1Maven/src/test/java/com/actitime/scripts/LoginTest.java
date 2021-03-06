package com.actitime.scripts;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.actitime.generic.BaseLib;
import com.actitime.generic.ExcelLib;
import com.actitime.pageObjects.EnterTimeTrackPage;
import com.actitime.pageObjects.LoginPage;

public class LoginTest extends BaseLib     //through Baselib class we utilise global driver..that 
{                                //contains instance of an Object that is why we inherit baselib
@Test(priority=1, groups= {"Smoke"})
public void validLogin()
{
	String filepath="./testdata/testdata.xlsx";
	ExcelLib elib= new ExcelLib(filepath);
	String username = elib.readData("Sheet1", 1, 1);
	String password = elib.readData("Sheet1", 1, 2);
	LoginPage lp= new LoginPage(driver);
	lp.login(username, password);
	
	       //OR
	
//	lp.getUnTxtBx().sendKeys(username);
//	lp.getPwdTxtBx().sendKeys(password);
//	lp.getLoginBtn().click();
	
	EnterTimeTrackPage ettp = new EnterTimeTrackPage(driver);
	Assert.assertTrue(ettp.getEnterTimeTrackEle().isDisplayed());
	
	String expectedHomePageTitle="actiTIME - Enter Time-Track"; //this found from inspect ele ke header me jake bilkul top pe
	String actualHomePageTitle= driver.getTitle();
	Assert.assertEquals(actualHomePageTitle, expectedHomePageTitle);
	Reporter.log("Home Page is verified", true);
		
}     
     @Test(priority=2, groups= {"Functional"})
     public void invalidLogin()
     {
    	 String filepath="./testdata/testdata.xlsx";
    		ExcelLib elib= new ExcelLib(filepath);
    		String username = elib.readData("Sheet1", 2, 1);
    		String password = elib.readData("Sheet1", 2, 2);
    		
    		LoginPage lp= new LoginPage(driver);
    		lp.login(username, password);
    		
    	 String expectedMsg="Username or Password is invalid. Please try again.";
    	 String actualMsg=lp.getInvalidLoginMsgEle().getText();
    	 Assert.assertEquals(actualMsg, expectedMsg);
     }


}
 