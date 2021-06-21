package pages;


import java.util.Properties;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import base.ProjectSpecificMethods;

public class HomePage extends ProjectSpecificMethods {
	public HomePage(ChromeDriver driver, Properties prop){
		this.driver = driver;
		this.prop = prop;
		
	}

	public MyHomePage clickCrmsfa() {
		driver.findElementByLinkText("CRM/SFA").click();
		return new MyHomePage(driver,prop);

	}

	public LoginPage clickLogout() {
		driver.findElementByClassName("decorativeSubmit").click();
		return new LoginPage(driver,prop);
	}

	public HomePage verifyHomePage() {
		boolean displayed = driver.findElementByLinkText("CRM/SFA").isDisplayed();
		Assert.assertTrue(displayed);
		return this;

	}

}
