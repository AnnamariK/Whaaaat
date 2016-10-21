package pagePackage;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ItemsForPaymentPage {
	
	

	WebDriver browser;
	String titleDetails = "Cheshire East Council - make an online payment - Basket";

	@FindBy (css = "td[class = 'aip_cart_total']") private WebElement totalAmount;
	@FindBy (id = "continue") private WebElement continueButton;

	public ItemsForPaymentPage(WebDriver browser) {
		Assert.assertEquals(titleDetails, browser.getTitle());
		this.browser = browser;
		PageFactory.initElements(browser, this);
	}
	
	public String getTotalAmount() {
		return totalAmount.getText();
	}
	
	public PaymentPage clickContinueButton() {
		continueButton.click();
		return new PaymentPage(browser);
	}
}

