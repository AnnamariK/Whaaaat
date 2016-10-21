package pagePackage;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class AccountDetailsPage {
	
	WebDriver browser;
	String titleDetails = "Cheshire East Council - make an online payment - Data Entry";

	@FindBy (id = "ATI_15") private WebElement amountToPayField;
	@FindBy (id = "continue") private WebElement continueButton;

	public  AccountDetailsPage(WebDriver browser) {
		Assert.assertEquals(titleDetails, browser.getTitle());
		this.browser = browser;
		PageFactory.initElements(browser, this);
	}
	
	public void typeAmountToPay(String amountToPay) {
		amountToPayField.sendKeys(amountToPay);
	}
	
	public ItemsForPaymentPage clickContinueButton() {
		continueButton.click();
		return new ItemsForPaymentPage(browser);
	}
}
