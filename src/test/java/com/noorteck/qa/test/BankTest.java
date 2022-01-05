package com.noorteck.qa.test;

import org.testng.asserts.SoftAssert;

import com.noorteck.qa.pages.HomePage;
import com.noorteck.qa.pages.LoanPage;
import com.noorteck.qa.pages.TransfersPage;
import com.noorteck.qa.utils.CommonUI;
import com.noorteck.qa.utils.ObjInitialize;

public class BankTest extends ObjInitialize {
	HomePage homePageObj;
	TransfersPage trasferPageObject;
	LoanPage loanPageObj;

	public static void main(String[] args) {
		String url = "https://usdemo.vee24.com/#/transactions";
//		CommonUI.openBrowser("chrome");
//		CommonUI.navigate(url);
		BankTest test = new BankTest();
//		test.testCaseOne();
//		CommonUI.quitBrowser();
		CommonUI.openBrowser("chrome");
		CommonUI.navigate(url);
		test.testCaseTwo();
		CommonUI.quitBrowser();
		

	}

	public void testCaseOne() {
		homePageObj = new HomePage();
		trasferPageObject = new TransfersPage();
		homePageObj.clickTransferButton();
		trasferPageObject.clickOriginAccount();
		trasferPageObject.moveToOriginRainyDayAccount();
		trasferPageObject.moveToDestinationAccount();
		trasferPageObject.moveToDestinationInvestingAccount();
		trasferPageObject.enterAmount("1000");
		trasferPageObject.enterSocialSecurity("123435677");
		trasferPageObject.enterATMPin("1235");
		trasferPageObject.clickTransferButton();
		String expectedMessage = "Success! Funds successfully transferred.";
		String actualMessage = trasferPageObject.getMessage();
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals(expectedMessage, actualMessage);
		softAssert.assertAll();
	}

	public void testCaseTwo() {
		homePageObj = new HomePage();
		loanPageObj = new LoanPage();
		homePageObj.clickLoansButton();

		loanPageObj.enterName("John Cena");
		loanPageObj.enterAddress("123 Java Drive");
		loanPageObj.moveToLoanType();
		loanPageObj.moveToLoanTypeRetirment();
		loanPageObj.enterYearsToRepay("2");
		loanPageObj.clickNext();
		loanPageObj.enterAmount("5000");
		loanPageObj.enterMothersMaidenName("Kim");
		loanPageObj.enterSocialSecurity("123456778");
		loanPageObj.clickNextButton2();
		loanPageObj.clickConfirmButton();
		String expectedMessage = "Submission Success!";
		String actualMessage = loanPageObj.getLoanStatusMessage();
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals(expectedMessage, actualMessage);
		softAssert.assertAll();

	}

}

/**
 * -------------------------------------- INSTRUCTIONS
 * --------------------------------------------
 * 
 * ---> Create JAVA CLASS for each page of the application ---> Inspect the
 * elements and store the values ---> Create the class constructor ---> Create
 * the methods
 * 
 * ---> DONT FORGET ***** EACH PAGE CLASS SHOULD INHERIT CommonUI Class
 * ******************* ---> DONT FORGET ***** DECLARE PAGE CLASS OBJECT in
 * CONSTANTS CLASS ******************* ---> DONT FOGET ***** INITIALIZE PAGE
 * CLASS OBJECTS IN ObjInitialize JAVA ClASS ******************* ---> DONT FOGET
 * ***** CHANGE JAVA VERSION TO 1.8 *******************
 * 
 * 
 * 
 * ---> For each test case create a method then call those methods from main
 * method. ---> DONT FORGET ***** Refer to the INSTRUCTION PDF file for the test
 * cases to automate **************
 * 
 * ---> ONCE FINISHED AUTOMATING Create Repository in GitHub and push to GitHub
 * ---> Once pushed add US to the project then send picture in MENTORS GROUP
 * CHAT Crystal: --> Koritzerc23@gmail.com Helen: --> Hnbehining@gmail.com
 * Ahmad: --> a.stanikzai77@gmail.com Fahim: --> NTKBatch5
 * 
 * 
 */