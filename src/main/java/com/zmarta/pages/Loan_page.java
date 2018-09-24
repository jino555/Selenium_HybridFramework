package com.zmarta.pages;


import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;

	

import com.zmarta.base.basetest;
import com.zmarta.utils.TestUtil;


public class Loan_page extends basetest {

	
	String url = pro.getProperty("url");
	 
	//POM with PageFactory
	 
	 @FindBy (xpath = "//a[@class='account_icon']")
	 @CacheLookup
	 WebElement account_link;
	 
	 
	 @FindBy (how=How.XPATH , using=".//*[@id='log']g")
	 @CacheLookup
	 WebElement username;
	 
	 
	 @FindBy (id = "pwd")
	 WebElement password;
	 
	 
	 @FindBy (id = "login")
	  WebElement submit_button;
	 
	 @FindBy (xpath ="//img[@alt='home']")
	  WebElement logo;
			 
			 
	 //Intialising PageObjects
	 
	 public Loan_page() {
		 
		 PageFactory.initElements(driver, this);
		 
		 
	 }
	
	 
	 //Actions
	 
	 
	 public  void Login(String un, String pw) throws IOException {
		
		 
	   
		
			
		 basetest.childtest.info("Navigated to " +url);
			
			   account_link.click();
			  basetest.childtest.info("Account clicked");
			
			username.sendKeys(un);
			basetest.childtest.info("username entered " +un);
			
			password.sendKeys(pw);
			 basetest.childtest.info("Password entered  "+pw);
		
		
			  basetest.childtest.pass("Login Scenario passed");
		
		 

			
		 
		 
		
		
		
	 }
	 
	 
	 
	 
	 public boolean logo () {
		 
		 
    
	 boolean flag = logo.isDisplayed();
	 basetest.childtest.info("Logo is Verified");
	 basetest.childtest.pass("Logo Scenario Passed");
	 return flag;
	
	 }
	 
	 
	 
	 
	 
	 @AfterTest
	  public void afterTest() {
			 
	 // extent.flush();
	  
	}
	 
	 
	 
	 
}
 

 


