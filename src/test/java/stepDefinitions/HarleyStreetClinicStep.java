package stepDefinitions;

import java.util.List;

import org.junit.Assert;

import driverFactory.DriverFactory;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;
import pages.HarleyStreetClinicPage;
import pages.HomePage;

public class HarleyStreetClinicStep {

	private static String title;

	HarleyStreetClinicPage harleyStreetClinicPage = new HarleyStreetClinicPage(DriverFactory.getDriver());
	private HomePage homePage = new HomePage(DriverFactory.getDriver());

	@Given("user click The Harley Street Clinic tab")
	public void user_click_the_harley_street_clinic_tab() throws InterruptedException {
		homePage.acceptCookie();
		harleyStreetClinicPage.clickHarleyStreetClinic();

	}

	@Given("the page title is displayed as {string}")
	public void the_page_title_is_displayed_as(String pageTitle) {

//		title = harleyStreetClinicPage.getHarleyStreetClinicPageTitle();
//		System.out.println(title);
//
//		Assert.assertTrue(title.contains(pageTitle));

		Assert.assertEquals(harleyStreetClinicPage.getHarleyStreetClinicPageTitle(),
				"The Harley Street Clinic | HCA UK");

	}

	@Then("the clinic address is displayed")
	public void the_clinic_address_is_displayed() {
		harleyStreetClinicPage.isHarleyStreetAddressDisplayed();
	}

	@Then("user gets The Harley Street Clinic locations list")
	public void user_gets_the_harley_street_clinic_locations_list(DataTable ClinicLoctionList) {

		List<String> expectedClinicLoctionList = ClinicLoctionList.asList();

		System.out.println("Expected location list" + expectedClinicLoctionList);

		List<String> actualClinicLoctionList = harleyStreetClinicPage.getClinicLocationList();
		System.out.println("Actual clinic location list" + actualClinicLoctionList);
		Assert.assertTrue(expectedClinicLoctionList.containsAll(actualClinicLoctionList));

	}

	@Then("The Harley Street Clinic locations list count should be {int}")
	public void the_harley_street_clinic_locations_list_count_should_be(Integer expectedClinicCount) {
		System.out.println(harleyStreetClinicPage.getClinicLocationListCount());
		 Assert.assertTrue(harleyStreetClinicPage.getClinicLocationListCount()==expectedClinicCount);

	}

}
