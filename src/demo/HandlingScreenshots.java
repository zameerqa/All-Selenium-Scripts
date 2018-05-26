package demo;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandlingScreenshots {
	static WebDriver driver;
	@Before
	public void setUp(){

		driver=new FirefoxDriver();

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Desktop\\Selenium\\chrome driver\\chromedriver.exe");
		//driver=new ChromeDriver();

		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();

	}
	@After
	public void tearDown() throws Exception{
		Thread.sleep(5000);
		driver.quit();
	}
	@Test
	public void testFrames() throws Exception{
		String result=forgottenAcc();
		System.out.println(result);


	}
	public static String forgottenAcc() throws Exception {
		try{

			driver.findElement(By.linkText("Forgotten account?")).click();
			driver.findElement(By.id("did_subm")).click();
			return "Test Case Passed";
		}
		catch(Exception e){

			SimpleDateFormat df=new SimpleDateFormat("MM-dd-yy HH-mm-ss");
			Date date=new Date();

			File source=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

			File dest=new File("C:\\Users\\Administrator\\Desktop\\Screenshot\\"+df.format(date)+".png");

			FileUtils.copyFile(source, dest);


			return "Test Case Failed";
		}

	}

}
