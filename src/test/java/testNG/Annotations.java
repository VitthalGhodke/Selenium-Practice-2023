package testNG;

import org.testng.annotations.*;

public class Annotations {
	@BeforeTest
	public void Before_Test() {
		System.out.println("Before Test");
	}
	@BeforeClass
	public void Before_Class() {
		System.out.println("Before Class");
	}
	@BeforeMethod
	public void Before_Method() {
		System.out.println("Before Method");
	}
	@Test
	public void Test1() {
		System.out.println("Test1");
	}
	@Test
	public void Test2() {
		System.out.println("Test2");
	}
	@AfterTest
	public void After_Test() {
		System.out.println("After Test");
	}
	@AfterClass
	public void After_Class() {
		System.out.println("After Class");
	}
	@AfterMethod
	public void After_Method() {
		System.out.println("After Method");
	}
}
/*Test NG Annotations
 * 
 *1-@Before Suit-->Execute this method only once before Test NG Suit
 *  2-@Before Test-->Execute this method only once before All @Test method
 *    3-@Before Class-->Execute this method only once before All @Test method & After @Before Test
 *      4-@Before Method-->Execute this method before Every @Test method
 *        5-@Test --> Responsible for Execution
 *      6-@After Method-->Execute this method After Every @Test method
 *    7-@After Class-->Execute this method only once After All @Test method & Before @After Test 
 *  8-@After Test-->Execute this method only once After All @Test method 
 *9-@After Suit-->Execute this method only once After Test NG Suit     
 */
 
