package testPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import pagePackage.AccountDetailsPage;
import pagePackage.AdditionalInformationPage;
import pagePackage.CheshireeastPage;
import pagePackage.ItemsForPaymentPage;
import pagePackage.PaymentConfirmationPage;
import pagePackage.PaymentPage;
import pagePackage.PaymentServicePage;
import pagePackage.ReferenceDetailsPage;

public class CouncilTaxPaymentTest {
	
	WebDriver browser;
	String URL = "http://www.cheshireeast.gov.uk/online_payments.aspx";
	
	
	CheshireeastPage makeOnlinePayment;
	PaymentServicePage councilTax;
	ReferenceDetailsPage reference;
	AccountDetailsPage account;
	ItemsForPaymentPage items;
	PaymentPage payment;
	AdditionalInformationPage info;
	PaymentConfirmationPage confirm;
	
	@Before
	public void openBrowser(){
		browser = new FirefoxDriver();
	}
	
	@Given("^Cheshireeast\\.gov page open$")
	public void cheshireeast_gov_page_open() throws Throwable {
		browser.get(URL);	   
	}

	@When("^Click on MakeAnOnlinePayment link$")
	public void click_on_MakeAnOnlinePayment_link() throws Throwable {
		makeOnlinePayment = new CheshireeastPage(browser);
		councilTax = makeOnlinePayment.clickMakeOnlinePayment();  
	}

	@When("^Click on Council Tax link$")
	public void click_on_Council_Tax_link() throws Throwable {
	   councilTax = new PaymentServicePage(browser);
	   reference = councilTax.clickCouncilTax();	    
	}

	@When("^Enter my reference number \"([^\"]*)\" and click Continue$")
	public void enter_my_reference_number_and_click_Continue(String referenceNumber) throws Throwable {
		reference = new ReferenceDetailsPage (browser);
		reference.typeRefNumber(referenceNumber);
		account = reference.clickContinue();	    
	}

	@When("^Enter the amount to be paid \"([^\"]*)\" and click Continue$")
	public void enter_the_amount_to_be_paid_and_click_Continue(String amountToPay) throws Throwable {
		account = new AccountDetailsPage(browser);
		account.typeAmountToPay(amountToPay);
		items = account.clickContinueButton();	    
	}

	@When("^Verify the amount to be paid \"([^\"]*)\" and click Continue$")
	public void verify_the_amount_to_be_paid_and_click_Continue(String totalAmount) throws Throwable {
		items = new ItemsForPaymentPage(browser);
		items.getTotalAmount();
		payment = items.clickContinueButton();	    
	}

	@When("^Enter the Card Number \"([^\"]*)\"$")
	public void enter_the_Card_Number(String cardNumber, String expDateMonth, String expDateYear, String secCode) throws Throwable {
		payment = new PaymentPage(browser);
		payment.typeCardNumber(cardNumber);
		payment.typeExpDateMonth(expDateMonth);
		payment.typeExpDateYear(expDateYear);
		payment.typeSecCode(secCode);
		info = payment.clickContinueButton();	    
	}

	@When("^Enter the Cardholder Name \"([^\"]*)\"$")
	public void enter_the_Cardholder_Name(String cardHolderName, String email, String emailConfirm ) throws Throwable {
		info = new AdditionalInformationPage(browser);
		info.typeCarHolderName(cardHolderName);
		info.typeEmail(emailConfirm);
		info.typeEmailConfirm(emailConfirm);
		confirm = info.clickContinueButton();	  
	}
	
//	@After
//	public void closeBrowser(){
//	browser.quit();
//	}

}
