package stepDefinitions;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import driverFactory.DriverFactory;
import io.cucumber.java.en.*;
import pages.FooterLinksPage;

public class FooterLinksStep {
	
	WebDriver driver;

	private FooterLinksPage footerLinksPage = new FooterLinksPage(DriverFactory.getDriver());

	@When("user navigate to the footer of the home page")
	public void user_navigate_to_the_footer_of_the_home_page() {
		//footerLinksPage.clickHCAinTheUKlink();
	}

	@Then("there should be twentyfive footer links")
	public void there_should_be_footer_links() {
		footerLinksPage.getAllLinks();


	}

}
