package demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandlingLinks {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.google.com");
		List<WebElement> links=driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		for(WebElement allLinks:links){
			System.out.println(allLinks.getText());
		}
		
	}

}
