package pages;

import java.util.Properties;

import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjectSpecificMethods;

public class MyHomePage extends ProjectSpecificMethods {

	public MyHomePage(ChromeDriver driver, Properties prop){
		this.driver = driver;
		this.prop = prop;
		
	}
	public MyLeadsPage clickLeadsLink() {
		//english -> Leads ; french -> Prospects
		driver.findElementByLinkText(prop.getProperty("MyHomePage.Leads.LinkText")).click();
		return new MyLeadsPage(driver,prop);
	}
	
}
