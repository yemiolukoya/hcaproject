package pages;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ListerHospitalListPage {
	
	private WebDriver driver;

	public ListerHospitalListPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}
	
	
	public void getListerHospitalList() {

		List<WebElement> ListerHospitalList = driver.findElements(By.xpath("//button[@class=\"button--remove-default interactive-list__button\"]"));
		for (WebElement i : ListerHospitalList) {
			System.out.println(i.getText());
			
			Assert.assertEquals(14, ListerHospitalList.size());

		}
	}
		public void getListerHospitalSize() {

			List<WebElement> ListerHospitalSize = driver.findElements(By.xpath("//button[@class=\"button--remove-default interactive-list__button\"]"));
			for (WebElement j : ListerHospitalSize) {
				ListerHospitalSize.size();
			}

		

	}
	
	public String getPageTitle() {
		return driver.getTitle();
	}
}
