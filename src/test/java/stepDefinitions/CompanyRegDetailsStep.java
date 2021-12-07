package stepDefinitions;

import driverFactory.DriverFactory;
import io.cucumber.java.en.*;
import junit.framework.Assert;
import pages.HarleyStreetClinicPage;
import pages.HomePage;

public class CompanyRegDetailsStep {

	HarleyStreetClinicPage harleyStreetClinicPage = new HarleyStreetClinicPage(DriverFactory.getDriver());

	@When("user navigate to discover our facilities |Leading Private Healthcare Provider | HCA UK|")
	public void user_navigate_to_discover_our_facilities_leading_private_healthcare_provider_hca_uk() {
	   
	}

	@Then("company registration details is visible on the footer")
	public void company_registration_details_is_visible_on_the_footer() {
		
		
		Assert.assertTrue(harleyStreetClinicPage.isClinicAddressDisplayed());
		
	}

}
