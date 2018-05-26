package demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderAnnotation {
	WebDriver driver;

	@BeforeMethod
	public void browserLaunch(){

		//System.setProperty("webdriver.gecko.driver","E:\\Selenium\\FCI\\geckodriver.exe");
		driver=new FirefoxDriver();
		//System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\FCI\\chromedriver.exe");
		//d =new ChromeDriver();
		// Load application
		driver.get("http://www.facebook.com");
		//Maximize browser
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
	}
	// this will take data from dataprovider which we created
	@Test(dataProvider="testdata")
	public void TestFireFox(String uname,String password){
		
		// clear email field

		driver.findElement(By.id("email")).clear();


		// Enter usename
		driver.findElement(By.id("email")).sendKeys(uname);


		// Clear password field
		driver.findElement(By.id("pass")).clear();



		// Enter password
		driver.findElement(By.id("pass")).sendKeys(password);
	}

	// this is DataProvider which actually feed data to our test cases here I have taken 2 D //array with 2 rows and 2 column it means. It will run our test case two times because we //have taken 2 rows. While first iteration this will pass username and password to test //case and in second iteration perform the same for second rows
	@DataProvider(name="testdata")
	public Object[][] TestDataFeed(){
		// Create object array with 2 rows and 2 column- first parameter is row and second is //column
		Object [][] facebookdata=new Object[2][2];
		// Enter data to row 0 column 0
		facebookdata[0][0]="Selenium1@gmail.com";
		// Enter data to row 0 column 1
		facebookdata[0][1]="Password1";
		// Enter data to row 1 column 0
		facebookdata[1][0]="Selenium2@gmail.com";

		// Enter data to row 1 column 0
		facebookdata[1][1]="Password2";

		// return arrayobject to testscript
		return facebookdata;
	}
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
}