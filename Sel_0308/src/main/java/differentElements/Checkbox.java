package differentElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
//		driver.get("https://demo.seleniumeasy.com/basic-checkbox-demo.html");
		
		driver.manage().window().maximize();
		
		WebElement chkbx = driver.findElement(By.id("isAgeSelected"));
		
		Boolean checkbox = chkbx.isDisplayed();
		chkbx.click();
		
		System.out.println("After Selected "+ checkbox);
		
		chkbx.click();
		
		System.out.println("After Unselected "+ checkbox);
		

	}

}
