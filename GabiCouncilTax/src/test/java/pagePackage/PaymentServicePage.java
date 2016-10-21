package pagePackage;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PaymentServicePage {
	
	WebDriver browser;
	String title2 = "Online Payment";
	 @FindBy (css = "img[class='aip_image aip_image_hierarchy']") private WebElement councilTax;


	 public PaymentServicePage(WebDriver browser) {
			Assert.assertEquals(title2, browser.getTitle());
			this.browser = browser;
			PageFactory.initElements(browser,this);
	 }

	public ReferenceDetailsPage clickCouncilTax() { 
		councilTax.click();
		return new ReferenceDetailsPage(browser);
	}
}
