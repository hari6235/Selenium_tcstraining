package TestNGpack;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

@RunAll

public class LearnTestNG {
	static WebDriver driver;
	
	@BeforeMethod
	
	public void invoke() {
	driver = new ChromeDriver();
	driver.manage().window().maximize();		
	}
	
	@Test
	
	public void Testcase1() {
		
	driver.get("https://demo.seleniumeasy.com/basic-checkbox-demo.html");
	
	String title = driver.getTitle();
	System.out.println(title);
	String extitle = "Selenium Easy - Checkbox demo for automation using selenium";
	
	Assert.assertEquals(title, extitle);
	
	}	
	@AfterClass
	
	public void teardown()
	{
		
	driver.quit();
	
		
	}

}
