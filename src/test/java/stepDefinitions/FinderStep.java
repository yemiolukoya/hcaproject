package stepDefinitions;

import org.junit.Assert;

import driverFactory.DriverFactory;
import io.cucumber.java.en.*;
import pages.FinderPage;

public class FinderStep {

	FinderPage finderPage = new FinderPage(DriverFactory.getDriver());

	@Given("user opens URL {string}")
	public void user_opens_url(String string) {
		DriverFactory.getDriver().get("https://finder.hcahealthcare.co.uk/hca/");

	}

	@Given("choose a condition")
	public void choose_a_condition() {
		finderPage.clickConditionDrpDwn();
		finderPage.selectCondition();
	}

	@Given("select a hospital")
	public void select_a_hospital() {
		finderPage.clickHospitalDrpDwn();
		finderPage.selectHospital();

	}

	@When("user click search")
	public void user_click_search() {
		finderPage.clickSearchBtn();

	}

	@Then("search result should be displayed")
	public void search_result_should_be_displayed() {
		
		String  pageTitle = finderPage.getSpecialistsPageTitle();
		
		Assert.assertEquals("Top Rated Specialists in London in 2021", pageTitle);
		
		

	}

}
