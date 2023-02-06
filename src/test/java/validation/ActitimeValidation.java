package validation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ActitimeValidation {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com/");
		//Username field Validation
		System.out.println("Username field Validation");
        WebElement uname=driver.findElement(By.name("username"));
       System.out.println("Username field is Displayed\t:"+uname.isDisplayed());
       System.out.println("Username field is Enabled\t:"+uname.isEnabled());
       System.out.println("Username field is Selected \t:"+uname.isSelected());
       System.out.println(uname.getAttribute("placeholder"));
       //Password field Validation
       System.out.println("Password field Validation");
        WebElement pwd=driver.findElement(By.name("pwd"));
        System.out.println("Password field is displayed\t:"+pwd.isDisplayed());
        System.out.println("Password field is Enable\t:"+pwd.isEnabled());
        System.out.println("Password field is Selected\t:"+pwd.isSelected());
        System.out.println(pwd.getAttribute("placeholder"));
        //Login btn Validation
        System.out.println("Login btn Validation");
       WebElement loginbtn= driver.findElement(By.id("loginButton"));
       System.out.println("Login btn is Displayed\t:"+loginbtn.isDisplayed());
       System.out.println("Login btn is Enabled\t:"+loginbtn.isEnabled());
       System.out.println("Login btn is Selected\t:"+loginbtn.isSelected());
       System.out.println(loginbtn.getText());
       //checkbox validation
       System.out.println("Checkbox validation");
       WebElement checkbox=driver.findElement(By.name("remember"));
       System.out.println("Checkbox validation is Displayed\t:"+checkbox.isDisplayed());
       System.out.println("Checkbox validation is Enabled\t:"+checkbox.isEnabled());
       System.out.println("Checkbox validation is Selected\t:"+checkbox.isSelected());
       WebElement CheckboxText=driver.findElement(By.id("keepLoggedInLabel"));
       System.out.println("Check box Text:"+CheckboxText.getText());
       
       
        //driver.close();

	}

}
