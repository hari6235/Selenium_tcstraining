package iFrameTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FrameTest {

	static WebDriver driver;

	@BeforeMethod

	public void invokeUrl() {

		driver  = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://the-internet.herokuapp.com/iframe");
	}	
	@Test
	public void iFrameTest1() {

		driver.switchTo().frame("mce_0_ifr");

		WebElement inText = driver.findElement(By.id("tinymce"));

		inText.clear();

		inText.sendKeys("iFrame Test");
		
	try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}

	@AfterClass 

	public void teardown() {

		driver.quit();

	}

}
