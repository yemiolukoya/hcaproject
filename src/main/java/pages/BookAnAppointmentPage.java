package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import utilities.JavaScriptExecutor;

public class BookAnAppointmentPage {

	WebDriver driver;
	JavaScriptExecutor js = new JavaScriptExecutor();

	public BookAnAppointmentPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//span[text()=\"I am the patient\"]")
	WebElement iAmThePatient;

	public void clickiAmThePatient() {
		js.javaScriptClick(driver, iAmThePatient);

		

	}

	@FindBy(xpath = "//a[@title='Request an appointment']")
	WebElement requestAnAppointment;

	public void clickRequestAnAppointment() {
		requestAnAppointment.click();
	}

	@FindBy(xpath = "//input[@id='fxb_ac4483de-faeb-4b48-9eda-176d084dde5d_Fields_1c5a0163-b103-4d71-ba9c-9e769032d89d__Value']")
	WebElement firstName;

	public void enterFirstName(String fname) {
		firstName.sendKeys(fname);
	}

	@FindBy(xpath = "//input[@id='fxb_ac4483de-faeb-4b48-9eda-176d084dde5d_Fields_d816fae2-fd26-4d35-be90-2421f48eda48__Value']")
	WebElement surName;

	public void enterSurName(String sname) {
		surName.sendKeys(sname);
	}

	@FindBy(xpath = "//input[@id='fxb_ac4483de-faeb-4b48-9eda-176d084dde5d_Fields_2d522dee-187d-4242-b189-42899176c46d__Value']")
	WebElement dateofbirth;

	public void enterDob() {
		dateofbirth.sendKeys("10102000");
	}

	@FindBy(xpath = "//span[normalize-space()='Email']")
	WebElement emailCommunicationPreferences;

	public void clickEmailCommunicationPreferences() {
		js.javaScriptClick(driver, emailCommunicationPreferences);
	}

	@FindBy(xpath = "//input[@id='fxb_ac4483de-faeb-4b48-9eda-176d084dde5d_Fields_f9a472e1-ff12-42cb-b122-7e1373daf74c__Value']")
	WebElement phoneNumber;

	public void enterPhoneNumber(String phone) {
		phoneNumber.sendKeys(phone);
	}

	@FindBy(xpath = "//input[@id='fxb_ac4483de-faeb-4b48-9eda-176d084dde5d_Fields_0855db1a-6b02-4661-a85e-a77573be8715__Value']")
	WebElement emailAddress;

	public void enterEmailAddress(String email) {
		emailAddress.sendKeys(email);
	}

	@FindBy(xpath = "//textarea[@name=\"fxb.ac4483de-faeb-4b48-9eda-176d084dde5d.Fields[5a1f563a-4ab5-43a5-9b92-91ae14faa91e].Value\"]")
	WebElement reasonForAppointment;

	public void enterReasonForAppointment(String appointmentReason) {
		reasonForAppointment.sendKeys(appointmentReason);
	}

	// verify user is on Request an appointment page
	@FindBy(xpath = "//h1[text()=\"Request an appointment\"]")
	WebElement heroHeader;

	public String getHeroHeaderMsg() {
		try {
			return (heroHeader.getText());
		} catch (Exception e) {
			return (e.getMessage());
		}
	}

	@FindBy(xpath = "//button[@name='fxb.ac4483de-faeb-4b48-9eda-176d084dde5d.a70fbc7c-00c9-40cf-8e14-887b56a2834c']")
	WebElement submitBtn;

	public void clickSubmitBtn() {
		js.javaScriptClick(driver, submitBtn);
	}

	@FindBy(xpath = "//span[text()=\"Please confirm you are not a robot.\"]")
	WebElement notArobotErrorMessage;

	public boolean isErrorMessageDisplayed()

	{
		try {
			return (notArobotErrorMessage.isDisplayed());
		} catch (Exception e) {
			return (false);
		}

	}

	public String getRequestAnAppointmentPageTitle() {
		return driver.getTitle();
	}

	@FindBy(xpath = "//div[7]//div[1]//div[2]//label[1]//span[1]")
	WebElement doYouHaveApreferredHospital;

	public void clickNoDoYouHaveApreferredHospital() {
		js.javaScriptClick(driver, doYouHaveApreferredHospital);

	}

	@FindBy(xpath = "//div[8]//div[1]//div[2]//label[1]//span[1]")
	WebElement haveYouPreviouslyBeenApatientWithHCA;

	public void clickNoHaveNotPrevioulyBeenApatientWithHCA() {
		js.javaScriptClick(driver, haveYouPreviouslyBeenApatientWithHCA);

	}

	@FindBy(xpath = "//span[normalize-space()='Paying for my own treatment']")
	WebElement howAreYouPayingForTreatment;

	public void clickPayingForMyOwnTreatment() {
		js.javaScriptClick(driver, howAreYouPayingForTreatment);

	}

	@FindBy(xpath = "//span[normalize-space()='I am completing this on behalf of the patient']")
	WebElement CompletingOnBehalfOfPatient;

	public void clickCompletingOnBehalfOfPatient() {
		js.javaScriptClick(driver, CompletingOnBehalfOfPatient);

	}
}
