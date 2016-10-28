package pagePackage;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AddressPage {
	
	WebDriver browser;
	String title = "Your address details";
	
	 @FindBy (id = "postCode") private WebElement postcodeField;
	 @FindBy (id = "selectedAddressId") private WebElement addressID;
	 
	public AddressPage(WebDriver browser) {
		 new WebDriverWait(browser, 10).until(ExpectedConditions.titleContains(title));
		 Assert.assertEquals(browser, title);
		 this.browser = browser;
		 PageFactory.initElements(browser, this);
	}
		 
	public void typePostCode(String postcode) {
				postcodeField.sendKeys(postcode);
		
		
	}
	
	public void selectAddress (){
		new Select(browser.findElement(By.id("selectedAddressId"))).selectByValue("object:517");
	}


		
	
	
	

}
