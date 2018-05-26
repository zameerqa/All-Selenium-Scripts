package demo;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandlingWindows {
	WebDriver driver;
	@Before
	public void setUp(){
		
		driver=new FirefoxDriver();
		driver.get("https://www.irctc.co.in/eticketing/loginHome.jsf");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
	}
	@After
	public void tearDown() throws Exception{
		Thread.sleep(3000);
		driver.quit();
	}
	@Test
	public void testIrctc(){

		driver.findElement(By.linkText("Contact Us")).click();
		driver.findElement(By.linkText("Alerts & Updates")).click();
		driver.findElement(By.xpath("//a[text()=' Claim Your Offer']")).click();
		//String homePage=driver.getTitle();
		System.out.println(driver.getTitle());
		System.out.println("Handle of the Home Page :"+driver.getWindowHandle());
		Set<String> allHandles=driver.getWindowHandles();
		System.out.println("No.of handles :"+allHandles.size());
		/*for(String tabs:allHandles){
			System.out.println(tabs);
		}*/
		Iterator<String> iterator=allHandles.iterator();
		String homePage=iterator.next();
		String contactUsPage=iterator.next();
		String alertsUdatesPage=iterator.next();
		String claimYourOfferPage=iterator.next();
		
		driver.switchTo().window(claimYourOfferPage);
		System.out.println(driver.getTitle());
		
		driver.switchTo().window(contactUsPage);
		System.out.println(driver.getTitle());
		driver.close();
		
		System.out.println("No.of handles :"+allHandles.size());
		
		Set<String> allHandles1=driver.getWindowHandles();
		System.out.println("No.of handles :"+allHandles1.size());
		
		
		driver.switchTo().window(claimYourOfferPage);
		System.out.println(driver.getTitle());
		
		driver.switchTo().window(homePage);
		System.out.println(driver.getTitle());
		
		driver.switchTo().window(contactUsPage);
		System.out.println(driver.getTitle());
		
		
	}	
	}
