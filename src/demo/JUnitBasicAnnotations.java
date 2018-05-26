package demo;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class JUnitBasicAnnotations {
	WebDriver driver;
	@Before
	public void setUp(){

		driver=new FirefoxDriver();

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Desktop\\Selenium\\chrome driver\\chromedriver.exe");
		//driver=new ChromeDriver();

		driver.get("https://www.google.com/?gws_rd=ssl");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();

	}
	@After
	public void tearDown() throws Exception{
		Thread.sleep(5000);
		//driver.quit();
	}
	
	@Test
	public void testFrames() throws Exception{







	}

}
