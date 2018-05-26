package demo;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class JUnitTest {
		
		@BeforeClass
		public static void beforeClassMethod(){
			System.out.println("This is a BeforeClassMethod");//1        //1      //1
		}
		
		@AfterClass
		public static void afterClassMethod(){
			System.out.println("This is a afterClassMethod");//2        //10
		}
		
		@Before
		public void setUp(){
			System.out.println("This is a BeforeMethod");//3//6//9      //2 4  7    //2
		}
		//@Ignore
		@Test
		public void testA(){					
			System.out.println("This is TestA");//4						//3         //3
		}
		
				
		@Test
		public void testC(){
			System.out.println("This is TestC");//7						//8
		}
		
		@Test
		public void testB(){
			System.out.println("This is TestB");//3						//5
		}
		
		@After
		public void tearDown(){
			System.out.println("This is AfterMethod");//5//8 //10		//4  6  9
		}
		
		

	

}
