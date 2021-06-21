package pages;

import java.util.Properties;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import base.ProjectSpecificMethods;

public class ViewLeadPage extends ProjectSpecificMethods {
	public ViewLeadPage(ChromeDriver driver, Properties prop){
		this.driver = driver;
		this.prop = prop;
		
	}
	
	public ViewLeadPage verifyFirstName() {
		boolean displayed = driver.findElementById("viewLead_firstName_sp").isDisplayed();
		Assert.assertTrue(displayed);
		return this;
	}
	

}
