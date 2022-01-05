package com.noorteck.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.noorteck.qa.utils.CommonUI;

public class TransfersPage extends CommonUI {
	
	@FindBy (css=".mat-select-placeholder.ng-tns-c12-2.ng-star-inserted")
	WebElement originaAccount;

	@FindBy(css = "mat-option[id='mat-option-2'] span[class='mat-option-text']")
	WebElement originateFromPersonalAccount;
	
	@FindBy(css = "mat-option[id='mat-option-33'] span[class='mat-option-text']")
	WebElement originatFromInvestingAccount;
	
	@FindBy(css = "mat-option[id='mat-option-4'] span[class='mat-option-text']")
	WebElement originatFromRetirmentAccount;
	
	@FindBy(css = "mat-option[id='mat-option-5'] span[class='mat-option-text']")
	WebElement originatFromRainyDayAccount;
	
	@FindBy(css = ".mat-select-placeholder.ng-tns-c12-4.ng-star-inserted")
	WebElement destinationAccount;
	
	
	
	@FindBy (css="mat-option[id='mat-option-6'] span[class='mat-option-text']")
	WebElement destinationPersonalAccount;
	
	@FindBy (css= "mat-option[id='mat-option-7'] span[class='mat-option-text']")
	WebElement destinationInvestingAccount;
	
	@FindBy (css= "mat-option[id='mat-option-8'] span[class='mat-option-text']")
	WebElement destinationRetirmentAccount;
	
	@FindBy (css ="mat-option[id='mat-option-9'] span[class='mat-option-text']")
	WebElement destinationRainyDayAccount;
	@FindBy(css = "#mat-input-0")
	WebElement amountField;

	@FindBy(css = "#mat-input-1")
	WebElement socialSecurityNumberField;

	@FindBy(css = "#mat-input-2")
	WebElement aTMPinField;

	@FindBy(xpath = "//span[normalize-space()='Transfer Funds']")
	WebElement trasnferButton;

	@FindBy(xpath = "//mat-card[@class='card mat-card']")
	WebElement transferStatusMessage;

	public TransfersPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void clickOriginAccount() {
		moveToElementAndClick(originaAccount);
	}
	
	public void moveToOriginPersonalAccount() {
		moveToElementAndClick(originateFromPersonalAccount);
	}
	
	public void moveToOriginInvestingAccount() {
		moveToElementAndClick(originatFromInvestingAccount);
	}
	
	public void moveToOriginRetirementAccount() {
		moveToElementAndClick(originatFromRetirmentAccount);
	}
	
	public void moveToOriginRainyDayAccount() {
		moveToElementAndClick(originatFromRainyDayAccount);
	}
	
	public void moveToDestinationAccount() {
		moveToElementAndClick(destinationAccount);
	}
	
	public void moveToDestinationPersonalAccount() {
		moveToElement(destinationPersonalAccount);
	}
	
	public void moveToDestinationInvestingAccount() {
		moveToElementAndClick(destinationInvestingAccount);
	}
	
	public void moveToDestinationRainyDayAccount() {
		moveToElementAndClick(destinationRainyDayAccount);
	}

	public void enterAmount(String amount) {
		enter(amountField, amount);
	}

	public void enterSocialSecurity(String socialSecurity) {
		enter(socialSecurityNumberField, socialSecurity);
	}

	public void enterATMPin(String aTMpin) {
		enter(aTMPinField, aTMpin);

	}

	public void clickTransferButton() {
		click(trasnferButton);
	}

	public String getMessage() {
		return getText(transferStatusMessage);
	}

}
