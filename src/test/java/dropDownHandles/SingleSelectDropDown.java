package dropDownHandles;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SingleSelectDropDown {
	@Test
	public void Handle_Dropdown() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		//Find the dropdown uniqely and store in webelement
		WebElement skillsDropdown=driver.findElement(By.id("Skills"));
		
		/* If drop down is develope by using select tag then creat the instance of select class
		   and pass the dropdown element in its constuctor*/
	    Select s1=new Select(skillsDropdown);
	    
	    // Check whether the dropdown is multiselect or not
	   System.out.println("Dropdown is MultiSelect :"+s1.isMultiple());
	   
	   //get default or allready sected option
	   System.out.println("Defaulte sected option:"+s1.getFirstSelectedOption().getText());
	   
	   //get option count
	   List<WebElement> options=s1.getOptions();
	   System.out.println("Total no. of options:"+options.size());
	   
	   //Get all options using for-each loop
//	   for(WebElement Alloptions:options) {
//		   System.out.println(Alloptions.getText());
//	   }
	   //Get all options using for loop
	   for(int i=0; i<=options.size()-1;i++) {
		   System.out.println("Option "+i+": "+options.get(i).getText());
	   }
	   // Select option from dropdown-----here are three diff. method to selct the any option from dropdown
	   s1.selectByIndex(3); //Select by using index number
	      //OR
	   s1.selectByValue("Android"); // Give the value of Value Attribut from HTML 
	       //OR
	   s1.selectByVisibleText("C++"); // Give the value of visible test from list    
	    
	   driver.close();
	}

}
