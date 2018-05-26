package demo;

import java.awt.RenderingHints.Key;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.bouncycastle.asn1.x509.KeyUsage;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.sun.jna.platform.win32.Wdm.KEY_BASIC_INFORMATION;

public class AutoSuggestions {
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
		driver.findElement(By.id("lst-ib")).sendKeys("Selenium");
		//driver.findElement(By.name("btnK")).click();
		//Thread.sleep(5000);
		//driver.findElement(By.className("lsb")).click();
		
		
		List<WebElement> suggestions= driver.findElements(By.xpath("//ul/li/div/div[2]"));
		System.out.println(suggestions.size());
		
		for(WebElement options:suggestions){
			for(WebElement option:suggestions){
				System.out.println(option.getText());
				}
			if(options.getText().equals("selenium")){
				
				options.click();
				break;
			
			}
		}
		
		
		//driver.findElement(By.linkText("Selenium - Web Browser Automation")).click();
			
		
	}

}
