package demo;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider_TestCases {
	
	WebDriver driver;
	@BeforeMethod
	public void setUp(){

		driver=new FirefoxDriver();

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Desktop\\Selenium\\chrome driver\\chromedriver.exe");
		//driver=new ChromeDriver();

		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();

	}
	@Test(dataProvider="testData")
	public void loginFB(String uName,String pwd){
		driver.findElement(By.id("email")).sendKeys(uName);
		driver.findElement(By.id("pass")).sendKeys(pwd);
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
	}
	@DataProvider(name="testData")
	public Object[][] testData(){
	
		return new Object[][]{{"abc","1213"},{"xyz","456"},{"lmn","789"}};
	}
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}

}
