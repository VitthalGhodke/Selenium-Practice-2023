package testNG;

import org.testng.annotations.Test;

public class TestNGArguments {
	@Test(invocationCount=4)//Execute the method multiple time
	public void login() {
		System.out.println("I am login method");
	}
	@Test(priority=2)//Execute the method on priority base
	public void logout() {
		System.out.println("I am logout method");
	}
	@Test(priority=1)//Execute the method on priority base
	public void logout1() {
		System.out.println("I am logout1 method");
	}
	@Test(enabled=true)//Consider the method for execution
	public void SendMail() {
		System.out.println("I am Sendmail method");
	}
	@Test(enabled=false)//Dont Consider the method  for execution
	public void DeletMail() {
		System.out.println("I am Deletmail method");
	}
	@Test(dependsOnMethods="SendMail")//This method depends on SendMail method means first execute sendmail method and after execute this method
	public void Forward_the_mailMail() {
		System.out.println("I am Forward_the_mailMail method depends on send mail");
	}
	@Test(description="Some information")//provide some information which is print on console
	public void Mail() {
		System.out.println("I am mail method");
	}
	@Test(timeOut=2000)//Set the limit time for execution
	public void openBrowser() {
		System.out.println("I am open browser method");
	}
	@Test(expectedExceptions=ArithmeticException.class)//to handel the exception
	public void Browser() {
		System.out.println("I am open browser method");
		int i=10/0;
		System.out.println(i);
	}
}
