package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SalesForceDemo {

	public static void main(String[] args) throws Exception {
		WebDriver driver;
		driver=new FirefoxDriver();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Desktop\\Selenium\\chrome driver\\chromedriver.exe");
		//driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.salesforce.com/in/?ir=1");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='nav_login buttonCTAItemComponent parbase']/div/a/span[2]")).click();
		
		
		/*driver.get("https://login.salesforce.com/?locale=in");
		driver.findElement(By.id(("username"))).sendKeys("khan.zameer567@gmail.com");
		driver.findElement(By.id(("password"))).sendKeys("khans446");
		driver.findElement(By.id("Login")).click();
		Thread.sleep(1000);*/
		
		
	}

}
