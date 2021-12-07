package pages;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.JavaScriptExecutor;

import org.junit.Assert;

public class HomePage {

	private WebDriver driver;
	
	
	JavaScriptExecutor js = new JavaScriptExecutor();

	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//a[normalize-space()='Departments']")
	private WebElement departmentsLink;

	public void clickDepartmentsLinkLink() {

		js.javaScriptClick(driver, departmentsLink);
	}

	@FindBy(xpath = "//a[normalize-space()='Tests & Scans']")
	private WebElement tests_scansLink;

	public void clickTests_ScansLink() {

		js.javaScriptClick(driver, tests_scansLink);
	}

	@FindBy(xpath = "//a[normalize-space()='Treatments']")
	private WebElement treatmentsLink;

	public void clickTreatmentsLink() {

		js.javaScriptClick(driver, treatmentsLink);
	}

	@FindBy(xpath = "//a[normalize-space()='Consultants']")
	private WebElement consultantsLink;

	public void clickconsultantsLink() {

		js.javaScriptClick(driver, consultantsLink);
	}

	@FindBy(xpath = "//a[normalize-space()='Patient Information']")
	private WebElement patient_informationLink;

	public void clickPatient_InformationLink() {

		js.javaScriptClick(driver, patient_informationLink);
	}

	@FindBy(xpath = "//a[normalize-space()='Book an appointment']")
	private WebElement book_an_appointmentLink;

	public void clickBook_An_AppointmentLink() {

		js.javaScriptClick(driver, book_an_appointmentLink);
	}

	@FindBy(xpath = "//input[@placeholder='Search']")
	private WebElement searchField;

	public void inputSearchFieldTxt(String txt) {

		String mainHandle = driver.getWindowHandle();
		System.out.println(mainHandle);
		searchField.sendKeys(txt);
		
		
	}

	@FindBy(xpath = "//button[normalize-space()='Search']")
	private WebElement searchBtn;

	public void clickSearchBtn() {

		js.javaScriptClick(driver, searchBtn);
	}

	@FindBy(xpath = "//button[@id=\"gdpr-allow-all\"]")
	private WebElement cookie;

	public void acceptCookie() {
		cookie.click();
	}

	@FindBy(xpath = "//a[@href='/request-an-appointment']//div[@class='icon-card__content']")
	private WebElement bookAnAppointment;

	public void clickBookAnAppointment() {
		bookAnAppointment.click();

	}

	@FindBy(xpath = "//a[@href='/online-payments']//div[@class='icon-card__content']")
	private WebElement howToPayForYourTreatment;

	public void clickHowToPayForYourTreatment() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", howToPayForYourTreatment);
		// howToPayForYourTreatment.click();
	}

//	@FindBy(xpath = "//a[@class=\"icon-cards-grid__card\"]")
//	private WebElement ourServicesList;

	// this to get the number of elements and to print the elements
	public void listOurServices() {

		List<WebElement> list = driver.findElements(By.xpath("//a[@class=\"icon-cards-grid__card\"]"));
		list.size();

		for (WebElement i : list) {
			System.out.println(i.getText());
		}

		if (list.size() == 9) {

			System.out.println("list count is correct");
		} else {
			System.out.println("list count is wrong");

		}

		// ourServicesList.getText();
//		System.out.println(ourServicesList.getTagName());
//		System.out.println(ourServicesList.getSize());

	}

	@FindBy(xpath = "//span[@class='button-inline-alt__text site-header__search-text']")
	private WebElement searchFieldBtton;

	public void clickSearchField() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", searchField);
	}

	public String getPageTitle() {
		return driver.getTitle();
	}

	@FindBy(xpath = "//a[@data-container-id=\"2d445720e6e04002b91fbe47cf1a335f\"]")
	private WebElement locationsLink;

	public void clickLocationsLink() {

		js.javaScriptClick(driver, locationsLink);
	}

	@FindBy(xpath = "//a[@aria-label='facebook']//*[name()='svg']")
	private WebElement facebookIcon;

	public void clickFacebookIcon() {
		js.javaScriptClick(driver, facebookIcon);

	}

	@FindBy(xpath = "//a[@aria-label='Instagram']//*[name()='svg']")
	private WebElement instagramIcon;

	public void clickInstagramIcon() {

		js.javaScriptClick(driver, instagramIcon);
	}

	@FindBy(xpath = "//a[@aria-label='linkedin']//*[name()='svg']")
	private WebElement linkedinIcon;

	public void clickLinkedinIcon() {
		js.javaScriptClick(driver, linkedinIcon);

	}

	@FindBy(xpath = "//a[@aria-label='twitter']//*[name()='svg']")
	private WebElement twitterIcon;

	public void clickTwitterIcon() {

		js.javaScriptClick(driver, twitterIcon);

	}

	@FindBy(xpath = "//a[@aria-label='youtube']//*[name()='svg']")
	private WebElement youtubeIcon;

	public void clickYoutubeIcon() {

		js.javaScriptClick(driver, youtubeIcon);

	}

	@FindBy(xpath = "//div[@data-overlay='true']//div//div//div//div//a")
	private WebElement careQualityCommissionTab;



	public void clickCareQualityCommissionTab() {
		js.javaScriptClick(driver, careQualityCommissionTab);


		Set<String> allHandles = driver.getWindowHandles();
		System.out.println("All handles" + allHandles);

	}
	
	public String getCqcPageTitle() {
		
		return driver.getTitle();
	}
	
	
	@FindBy(xpath = "//p[@id=\"mission\"]")
	private WebElement cqcLogo;
	
	
	public boolean isCqcPageOpened() {
		return cqcLogo.isDisplayed();
	}
	
	
	
}
