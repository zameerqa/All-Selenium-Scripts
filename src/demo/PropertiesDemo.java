package demo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PropertiesDemo {
	

	public static void main(String[] args) throws Exception {
		WebDriver driver;
		Properties prop=new Properties();
		FileInputStream fis=new FileInputStream("E:\\Practice\\SeleniumTraining\\src\\demo\\config.properties");
		prop.load(fis);
		driver=new FirefoxDriver();
		String url=prop.getProperty("url");
		driver.get(url);
		String emialField=prop.getProperty("name");
		driver.findElement(By.id("email")).sendKeys(emialField);
		String pwd=prop.getProperty("password");
		driver.findElement(By.id("pass")).sendKeys(pwd);
		driver.findElement(By.id("u_0_2")).click();

	}

}
