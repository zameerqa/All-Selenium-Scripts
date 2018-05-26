package demo;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ScroolDownDemo {
	WebDriver driver;
	@Before
	public void setUp(){

		driver=new FirefoxDriver();

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Desktop\\Selenium\\chrome driver\\chromedriver.exe");
		//driver=new ChromeDriver();

		driver.get("https://www.seleniumhq.org/");
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

		Thread.sleep(3000);
		JavascriptExecutor jsx=(JavascriptExecutor)driver;
		jsx.executeScript("window.scrollBy(0,500)", "");
		Thread.sleep(3000);
		jsx.executeScript("window.scrollBy(0,500)", "");
		Thread.sleep(3000);
		jsx.executeScript("window.scrollBy(0,-300)", "");
		Thread.sleep(3000);
		jsx.executeScript("window.scrollBy(0,-300)", "");

	}

}
