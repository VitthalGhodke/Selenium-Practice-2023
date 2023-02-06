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

public class MultiSelectDropDown {
 @Test
 public void Multi_Select_Dropdown() throws InterruptedException {
	 WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		driver.get("http://omayo.blogspot.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		//Find the dropdown uniqely and store in webelement
		WebElement Dropdownlist=driver.findElement(By.id("multiselect1"));
		Select s2=new Select(Dropdownlist);
		System.out.println("Drop down is multiselect or not:"+s2.isMultiple());
		//Get all option from dropdoen list
		List <WebElement> option=s2.getOptions();
		System.out.println("Number of options in dropdown:"+option.size());
		for(int i=0;i<=option.size()-1;i++) {
			System.out.println("Option "+i+" :"+option.get(i).getText());
		}
		s2.selectByIndex(1);
		s2.selectByValue("audix");
		s2.selectByVisibleText("Volvo");
		Thread.sleep(3000);
		s2.selectByIndex(2);
		s2.deselectAll();
		//Get only Selected options from dropdown list
		s2.selectByIndex(2);
		s2.selectByVisibleText("Volvo");
		List<WebElement> SelectedOpton=s2.getAllSelectedOptions();
		for(WebElement OnlySelectedOp:SelectedOpton) {
			System.out.println("Only Selected Options:"+ OnlySelectedOp.getText());
		}
		System.out.println("Size of sected option:"+SelectedOpton.size());
		driver.close();
 }
}
