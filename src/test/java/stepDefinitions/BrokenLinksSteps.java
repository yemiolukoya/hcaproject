package stepDefinitions;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.*;

public class BrokenLinksSteps {
	WebDriver driver;

	@When("user get all the page urls")
	public void user_get_all_the_page_urls() throws IOException, InterruptedException {

//		List<WebElement> links = driver.findElements(By.linkText("a"));
//		System.out.println("Total links on the Wb Page: " + links.size());
//
//		// Number of links
//		System.out.println(links.size());
//
//		for (int i = 0; i < links.size(); i++) {
//
//			// by using href attribute we can get URL of links
//
//			WebElement element = links.get(i);
//			String url = element.getAttribute("href");
//			
//			URL link = new URL(url);
//			
//			// create a connection using url object 'link'
//			HttpURLConnection httpConn = (HttpURLConnection)link.openConnection();
//			
//			//wait time 2 second
//			Thread.sleep(2000);
//			
//			//establish connection
//			httpConn.connect();
//			
//			int responseCode = httpConn.getResponseCode(); //return response code. if response code is above 400 = broken link
//			
//			if(responseCode>=400) {
//				System.out.println(url +" - " + " is broken link");
//			}
//			else {
//				System.out.println(url +" - " + " is valid link");
//
//			}
		//}

	}

	@When("iterate through the list and check elements in the list")
	public void iterate_through_the_list_and_check_elements_in_the_list() {

	}

	@Then("broken links should be displayed")
	public void broken_links_should_be_displayed() {

	}

}
