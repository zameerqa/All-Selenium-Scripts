package demo;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;




public class Assertion {

	@Test
	public static void m1(){
		SoftAssert assertion=new SoftAssert();
		System.out.println("Hi");
		assertion.assertEquals(true, true);
		assertion.assertTrue(false);
		System.out.println("Bye");
		assertion.assertEquals(false, true,"Assertion Failed");
		System.out.println("Gd Mrng");
		
		Assert.assertEquals(true, false,"HI");
		assertion.assertAll();
	}
}
