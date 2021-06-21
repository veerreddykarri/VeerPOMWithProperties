package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecificMethods;
import pages.LoginPage;

public class VerifyLogin extends ProjectSpecificMethods{
	@BeforeTest
	public void setFileName() {
		excelFileName = "Login";

	}
		
	@Test(dataProvider = "sendData")
	public void runLogin(String username, String password) throws InterruptedException {
		
		//System.out.println(driver);
	
		new LoginPage(driver,prop)
		.enterUsername(username)
		.enterPassword(password)
		.clickLoginButton()
		.verifyHomePage();
		
	}
	

	
	

}
