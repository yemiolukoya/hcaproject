package stepDefinitions;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import driverFactory.DriverFactory;
import io.cucumber.java.en.*;
import pages.HomePage;

public class OurServicesStep {
	HomePage homePage = new HomePage(DriverFactory.getDriver());

	@When("user scroll to our services page")
	public void user_scroll_to_our_services_page() {
		homePage.listOurServices();
	}

	@Then("service list should be displayed")
	public void service_list_should_be_displayed() {

		String pageTitle = homePage.getPageTitle();

		Assert.assertEquals("Leading Private Healthcare Provider | HCA UK", pageTitle);

	}

}
