package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage {

	private WebDriver driver;
	JavascriptExecutor js;


	public SearchPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(id = "searchTextBoxGlobal")
	private WebElement searchField;

	public void enterSearchTxt() {
		searchField.sendKeys("knee");
	}

	@FindBy(xpath = "//button[@value='search']//em[@class='icon icon-search active']")
	private WebElement searchBtn;

	public void clickSearchBtn() {
		 JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].click();", searchBtn);
}

	@FindBy(xpath = "(//a[@title='Find out more about Knee arthroscopy'])[1]")
	private WebElement searchWord;

	public boolean isSearchWordDisplayed()

	{
		try {
			return (searchWord.isDisplayed());
		} catch (Exception e) {
			return (false);
		}
	}

	@FindBy(xpath = "//button[normalize-space()='Sort By']")
	private WebElement searchSort;

	public void clickSortAZ() {
		 JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].click();", searchSort);

	}

	@FindBy(xpath = "//a[normalize-space()='A-Z']")
	private WebElement sortBy;

	public void clickAZsort() {
		 JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].click();", sortBy);
	}

	@FindBy(xpath = "//a[@title=\"Find out more about Find a sports and exercise physician\"]")
	// @FindBy(xpath =
	// "//div[@data-hca-searchtype='globalsearch']//div//div//div//h4//a[@title='Find
	// out more about Find a sports and exercise physician']")
	private WebElement a_z_Sort;

	public boolean is_a_z_SortedWordDisplayed()

	{
		try {
			return (a_z_Sort.isDisplayed());
		} catch (Exception e) {
			return (false);
		}
	}
}
