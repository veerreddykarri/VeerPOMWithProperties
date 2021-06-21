package pages;

import java.util.Properties;

import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjectSpecificMethods;

public class CreateLeadPage extends ProjectSpecificMethods {
	
	public CreateLeadPage(ChromeDriver driver, Properties prop){
		this.driver = driver;
		this.prop = prop;
		
	}
	
	public CreateLeadPage enterCompanyName(String company) {
		driver.findElementById("createLeadForm_companyName").sendKeys(company);
		return this;
	}

	public CreateLeadPage enterFirstName(String fName) {
		driver.findElementById("createLeadForm_firstName").sendKeys(fName);
		return this;
	}
	
	public CreateLeadPage enterLastName(String lName) {
		driver.findElementById("createLeadForm_lastName").sendKeys(lName);
		return this;
	}
	
	public ViewLeadPage clickCreateLeadButton() {
		driver.findElementByName("submitButton").click();
		return new ViewLeadPage(driver,prop);
	}
}
