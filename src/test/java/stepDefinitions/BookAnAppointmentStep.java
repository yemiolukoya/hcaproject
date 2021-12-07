package stepDefinitions;

import java.time.Duration;
import java.util.ResourceBundle;

import org.apache.commons.lang.RandomStringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import driverFactory.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import pages.HomePage;
import pages.BookAnAppointmentPage;

import org.junit.Assert;

public class BookAnAppointmentStep {

	private static String title;
	WebDriver driver;

	private BookAnAppointmentPage bookAnAppointmentPage = new BookAnAppointmentPage(DriverFactory.getDriver());
	private HomePage homePage = new HomePage(DriverFactory.getDriver());

	@Given("user launch the browser")
	public void user_launch_the_browser() {
		DriverFactory.getDriver().get("https://hcauks-uat-sitecore-cd.azurewebsites.net/");
		

	}

	@Given("opens URL {string}")
	public void opens_url(String url) throws InterruptedException {

		// String title = homePage.getPageTitle();

		// Assert.assertTrue(title.contains(url));
	}

	@When("user click book an appointment")
	public void user_click_book_an_appointment() {
		homePage.acceptCookie();
		homePage.clickBookAnAppointment();

	}

	@When("the page title is {string}")
	public void the_page_title_is(String pageTitle) {

		title = bookAnAppointmentPage.getRequestAnAppointmentPageTitle();
		System.out.println(title);

		Assert.assertTrue(title.contains(pageTitle));
	}

	@When("user choose I am a patient option")
	public void user_choose_i_am_a_patient_option() {
		bookAnAppointmentPage.clickiAmThePatient();

	}

	@When("user fill in patient details")
	public void user_fill_in_patient_details() {
		bookAnAppointmentPage.enterFirstName("yemi");
		bookAnAppointmentPage.enterSurName("test");
		bookAnAppointmentPage.enterEmailAddress("yemi.olukoya@hcahealthcare.co.uk");
		bookAnAppointmentPage.enterPhoneNumber("07947278905");
		bookAnAppointmentPage.enterDob();

	}

	@When("user enter appointment details")
	public void user_enter_appointment_details() {
		bookAnAppointmentPage.enterReasonForAppointment("Test");
		bookAnAppointmentPage.clickNoDoYouHaveApreferredHospital();
		bookAnAppointmentPage.clickNoHaveNotPrevioulyBeenApatientWithHCA();
		bookAnAppointmentPage.clickPayingForMyOwnTreatment();
	}

	@When("user choose communication Preferences")
	public void user_choose_communication_preferences() {
		bookAnAppointmentPage.clickEmailCommunicationPreferences();
	}

	@When("user click submit button")
	public void user_click_submit_button() {
		bookAnAppointmentPage.clickSubmitBtn();
	}

	@Then("confirm you are not a robot message is displayed")
	public void confirm_you_are_not_a_robot_message_is_displayed() {
		bookAnAppointmentPage.isErrorMessageDisplayed();

	}

	@When("user choose I am completing this on behalf of the patient option")
	public void user_choose_i_am_completing_this_on_behalf_of_the_patient_option() {
		bookAnAppointmentPage.clickCompletingOnBehalfOfPatient();
	}

}
