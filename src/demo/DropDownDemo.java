package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownDemo {

	public static void main(String[] args) {

		WebDriver driver= new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		
		/*driver.findElement(By.id("u_0_h")).clear();
		driver.findElement(By.id("u_0_h")).sendKeys("abc");*/
		
		WebElement firstName=driver.findElement(By.id("u_0_h"));
		firstName.clear();
		firstName.sendKeys("abc");
		
		WebElement surName=driver.findElement(By.id("u_0_j"));
		surName.clear();
		surName.sendKeys("xyz");
		
		WebElement mobileNumber=driver.findElement(By.id("u_0_m"));
		mobileNumber.clear();
		mobileNumber.sendKeys("123456789");
		
		WebElement password=driver.findElement(By.id("u_0_t"));
		password.clear();
		password.sendKeys("abc123");
		
		WebElement day=driver.findElement(By.id("day"));
		Select dayDropdown=new Select(day);
		dayDropdown.selectByIndex(18);
		
		}

}
