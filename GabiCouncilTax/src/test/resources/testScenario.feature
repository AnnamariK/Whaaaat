Feature: Council tax Payment
	
	Scenario: Opening Payment Service page
		Given "http://www.cheshireeast.gov.uk/online_payments.aspx" page open 
		When  Click on MakeAnOnlinePayment link
		Then  Will be redirected to Payment Service page
		
	Scenario: Opening Reference Details page
		Given Payment Service page open
		When  Click on Council Tax link
		Then  Will be redirected to Reference Details page	
	
	Scenario: Entering Reference Number
		Given Reference Details Page Open
		When  Enter my reference number "67055382" and click Continue
		Then  Will be redirected to Account Details page
		
	Scenario: Entering Amount To Be Paid
		Given Account Details page open
		When  Enter the amount to be paid "19.23" and click Continue
		Then  Will be redirected to Items for Payment page
		
	Scenario: Verifying Total Amount To Pay
		Given Items for Payment page open
		When  Verify the amount to be paid "19.23" and click Continue
		Then  Will be redirected to Payment page
		
	Scenario: Entering Payment Details
		Given Payment page is open
		When  Enter the Card Number "4658592116504021"
		And   Enter the Expiry Date "07/19"
		And   Enter the Security Code "364" and click Continue
		Then  Will be redirected to Additional Information page
		
	Scenario: Entering Additional Information
		Given Additional Information page open
		When  Enter the Cardholder Name "G Keskeny"
		And   Enter the email address "gabikeskeny@gmail.com"
		And   Enter the confirmation of the email address "gabikeskeny@gmail.com" and click Continue
		Then  Will be redirected to Payment Confirmation page
		