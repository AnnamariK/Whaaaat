package pagePackage;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PaymentConfirmationPage {

	WebDriver browser;
	String title = "Confirm Payment Details";
	
	@FindBy (css = "td[class = '']") private WebElement totalAmount;
	@FindBy (css = "td[class = '']") private WebElement makeAPaymentButton;
	
	public PaymentConfirmationPage(WebDriver browser) {
			Assert.assertEquals(title, browser.getTitle());
			this.browser = browser;
			PageFactory.initElements(browser, this);
	}

	public PaymentMade clickmakeAPaymentButton() {
		makeAPaymentButton.click();
		return new PaymentMade(browser);
	}
}
