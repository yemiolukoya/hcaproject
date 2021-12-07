package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import org.junit.Assert;

public class FooterLinksPage {

	private WebDriver driver;

	public FooterLinksPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//a[@href=\"/about-hca-uk\"]")

	private WebElement HCAinTheUKlink;

	public void clickHCAinTheUKlink() {

		HCAinTheUKlink.click();
	}

public void getAllLinks() {
		List<WebElement>footerCount=driver.findElements(By.xpath("//a[@class=\"footer__menu-link\"]"));
		
		for(WebElement i:footerCount) 
		{
			System.out.println(i.getText());
		}
		
		Assert.assertEquals(25, footerCount.size());
		

	}



}
