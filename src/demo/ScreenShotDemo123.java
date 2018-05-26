package demo;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ScreenShotDemo123 {
	WebDriver d ;
	@BeforeMethod
	public void browserLaunch(){

		//System.setProperty("webdriver.gecko.driver","E:\\Selenium\\FCI\\geckodriver.exe");
		d=new FirefoxDriver();
		//System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\FCI\\chromedriver.exe");
		//d =new ChromeDriver();
		//Maximize browser
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
	}
	@Test
	public void fb() throws Exception{
		String s=result();
		System.out.println(s);
	}
	public String result() throws Exception{
		try{
			d.get("https://www.facebook.com/");

			d.findElement(By.linkText("Forgotten account?")).click();

			d.findElement(By.id("loginbutto")).click();
			//d.findElement(By.id("did_submit")).click();
			return "Test case Passed";
		}
		catch(Exception e){
			DateFormat df=new SimpleDateFormat("MM-dd-YY HH:mm:ss");
			Date dt=new Date();
			File screenshot=((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);
			File path=new File("C:\\Users\\Administrator\\Desktop\\retrylogic\\"+df.format(dt)+".png");
			FileUtils.copyFile(screenshot, path);
			return "Test case Failed";
		}
	}
	@AfterMethod
	public void browserKilling(){
		d.quit();
	}

}