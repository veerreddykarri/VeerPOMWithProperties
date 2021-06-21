package pages;

import java.util.Properties;

import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjectSpecificMethods;

public class MyLeadsPage extends ProjectSpecificMethods {
	
	public MyLeadsPage(ChromeDriver driver, Properties prop){
		this.driver = driver;
		this.prop = prop;
		
	}
	public CreateLeadPage clickCreateLeadLink() {
		//french -> Créer un prospect ; english -> Create Lead
		driver.findElementByXPath(prop.getProperty("MyLeadsPage.CreateLead.Xpath")).click();
		return new CreateLeadPage(driver,prop);
	}

}
