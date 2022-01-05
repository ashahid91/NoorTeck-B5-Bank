package com.noorteck.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.noorteck.qa.utils.CommonUI;

public class LoanPage extends CommonUI {

	@FindBy(xpath = "//input[@id='mat-input-0']")
	WebElement nameField;

	@FindBy(xpath = "//input[@id='mat-input-1']")
	WebElement addressField;

	@FindBy(xpath ="//span[@class='mat-select-placeholder ng-tns-c13-5 ng-star-inserted']")
	WebElement loanType;
	@FindBy(xpath = "//span[normalize-space()='Personal']")
	WebElement loanTypePersonal;
	
	@FindBy (xpath="//span[normalize-space()='Investing']")
	WebElement loanTypenInvesting;
	
	@FindBy (xpath="//span[normalize-space()='Retirement']")
	WebElement loanTypeRetirement;
	
	@FindBy (xpath="//span[normalize-space()='Rainy Day']")
	WebElement loanTypeRainyDay;

	@FindBy(xpath = "//input[@id='mat-input-2']")
	WebElement yearsToRepayField;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/mat-sidenav-container[1]/mat-sidenav-content[1]/main[1]/app-loans[1]/div[1]/div[2]/mat-horizontal-stepper[1]/div[2]/div[1]/form[1]/div[1]/button[1]/span[1]")
	WebElement nextButton;

	@FindBy(xpath = "//input[@id='mat-input-3']")
	WebElement amountField;

	@FindBy(xpath = "//input[@id='mat-input-4']")
	WebElement mothersMaidenNameField;

	@FindBy(xpath = "//input[@id='mat-input-5']")
	WebElement socialSecurityNumberField;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/mat-sidenav-container[1]/mat-sidenav-content[1]/main[1]/app-loans[1]/div[1]/div[2]/mat-horizontal-stepper[1]/div[2]/div[2]/form[1]/div[1]/button[2]/span[1]")
	WebElement next2Button;

	@FindBy(xpath = "//button[@class='mat-button cdk-focused cdk-mouse-focused']")
	WebElement backButton;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/mat-sidenav-container[1]/mat-sidenav-content[1]/main[1]/app-loans[1]/div[1]/div[2]/mat-horizontal-stepper[1]/div[2]/div[3]/div[1]/button[1]/span[1]")
	WebElement confirmButton;

	@FindBy(css = "button[class='mat-button cdk-focused cdk-mouse-focused']")
	WebElement back2Button;

	@FindBy(xpath = "//span[normalize-space()='Reset']")
	WebElement resetButton;

	@FindBy(xpath = "//mat-card-title[@class='mat-card-title']")
	WebElement loanMessage;

	public LoanPage() {
		PageFactory.initElements(driver, this);
	}

	public void enterName(String name) {
		enter(nameField, name);
	}

	public void enterAddress(String address) {
		enter(addressField, address);
	}

	public void moveToLoanType() {
		moveToElementAndClick(loanType);
	}
	
	public void moveToLoanTypePersonal() {
		moveToElementAndClick(loanTypePersonal);
	}
	
	public void moveToLoanTypeInvesting() {
		moveToElementAndClick(loanTypenInvesting);
	}
	
	public void moveToLoanTypeRetirment() {
		moveToElementAndClick(loanTypeRetirement);
	}
	
	public void moveToLoanTypeRainyDay() {
		moveToElementAndClick(loanTypeRainyDay);
	}

	public void enterYearsToRepay(String year) {
		enter(yearsToRepayField, year);
	}

	public void clickNext() {
		click(nextButton);
	}

	public void enterAmount(String amount) {
		enter(amountField, amount);
	}

	public void enterMothersMaidenName(String motherName) {
		enter(mothersMaidenNameField, motherName);
	}

	public void enterSocialSecurity(String socialSecurity) {
		enter(socialSecurityNumberField, socialSecurity);
	}

	public void clickNextButton2() {
		click(next2Button);
	}

	public void clickBackButton() {
		click(backButton);
	}

	public void clickConfirmButton() {
		click(confirmButton);
	}

	public void clickBackButton2() {
		click(back2Button);
	}

	public void clickResetButton() {
		click(resetButton);
	}

	public String getLoanStatusMessage() {
		return getText(loanMessage);
	}

}
