package base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import utils.ReadExcel;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class ProjectSpecificMethods {
	
	public ChromeDriver driver;
	public String excelFileName;
	public Properties prop;
	
	@Parameters({"language"})
	@BeforeMethod
	public void preCondition(String lang) throws IOException {
		//to set up properties file
		FileInputStream fis = new FileInputStream("./src/main/resources/"+lang+".properties");
		prop = new Properties();
		prop.load(fis);
			
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("http://leaftaps.com/opentaps/control/main");

	}
	
	@AfterMethod
	public void postCondition() {
		driver.close();

	}
	
	@DataProvider(indices=0) 
	public Object[] sendData() throws IOException {
	
		return ReadExcel.excelData(excelFileName);
	}

}
