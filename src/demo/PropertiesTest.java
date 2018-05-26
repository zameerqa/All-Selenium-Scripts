package demo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PropertiesTest {
	WebDriver driver;
	WebElement userName,password,loginBtn;
	@BeforeMethod
	public void setUp() throws Exception{

		if(commonProperty("browser").equals("firefox")){
			driver=new FirefoxDriver();
		}
		else if(commonProperty("browser").equals("chrome")){

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Desktop\\Selenium\\chrome driver\\chromedriver.exe");
		driver=new ChromeDriver();

		}
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		//String url=commonProperty("url");
		driver.get(commonProperty("url"));
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		

	}
	@AfterMethod
	public void loginTest() throws Exception{
		Thread.sleep(5000);
		//driver.quit();
	}
	@Test
	public void fbLogin() throws Exception{
		userName=driver.findElement(By.id(commonProperty("emailOrPhone_id")));
		userName.clear();
		userName.sendKeys(commonProperty("name"));
		password=driver.findElement(By.id(commonProperty("password_id")));
		password.clear();
		password.sendKeys(commonProperty("password"));
		loginBtn=driver.findElement(By.xpath(commonProperty("login_xpath")));
		loginBtn.click();
	}
	
	public static String commonProperty(String key) throws Exception{
		Properties prop=new Properties();
		FileInputStream fis=new FileInputStream("E:\\Practice\\SeleniumTraining\\src\\demo\\config.properties");
		prop.load(fis);
		return prop.getProperty(key);
	}

}
