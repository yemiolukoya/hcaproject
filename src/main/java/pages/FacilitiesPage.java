package pages;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.*;

import utilities.JavaScriptExecutor;

public class FacilitiesPage {

	private WebDriver driver;
	
	JavaScriptExecutor js = new JavaScriptExecutor();

	public FacilitiesPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//a[@aria-label='The Harley Street Clinic']")

	private WebElement harleyStreetClinic;

	public void clickHarleyStreetClinic() {
		harleyStreetClinic.click();
	}

	public void getFacilitiesList() {

		List<WebElement> facilitiesList = driver.findElements(By.xpath("//a[@class=\"facilities-card__link\"]"));
		for (WebElement i : facilitiesList)

			Assert.assertEquals(9, facilitiesList.size());

	}

	@FindBy(xpath = "//a[text()=\"View our facilities\"]") 

	private WebElement viewOurFacilities;
	  
	public void clickViewOurFacilities() throws InterruptedException {
		js.javaScriptClick(driver, viewOurFacilities);


	}

	@FindBy(xpath = "//a[text()=\"The Lister Hospital\"]")

	private WebElement theListerHospitalTab;

	public void clickTheListerHospitalTab() {
		js.javaScriptClick(driver, theListerHospitalTab);

	}
}
