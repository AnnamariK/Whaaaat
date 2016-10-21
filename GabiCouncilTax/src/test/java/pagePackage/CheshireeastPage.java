package pagePackage;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class CheshireeastPage {
	
	WebDriver browser;
	
	String title = "Cheshire East Council - make an online payment - Main Menu";
	 @FindBy (css = "a[title = 'Make an online payment']") private WebElement makeOnlinePayment;
	 
	 public CheshireeastPage(WebDriver browser) {
			Assert.assertEquals(title, browser.getTitle());
			this.browser = browser;
			PageFactory.initElements(browser,this);
	}

	public PaymentServicePage clickMakeOnlinePayment() {
		makeOnlinePayment.click();
		return new PaymentServicePage(browser);
	 }

}
