package stepDefinitions;

import driverFactory.DriverFactory;
import io.cucumber.java.en.*;
import org.junit.Assert;
import pages.HomePage;
import pages.OnlinePaymentPage;

public class HowToPayStep {

	private static String title;

	private OnlinePaymentPage onlinePaymentPage = new OnlinePaymentPage(DriverFactory.getDriver());
	private HomePage homePage = new HomePage(DriverFactory.getDriver());

	@Given("user click on How to pay for your treatment tab")
	public void user_click_on_how_to_pay_for_your_treatment_tab() {
		homePage.clickHowToPayForYourTreatment();

	}

	@Given("user gets the title of the page")
	public void user_gets_the_title_of_the_page() {
		title = onlinePaymentPage.getOnlinePaymentPageTitle();

	}

	@Given("the page title should be {string}")
	public void the_page_title_should_be(String pageTitle) {
		System.out.println(title);

		Assert.assertTrue(title.contains(pageTitle));
	}

	@Given("user fill in Patient's details")
	public void user_fill_in_patient_s_details() {
		onlinePaymentPage.enterHcaAccountNumber();
		onlinePaymentPage.selectTitle();
		onlinePaymentPage.enterFirstName();
		onlinePaymentPage.enterSurName();
		onlinePaymentPage.enterEmailAddress();
		onlinePaymentPage.enterconfirmEmailAddress();
		onlinePaymentPage.enterContactNumber();
		onlinePaymentPage.enterPostCode();
	}

	@Given("user fill in Billing details")
	public void user_fill_in_billing_details() {
		onlinePaymentPage.clickEmailContact();

	}

	@When("user fill in Payment details")
	public void user_fill_in_payment_details() {
		onlinePaymentPage.enterCardHolderName();
		onlinePaymentPage.enterInvoiceAmount();
	}

	@When("user click pay securely now")
	public void user_click_pay_securely_now() {
		onlinePaymentPage.clickPaySecurlyBtn();
	}

	@Then("user should be navigated to payment page")
	public void user_should_be_navigated_to_payment_page() {

	}

}
