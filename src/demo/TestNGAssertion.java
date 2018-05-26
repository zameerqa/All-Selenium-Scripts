package demo;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestNGAssertion {
	SoftAssert softAssert=new SoftAssert();
	@Test
	public void m1(){
		SoftAssert softAssert=new SoftAssert();
		softAssert.assertEquals(true, false);
		//Assert.assertEquals(false, true);
		System.out.println("Hi");
		softAssert.assertEquals(false, true);
		System.out.println("Bye");
		softAssert.assertEquals(true, true);
		System.out.println("Gd Afternoon");
		softAssert.assertAll();
		
	}

}
