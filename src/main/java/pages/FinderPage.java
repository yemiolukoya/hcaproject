package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import utilities.JavaScriptExecutor;

public class FinderPage {

	private WebDriver driver;
	JavaScriptExecutor js = new JavaScriptExecutor();

	public FinderPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//input[@id=\"doctify_autocomplete_input\"]")

	private WebElement conditionDrpDwn;

	public void clickConditionDrpDwn() {
		js.javaScriptClick(driver, conditionDrpDwn);

	}

	@FindBy(xpath = "//span[text()=\"Dentistry\"]")
	private WebElement selectCondition;

	public void selectCondition() {
		js.javaScriptClick(driver, selectCondition);
	}

	@FindBy(xpath = "//input[@id='doctify_search_input_practices']")
	private WebElement hospitalDrpDwn;

	public void clickHospitalDrpDwn() {
		js.javaScriptClick(driver, hospitalDrpDwn);
	}

	@FindBy(xpath = "//ul[@id='doctify_practices_dropdown_list']//li//div//div[contains(text(),'The Lister Hospital')]")
	private WebElement selectHospital;

	public void selectHospital() {
		js.javaScriptClick(driver, selectHospital);
	}

	@FindBy(xpath = "//button[@id='doctify_search_widget_search_button']")
	private WebElement searchBtn;

	public void clickSearchBtn() {
		js.javaScriptClick(driver, searchBtn);
	}

	public String getSpecialistsPageTitle() {
		return driver.getTitle();
	}

	@FindBy(xpath = "//input[@id='doctify_location_input']")
	private WebElement location;

	public void enterLocation() {
		location.sendKeys("se9 2jb");
	}

	@FindBy(xpath = "//body//div[@id='root-layout']//div//div//div//div[2]//div[1]//div[2]//div[1]//div[1]//h3[1]//a[1]")
	private WebElement expert;

	public String getExpertName() {
		return expert.getText();
	}
}
