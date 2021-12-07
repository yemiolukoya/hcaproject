package pages;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.JavaScriptExecutor;

public class LocationsPage {

	private WebDriver driver;
	JavaScriptExecutor js = new JavaScriptExecutor();


	public LocationsPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

//	public void locationsList() {
//
//		List<WebElement> locationsList = driver.findElements(By.xpath("//div[@class=\"g-nav__submenu-item-col\"]"));
//		for (WebElement i : locationsList)
//
//			System.out.println(i.getText());
//
//		Assert.assertEquals(13, locationsList.size());
//
//	}
	
	public String getLocationPageTitle() {
		return driver.getTitle();
	}
	
	@FindBy(xpath = "//div[@class=\"g-nav__submenu-item-col\"]")
	private By locationList;
	
	public int getLocationListCount() {
		return driver.findElements(By.xpath("//div[@class=\"g-nav__submenu-item-col\"]")).size();
	}
	
	public List<String> getLocationSectionList() {
		List<String> LocationLists = new ArrayList<>();
		List<WebElement> locationsCountList = driver.findElements(By.xpath("//div[@class=\"g-nav__submenu-item-col\"]"));
		for(WebElement e : locationsCountList) {
			String text = e.getText();
			System.out.println(text);
			LocationLists.add(text);
		}
		return LocationLists;
	}

	@FindBy(xpath = "//a[normalize-space()='See all locations']")
	private WebElement seeAllLocationTab;

	public void clickSeeAllLocationTab() {
		js.javaScriptClick(driver, seeAllLocationTab);

	}

	@FindBy(xpath = "//a[normalize-space()='The Harley Street Clinic']")
	private WebElement theHarleyStreetClinic;

	public void clickTheHarleyStreetClinic() {
		theHarleyStreetClinic.click();

	}

	@FindBy(xpath = "//a[normalize-space()='The Lister Hospital']")
	private WebElement theListerHospital;

	public void clickTheListerHospital() {
		theListerHospital.click();

	}

	@FindBy(xpath = "//a[normalize-space()='London Bridge Hospital']")
	private WebElement theLondonBridgeHospital;

	public void clickTheLondonBridgeHospital() {
		theLondonBridgeHospital.click();

	}

	@FindBy(xpath = "//a[normalize-space()='The Portland Hospital']")
	private WebElement thePortlandHospital;

	public void clickThePortlandHospital() {
		thePortlandHospital.click();

	}

	@FindBy(xpath = "//a[normalize-space()='The Princess Grace Hospital']")
	private WebElement thePrincessGraceHospital;

	public void clickThePrincessGraceHospital() {
		thePrincessGraceHospital.click();

	}

	@FindBy(xpath = "//a[normalize-space()='The Wellington Hospital']")
	private WebElement theWellingtonHospital;

	public void clickTheWellingtonHospital() {
		theWellingtonHospital.click();

	}

	@FindBy(xpath = "//a[normalize-space()='The Wilmslow Hospital']")
	private WebElement theWilslowHospital;

	public void clickTheWilslowHospital() {
		theWilslowHospital.click();

	}

	@FindBy(xpath = "//a[normalize-space()='The Christie Private Care']")
	private WebElement theChristiePrivateCare;

	public void clicktheChristiePrivateCare() {
		theChristiePrivateCare.click();

	}

	@FindBy(xpath = "//a[normalize-space()='HCA UK at University College']")
	private WebElement hcaUKatUniversityCollege;

	public void clickHcaUKatUniversityCollege() {
		hcaUKatUniversityCollege.click();

	}

	@FindBy(xpath = "//a[normalize-space()=\"Private Care at Guy's\"]")
	private WebElement privateCareAtGuys;

	public void clickPrivateCareAtGuys() {
		privateCareAtGuys.click();

	}

	
	//Assertion
	@FindBy(xpath = "//h1[@class=\"g-above-fold__heading\"]")
	private WebElement locationText;
	
	public boolean islocationTextDisplayed()

	{
		return locationText.getText().contains("Locations");
	}
}
