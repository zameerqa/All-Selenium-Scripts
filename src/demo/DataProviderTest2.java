package demo;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest2 {
	
	@Test(dataProvider="data")
	public void m1(String x,String y){
		System.out.println(x);
		System.out.println(y);
		
	}
	
	@DataProvider(name="data")
	public Object[][] testData(){
		/*Object[][] obj=new Object[3][2];
		
		obj[0][0]="abc";
		obj[0][1]="1213";
		obj[1][0]="xyz";
		obj[1][1]="456";
		obj[2][0]="lmn";
		obj[2][1]="789";*/
		return new Object[][]{{"abc","1213"},{"xyz","456"},{"lmn","789"}};
	}

}
