package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchingFF {

	public static void main(String[] args) {
		
		//Launch FF
		FirefoxDriver driver=new FirefoxDriver();
		
		//Load Web Page		
		driver.get("https://www.google.co.in/?gfe_rd=cr&dcr=0&ei=JYrVWubiNJa1rAHwqZaoBw");
		
		//Enter the text in search field
		driver.findElement(By.id("lst-ib")).clear();
		driver.findElement(By.id("lst-ib")).sendKeys("Java");
		
		//Clicking on the Google Search Btn
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		

	}

}
