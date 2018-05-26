package demo;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderDemo {
	
	
	@Test(dataProvider="inputs")
	public void m1(String x,String y){
		
		System.out.println(x);
		System.out.println(y);
		
	}
	@DataProvider(name="inputs")
	public Object[][] m2(){
		Object[][] value=new Object[2][2];
		value[0][0]="abc";
		value[0][1]="xyz";
		value[1][0]="zameer";
		value[1][1]="khan";
		return value;
		
		//   OR
		//return new Object[][]{{"abc","xyz"},{"zameer","khan"}};
	}

}
