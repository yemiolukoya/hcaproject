package stepDefinitions;

import org.junit.Assert;

import driverFactory.DriverFactory;
import io.cucumber.java.en.*;
import pages.HomePage;
import pages.OnlinePaymentPage;
import pages.SearchPage;

public class SearchStep {
	private SearchPage searchPage = new SearchPage(DriverFactory.getDriver());

	private HomePage homePage = new HomePage(DriverFactory.getDriver());

	@When("user click on the search field")
	public void user_click_on_the_search_field() {
		homePage.clickSearchField();
	}

	@When("user type a word in the search field")
	public void user_type_a_word_in_the_search_field() {
		searchPage.enterSearchTxt();

	}

	@When("click on the search icon")
	public void click_on_the_search_icon() {
		searchPage.clickSearchBtn();
	}

	@Then("result will be return")
	public void result_will_be_return() {
		boolean searchWord = searchPage.isSearchWordDisplayed();

		if (searchWord)

			Assert.assertTrue(true);
		else

			Assert.assertTrue(false);

	}

	// Scenario: Search result sort
	@Then("sort result A-Z")
	public void sort_result_a_z() {
		searchPage.clickSortAZ();
		searchPage.clickAZsort();

//		boolean sortedWord = searchPage.is_a_z_SortedWordDisplayed();
//		System.out.println(sortedWord);
//
//		if (sortedWord)
//
//			Assert.assertTrue(true);
//		else
//
//			Assert.assertTrue(false);

		if (searchPage.is_a_z_SortedWordDisplayed()) {
			Assert.assertTrue(true);

		}

		else

		{
			Assert.assertTrue(false);

		}

	}

}
