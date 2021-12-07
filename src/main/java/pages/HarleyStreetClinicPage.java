package pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.JavaScriptExecutor;

public class HarleyStreetClinicPage {

	private WebDriver driver;
	JavaScriptExecutor js = new JavaScriptExecutor();

	public HarleyStreetClinicPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}
	
	public int getClinicLocationListCount() {
		return driver.findElements(By.xpath("//ul[@class=\"interactive-list locations-map__location-links\"]")).size();
	}

	public List<String> getClinicLocationList() {
		List<String> ClinicLists = new ArrayList<>();
		List<WebElement> clinicCountList = driver.findElements(By.xpath("//ul[@class=\"interactive-list locations-map__location-links\"]"));
		for(WebElement e : clinicCountList) {
			String text = e.getText();
			System.out.println(text);
			ClinicLists.add(text);
		}
		return ClinicLists;
	}
	@FindBy(xpath = "//a[@aria-label='The Harley Street Clinic']")

	private WebElement harleyStreetClinic;

	public void clickHarleyStreetClinic() {
		js.javaScriptClick(driver, harleyStreetClinic);
	}

	public String getHarleyStreetClinicPageTitle() {
		return driver.getTitle();
	}

	@FindBy(xpath = "//address[contains(text(),'35 Weymouth Street')]")

	WebElement harleyStreetAddress;

	public boolean isHarleyStreetAddressDisplayed()

	{
		try {
			return (harleyStreetAddress.isDisplayed());
		} catch (Exception e) {
			return (false);
		}

	}

	@FindBy(xpath = "//address[@class=\"hero-banner__contact-list-text hero-banner__contact-list-text--address\"]")
	WebElement clinicAddress;

	public boolean isClinicAddressDisplayed() {

		try {
			return (clinicAddress.isDisplayed());
		} catch (Exception e) {
			return (false);
		}

	}

	@FindBy(xpath = "//button[@data-location-id=\"{6BE65874-63B4-4330-A1A2-154B1ED04BF9}\"]")
	WebElement theHarleyStreetClinic;

	public void clickTheHarleyStreetClinicLink() throws InterruptedException {
		js.javaScriptClick(driver, theHarleyStreetClinic);

	}

	@FindBy(xpath = "//p[normalize-space()='The Harley Street Clinic']")

	WebElement hospitalName;

	public boolean isDisplayedHospitalName() {
		try {
			return (hospitalName.isDisplayed());
		} catch (Exception e) {
			return (false);
		}

	}
}
