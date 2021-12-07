package stepDefinitions;

import java.util.List;

import org.junit.Assert;

import driverFactory.DriverFactory;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;
import pages.BookAnAppointmentPage;
import pages.HomePage;
import pages.LocationsPage;

public class LocationsStep {

	private HomePage homePage = new HomePage(DriverFactory.getDriver());
	private LocationsPage locationsPage = new LocationsPage(DriverFactory.getDriver());

	@When("user click locations link")
	public void user_click_locations_link() {
		homePage.clickLocationsLink();
	}
//	@Then("hospital list should be displayed")
//	public void hospital_list_should_be_displayed() {
//		locationsPage.locationsList(); 
//
//	}

	@When("user is on location page")
	public void user_is_on_location_page() {
		locationsPage.getLocationPageTitle();
	}

	@Then("user gets hospital list")
	public void user_gets_hospital_list(DataTable loctionSectionList) {
		
		List<String> expectedLocationList = loctionSectionList.asList();
		
		System.out.println("Expected location list" + expectedLocationList);
		
		List<String> actualLocationList = locationsPage.getLocationSectionList();
		System.out.println("Actual location list" + actualLocationList);
		//Assert.assertTrue(expectedLocationList.containsAll(actualLocationList));

	}

	@When("user see all locations tab")
	public void user_see_all_locations_tab() {
		locationsPage.clickSeeAllLocationTab();
	}

	// Assertion

	@Then("locations page should be displayed")
	public void locations_page_should_be_displayed() {

		Assert.assertTrue(locationsPage.islocationTextDisplayed());

	}

	@Then("hospital count should be {int}")
	public void hospital_count_should_be(Integer expectedLocationCount) {
		System.out.println(locationsPage.getLocationListCount());
Assert.assertTrue(locationsPage.getLocationListCount() == expectedLocationCount);

	}

}
