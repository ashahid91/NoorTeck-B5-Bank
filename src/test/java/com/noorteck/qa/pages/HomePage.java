package com.noorteck.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.noorteck.qa.utils.CommonUI;

public class HomePage extends CommonUI {

	
	@FindBy(xpath="//a[@class='ng-star-inserted']//span[@class='label'][normalize-space()='Transfer']")
	WebElement transferButton;
	
	
	@FindBy(xpath="//a[@class='ng-star-inserted']//span[@class='label'][normalize-space()='Loans']")
	WebElement loanButton;
	
	@FindBy(xpath="//a[@class='ng-star-inserted']//span[@class='label'][normalize-space()='LogOut']")
	WebElement logOutButton;
	
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	public void clickTransferButton() {
		click(transferButton);
	}
	
	public void clickLoansButton() {
		click(loanButton);
	}
	
	public void clickLogOutButton() {
		click(logOutButton);
		
	
	}
	
	
}
