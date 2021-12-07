package stepDefinitions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import driverFactory.DriverFactory;
import io.cucumber.java.en.*;
import junit.framework.Assert;
import pages.HarleyStreetClinicPage;

public class AddPostCodeToMapStep {
	
	JavascriptExecutor Executor;
	WebDriver driver;
	
	private static String hospitalName;



	
	HarleyStreetClinicPage harleyStreetClinicPage = new HarleyStreetClinicPage(DriverFactory.getDriver());
	
	@Given("user click on The Harley Street Clinic")
	public void user_click_on_the_harley_street_clinic() throws InterruptedException {

		Thread.sleep(500);

		//JavascriptExecutor Executor = (JavascriptExecutor) driver;
		//Executor.executeScript("arguments[0].click();", driver.findElement(By.xpath("//button[@data-location-id=\"{4A727461-26D8-4A1E-86BD-CE7D4DAF3ED4}\"]")));

		harleyStreetClinicPage.clickTheHarleyStreetClinicLink();
	}
	@Then("the location map should contain the postcode")
	public void the_location_map_should_contain_the_postcode() {
	    
		harleyStreetClinicPage.isDisplayedHospitalName();

		
		
		
	}

}
