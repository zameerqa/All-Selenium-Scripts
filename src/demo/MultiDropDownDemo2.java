package demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiDropDownDemo2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Desktop\\Selenium\\chrome driver\\chromedriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://jobs.brassring.com/1033/ASP/TG/cim_advsearch.asp?sec=1&partnerid=14113&siteid=5009");
		WebElement options=driver.findElement(By.id("Question6758__Department"));
		Select select=new Select(options);
		select.selectByIndex(0);
		select.selectByIndex(1);
		select.selectByIndex(2);
		
		WebElement firstOption=select.getFirstSelectedOption();
		System.out.println(firstOption.getText());
				
		List<WebElement> allSelected = select.getAllSelectedOptions();
		System.out.println(allSelected.size());

		/*for(int i=0;i<allSelected.size();i++){
			System.out.println(allSelected.get(i).getText());
		}*/
		
		for(WebElement allSelectedOptions:allSelected){
			System.out.println(allSelectedOptions.getText());
		}
	}

}
