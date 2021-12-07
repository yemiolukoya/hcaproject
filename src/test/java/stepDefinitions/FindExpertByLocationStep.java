package stepDefinitions;

import driverFactory.DriverFactory;
import io.cucumber.java.en.Given;
import junit.framework.Assert;
import pages.FinderPage;

public class FindExpertByLocationStep {
	
	FinderPage finderPage = new FinderPage(DriverFactory.getDriver());
	@Given("enter a location")
	public void enter_a_location() {
		finderPage.enterLocation();  
		
		
		
		
	}

}
