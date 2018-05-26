package demo;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SynchronizationDemo {
	WebDriver driver;
	@Before
	public void setUp(){
		
		driver=new FirefoxDriver();
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Desktop\\Selenium\\chrome driver\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Desktop\\Selenium\\chrome driver\\chromedriver.exe");
		//WebDriver driver=new ChromeDriver();
		//driver=new ChromeDriver();

		driver.get("https://www.google.com/?gws_rd=ssl");
		driver.manage().deleteAllCookies();
	
	}
	@After
	public void tearDown() throws Exception{
		Thread.sleep(5000);
		//driver.quit();
	}
	@Test
	public void testFrames() throws Exception{
		driver.findElement(By.id("lst-ib")).sendKeys("Sele");
		//driver.findElement(By.id("lst-ib")).sendKeys(Enter);
		
		
		List<WebElement> suggestions= driver.findElements(By.xpath("//li[@class='sbsb_c gsfs']/div/div[2]"));
		for(WebElement options:suggestions){
			
			if(options.equals("Selenium")){
				options.click();
			}
		}
		driver.findElement(By.name("btnK")).click();
		
		//driver.findElement(By.linkText("Selenium - Web Browser Automation")).click();
		//driver.findElement(By.xpath("//div[@class='sbqs_c']")).click();
		
		
	}

}
