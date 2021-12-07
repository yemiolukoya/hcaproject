package stepDefinitions;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.WebDriver;

import driverFactory.DriverFactory;
import io.cucumber.java.en.*;
import org.junit.Assert;
import pages.HarleyStreetClinicPage;
import pages.HomePage;
import utilities.JavaScriptExecutor;

public class CareQualityCommissionStep {
	private static String title;
	WebDriver driver;
	HomePage homePage = new HomePage(DriverFactory.getDriver());
	

	@Given("user click CQC tab")
	public void user_click_cqc_tab() {

		homePage.clickCareQualityCommissionTab();

	
		
	}

	@Then("CQC page is opened")
	public void cqc_page_is_opened() {
		title = homePage.getPageTitle();
		// System.out.println(title);
	}

	@Then("page title should be {string}")
	public void page_title_should_be(String expectedTitleName) {

		Assert.assertTrue(title.contains(expectedTitleName));
	}
}
