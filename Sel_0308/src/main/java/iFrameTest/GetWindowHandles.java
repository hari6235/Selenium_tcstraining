package iFrameTest;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GetWindowHandles {

	static WebDriver driver;

	@BeforeMethod

	public void invokeUrl() {

		driver  = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://stqatools.com/demo/Windows.php");


	}	
	@Test
	public void windowHandles() {
		
		String Parentwin = driver.getWindowHandle();
		
		WebElement newTab = driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/a[1]/button"));
		
		newTab.click();

		System.out.println("Get title " +driver.getTitle());

		Set<String> tabs = driver.getWindowHandles();
		System.out.println("No of tabs displayed" + tabs.size());
		
		for(String child:tabs) {
			System.out.println("Windows ...." +child);
			
			if(!child.equalsIgnoreCase(Parentwin)) {
			driver.switchTo().window(child);
			
			System.out.println("Get tile " +driver.getTitle());
			
			driver.findElement(By.xpath("//*[@id=\"primary-menu\"]/li[1]/a/span/span")).click();
			}
		}


	}

	@AfterClass 

	public void teardown() {

		driver.quit();

	}

}
