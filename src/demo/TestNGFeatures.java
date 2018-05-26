package demo;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGFeatures {
	
	@Test(groups="High")
	public void a1(){
		System.out.println("a1()");
	}
	@Test(groups="Medium")
	public void A1(){
		
		System.out.println("A1()");
	}
	@Test(groups="Low")
	public void z1(){
		System.out.println("z1()");
	}
	@Test(groups="High")
	public void m1(){
		System.out.println("m1()");
	}
	@Test(groups="Medium")
	public void P1(){
		System.out.println("P1()");
	}

}
