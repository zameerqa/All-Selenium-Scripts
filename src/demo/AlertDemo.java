package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AlertDemo {

	public static void main(String[] args) throws Exception {
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.irctc.co.in/eticketing/loginHome.jsf");
		driver.findElement(By.id("loginbutton")).click();
		//driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(5000);
		String alertText=driver.switchTo().alert().getText();
		System.out.println(alertText);
		driver.switchTo().alert().accept();
		
		
	}

}
