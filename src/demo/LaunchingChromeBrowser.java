package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchingChromeBrowser {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Desktop\\Selenium\\chrome driver\\chromedriver.exe");
		//WebDriver driver=new ChromeDriver();
		//ChromeDriver driver=new ChromeDriver();
		

		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		
		//driver.manage().window().maximize();
		
		System.out.println("***Handling Text Element**");
		
		String creatAnAccount=driver.findElement(By.xpath("//span[text()='Create an account']")).getText();
		System.out.println(creatAnAccount);
		
		System.out.println("***Handling Text Field*****");
		
		//driver.findElement(By.id("u_0_h")).clear();
		//driver.findElement(By.id("u_0_h")).sendKeys("abc");
		
		WebElement firstName=driver.findElement(By.id("u_0_h"));
		firstName.clear();
		firstName.sendKeys("abc");
		
		System.out.println("***Handling Radio Buttons*****");
		
		WebElement gendor=driver.findElement(By.xpath("//label[text()='Male']"));
		gendor.click();
		Thread.sleep(5000);
		Boolean b=gendor.isSelected();
		System.out.println(b);
		
		
	}

}
