package com.noorteck.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.noorteck.qa.utils.CommonUI;

public class LoanPage extends CommonUI {

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/mat-sidenav-container[1]/mat-sidenav-content[1]/main[1]/app-loans[1]/div[1]/div[2]/mat-horizontal-stepper[1]/div[2]/div[1]/form[1]/mat-form-field[1]/div[1]/div[1]/div[1]/input[1]")
	WebElement nameField;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/mat-sidenav-container[1]/mat-sidenav-content[1]/main[1]/app-loans[1]/div[1]/div[2]/mat-horizontal-stepper[1]/div[2]/div[1]/form[1]/mat-form-field[2]/div[1]/div[1]/div[1]/input[1]")
	WebElement addressField;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/mat-sidenav-container[1]/mat-sidenav-content[1]/main[1]/app-loans[1]/div[1]/div[2]/mat-horizontal-stepper[1]/div[2]/div[1]/form[1]/mat-form-field[3]/div[1]/div[1]/div[1]")
	WebElement loanType;
	
	@FindBy(xpath = "/html[1]/body[1]/div[4]/div[2]/div[1]/div[1]/div[1]/mat-option[2]/span[1]")
	WebElement loanTypePersonal;
	
	@FindBy (xpath="/html[1]/body[1]/div[4]/div[2]/div[1]/div[1]/div[1]/mat-option[3]/span[1]")
	WebElement loanTypenInvesting;
	
	@FindBy (xpath="/html[1]/body[1]/div[4]/div[2]/div[1]/div[1]/div[1]/mat-option[4]/span[1]")
	WebElement loanTypeRetirement;
	
	@FindBy (xpath="/html[1]/body[1]/div[4]/div[2]/div[1]/div[1]/div[1]/mat-option[5]/span[1]")
	WebElement loanTypeRainyDay;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/mat-sidenav-container[1]/mat-sidenav-content[1]/main[1]/app-loans[1]/div[1]/div[2]/mat-horizontal-stepper[1]/div[2]/div[1]/form[1]/mat-form-field[4]/div[1]/div[1]/div[1]/input[1]")
	WebElement yearsToRepayField;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/mat-sidenav-container[1]/mat-sidenav-content[1]/main[1]/app-loans[1]/div[1]/div[2]/mat-horizontal-stepper[1]/div[2]/div[1]/form[1]/div[1]/button[1]/span[1]")
	WebElement nextButton;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/mat-sidenav-container[1]/mat-sidenav-content[1]/main[1]/app-loans[1]/div[1]/div[2]/mat-horizontal-stepper[1]/div[2]/div[2]/form[1]/mat-form-field[1]/div[1]/div[1]/div[1]/input[1]")
	WebElement amountField;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/mat-sidenav-container[1]/mat-sidenav-content[1]/main[1]/app-loans[1]/div[1]/div[2]/mat-horizontal-stepper[1]/div[2]/div[2]/form[1]/mat-form-field[2]/div[1]/div[1]/div[1]/input[1]")
	WebElement mothersMaidenNameField;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/mat-sidenav-container[1]/mat-sidenav-content[1]/main[1]/app-loans[1]/div[1]/div[2]/mat-horizontal-stepper[1]/div[2]/div[2]/form[1]/mat-form-field[3]/div[1]/div[1]/div[1]/input[1]")
	WebElement socialSecurityNumberField;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/mat-sidenav-container[1]/mat-sidenav-content[1]/main[1]/app-loans[1]/div[1]/div[2]/mat-horizontal-stepper[1]/div[2]/div[2]/form[1]/div[1]/button[2]/span[1]")
	WebElement next2Button;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/mat-sidenav-container[1]/mat-sidenav-content[1]/main[1]/app-loans[1]/div[1]/div[2]/mat-horizontal-stepper[1]/div[2]/div[2]/form[1]/div[1]/button[1]/span[1]")
	WebElement backButton;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/mat-sidenav-container[1]/mat-sidenav-content[1]/main[1]/app-loans[1]/div[1]/div[2]/mat-horizontal-stepper[1]/div[2]/div[3]/div[1]/button[1]")
	WebElement confirmButton;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/mat-sidenav-container[1]/mat-sidenav-content[1]/main[1]/app-loans[1]/div[1]/div[2]/mat-horizontal-stepper[1]/div[2]/div[3]/div[1]/button[2]/span[1]")
	WebElement back2Button;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/mat-sidenav-container[1]/mat-sidenav-content[1]/main[1]/app-loans[1]/div[1]/div[2]/mat-horizontal-stepper[1]/div[2]/div[3]/div[1]/button[3]/span[1]")
	WebElement resetButton;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/mat-sidenav-container[1]/mat-sidenav-content[1]/main[1]/app-loan-success[1]/div[1]/div[1]/div[1]/div[1]/mat-card[1]/mat-card-title[1]")
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
