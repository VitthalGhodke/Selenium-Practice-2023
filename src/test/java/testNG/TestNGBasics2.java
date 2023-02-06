package testNG;

import org.testng.annotations.Test;

public class TestNGBasics2 {
  @Test
  public void test_NG_Basics() {
	 System.out.println("Test NG BAsics");
      me();
  }
  @Test
  public void Basics_Testng() {
	  me();
	 System.out.println(" Basics Test NG");
  }
  
  public void me() {
	  System.out.println("I am me()");
  }
}
/*1-Test ng methods executes without main method
 *2-@Test Annotation work as main method
 *3-All test ng methods execute alfabetical order 
 *4-Method count depends on @Test annotation method
 *
 */


