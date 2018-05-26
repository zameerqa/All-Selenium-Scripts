package demo;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandlingFrames {
	WebDriver driver;
	@Before
	public void setUp(){
		
		driver=new FirefoxDriver();
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Desktop\\Selenium\\chrome driver\\chromedriver.exe");
		driver.get("http://seleniumhq.github.io/selenium/docs/api/java/index.html");
	}
	@After
	public void tearDown() throws Exception{
		Thread.sleep(5000);
		//driver.quit();
	}
	@Test
	public void testFrames() throws Exception{
		//Frame with Index
		//driver.switchTo().frame("packageFrame");
		
		//Frame with Name
		//driver.switchTo().frame("packageFrame");
		
		//Frame with Locator
		//driver.switchTo().frame(driver.findElement(By.xpath("//frame[@src='allclasses-frame.html']")));
		
		driver.switchTo().frame(2);
		driver.findElement(By.xpath("//div[1]/ul/li[6]/a")).click();
		Thread.sleep(3000);
		//driver.findElement(By.linkText("org.openqa.selenium")).click();
	}

}
