package demo;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest {
	
	@Test(dataProvider="data")
	public void m1(String x,String y){
		System.out.println(x);
		System.out.println(y);
	}
	@DataProvider(name="data")
	@Test
	public Object[][] m2(){
		return new Object[][]{{"1","2"},{"3","4"}};
		
	}

}
