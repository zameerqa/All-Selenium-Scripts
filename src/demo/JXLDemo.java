package demo;

import java.io.FileInputStream;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import jxl.Sheet;
import jxl.Workbook;

public class JXLDemo {
	WebDriver driver;
	@BeforeMethod
	public void setUp(){

		driver=new FirefoxDriver();

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Desktop\\Selenium\\chrome driver\\chromedriver.exe");
		//driver=new ChromeDriver();

		driver.get("https://www.google.com/?gws_rd=ssl");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();

	}
	@AfterMethod
	public void tearDown() throws Exception{
		Thread.sleep(5000);
		//driver.quit();
	}
	@Test
	public void testFrames() throws Exception{

		/*driver.findElement(By.id("lst-ib")).sendKeys("Selenium");
		driver.findElement(By.className("lsb")).click();

		driver.navigate().back();
		Thread.sleep(2000);
		driver.findElement(By.id("lst-ib")).sendKeys("Java");
		driver.findElement(By.className("lsb")).click();*/
		
		
		//Locate Path
		FileInputStream fis=new FileInputStream("E:\\Practice\\Excel\\TestData.xls");
		//Get Workbook
		
		Workbook wb=Workbook.getWorkbook(fis);
		Sheet s=wb.getSheet(0);
		System.out.println(s.getRows());
		System.out.println(s.getColumns());
		for(int i=0;i<s.getRows();i++){
			//driver.findElement(By.id("lst-ib")).clear();
			driver.findElement(By.id("lst-ib")).sendKeys(s.getCell(0, i).getContents());
			driver.findElement(By.className("lsb")).click();
			driver.navigate().back();
			Thread.sleep(2000);
		}
		
		
	}

}
