package stepDefinitions;

import driverFactory.DriverFactory;
import io.cucumber.java.en.*;
import pages.FacilitiesPage;
import pages.HomePage;
import org.junit.Assert;


public class FacilitiesStep {

	FacilitiesPage facilitiesPage = new FacilitiesPage(DriverFactory.getDriver());
	private HomePage homePage = new HomePage(DriverFactory.getDriver());


	@When("user navigate to discover our facilities {string}")
	public void user_navigate_to_discover_our_facilities(String pageTitle) {
	    Assert.assertEquals(homePage.getPageTitle(), pageTitle);
	    
	    

	}

	@Then("there should be nine facilities displayed")
	public void there_should_be_nine_facilities_displayed() {
		//facilitiesPage.clickHarleyStreetClinic();
				facilitiesPage.getFacilitiesList();
	}
	

}
