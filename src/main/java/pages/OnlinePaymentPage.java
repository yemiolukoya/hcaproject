package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class OnlinePaymentPage {
	WebDriver driver;
	JavascriptExecutor js;


	public OnlinePaymentPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//input[@id='HCAaccountNumber']")
	WebElement hcaAccountNumber;

	public void enterHcaAccountNumber() {
		hcaAccountNumber.sendKeys("T1234567/1");
	}

	@FindBy(xpath = "//div[@id=\"ui-id-5\"]")
	WebElement titleDrpDwn;

	public void clickTitleDrpDwn() {
		titleDrpDwn.click();
	}

	@FindBy(id = "title")
	WebElement title;

	public void selectTitle() {
		Select titleDrp = new Select(title);
		titleDrp.selectByIndex(2);
	}

	@FindBy(id = "fname")
	WebElement firstName;

	public void enterFirstName() {
		firstName.sendKeys("Yemi");

	}

	@FindBy(id = "lname")
	WebElement surName;

	public void enterSurName() {
		surName.sendKeys("Olukoya");

	}

	@FindBy(id = "email")
	WebElement emailAddress;

	public void enterEmailAddress() {
		emailAddress.sendKeys("yemi.olukoya@hcahealthcare.co.uk");
	}

	@FindBy(id = "confirmEmail")
	WebElement confirmEmailAddressField;

	public void enterconfirmEmailAddress() {
		confirmEmailAddressField.sendKeys("yemi.olukoya@hcahealthcare.co.uk");
	}

	public String getOnlinePaymentPageTitle() {
		return driver.getTitle();
	}

	@FindBy(name = "ContactNumber")
	WebElement contactNumberField;

	public void enterContactNumber() {
		contactNumberField.sendKeys("07889960336");
	}

	@FindBy(name = "PostcodeSearch")
	WebElement postCodeField;

	public void enterPostCode() {
		postCodeField.sendKeys("se9 2jb");
	}

	@FindBy(id = "btnFindAddress")
	WebElement findAddressBtn;

	public void clickFindAddress() {
		findAddressBtn.click();
	}

	@FindBy(xpath = "//label[@for=\"check-email\"]")
	WebElement emailContactCheckBox;

	public void clickEmailContact() {
		 JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].click();", emailContactCheckBox);
	}

	@FindBy(xpath = "//input[@id='cardholdername']")
	WebElement cardHolderNameField;

	public void enterCardHolderName() {
		cardHolderNameField.sendKeys("Yemi Test");
	}

	@FindBy(id = "invoicetotal")
	WebElement invoiceAmountField;

	public void enterInvoiceAmount() {
		invoiceAmountField.sendKeys("100");
	}

	@FindBy(id = "btn-form")
	WebElement paySecurlyBtn;

	public void clickPaySecurlyBtn() {
		 JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].click();", paySecurlyBtn);
	}

}
