package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserLaunching {

	public static void main(String[] args) {
		WebDriver driver;
		driver=new FirefoxDriver();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Desktop\\Selenium\\chrome driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.google.co.in/?gfe_rd=cr&dcr=0&ei=1-LOWrDOKo_K8AfJ3pZ4");
		driver.findElement(By.partialLinkText("Gma")).click();
	}

}
