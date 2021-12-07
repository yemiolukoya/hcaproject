package stepDefinitions;

import driverFactory.DriverFactory;
import io.cucumber.java.en.*;
import org.junit.Assert;
import pages.FacilitiesPage;
import pages.ListerHospitalListPage;

public class ListerHospitalList {

	ListerHospitalListPage listerHospitalListPage = new ListerHospitalListPage(DriverFactory.getDriver());
	FacilitiesPage facilitiesPage = new FacilitiesPage(DriverFactory.getDriver());

	@When("user click view our facilities")
	public void user_click_view_our_facilities() throws InterruptedException {
		facilitiesPage.clickViewOurFacilities();

	}

	@When("click The lister hospital tab")
	public void click_the_lister_hospital_tab() {
		facilitiesPage.clickTheListerHospitalTab();

	}

	@Then("The Lister Hospital Locations is displayed")
	public void the_lister_hospital_locations_is_displayed() {
		listerHospitalListPage.getListerHospitalList();
	}

	@Then("the page title is The Lister Hospital | HCA UK")
	public void the_page_title_is_the_lister_hospital_hca_uk() {
		Assert.assertEquals(listerHospitalListPage.getPageTitle(), "The Lister Hospital | HCA UK");

	}
	
	@Then("there should be fourteen Lister hospital locations")
	public void there_should_be_lister_hospital_locations() {
		
	}


}
