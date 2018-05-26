package demo;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiDropDown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Desktop\\Selenium\\chrome driver\\chromedriver.exe");
		//WebDriver driver=new ChromeDriver();
		//ChromeDriver driver=new ChromeDriver();
		

		WebDriver driver=new FirefoxDriver();
		driver.get("https://jobs.brassring.com/1033/ASP/TG/cim_advsearch.asp?sec=1&partnerid=14113&siteid=5009");
		WebElement dropDown=driver.findElement(By.id("Question6758__Department"));
		Select city=new Select(dropDown);
		
		Boolean multiDropdown=city.isMultiple();
		if(multiDropdown){
		System.out.println("It is a MultiDropDown");
		}else
			System.out.println("It is Not a MultiDropDown");
		
		Assert.assertTrue(multiDropdown);
		
		//city.selectByIndex(2);
		//city.selectByValue("AnswerName&=|Marketing=X|%%%AnswerValue&=|Marketing=X|%%%GDEAnswerValue&=|=X|???");
		//city.selectByVisibleText("Marketing");
		
		/*city.selectByIndex(0);
		city.selectByIndex(1);
		city.selectByIndex(2);*/
		
			
		System.out.println(city.getOptions().size());
		
		for(int i=1;i<3;i++ ){
			city.selectByIndex(i);
			
		}
		
		System.out.println("The First Selected Option is : "+city.getFirstSelectedOption().getText());
		
		
		List<WebElement> options=city.getAllSelectedOptions();
		System.out.println(options.size());
		/*for(int i=1;i<options.size();i++){
			System.out.println(options.get(i).getText());
		}*/
	
		List<WebElement> allOptions=city.getOptions();
		for(WebElement cities:allOptions){
			System.out.println(cities.getText());
		}
		
	}

}
