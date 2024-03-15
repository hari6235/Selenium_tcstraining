package differentElements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import TestNGpack.RunAll;

@RunAll
public class DoubleClick {

	WebDriver driver ;

	@BeforeMethod

	public void Invoke() {

		driver = new ChromeDriver();
		driver.manage().window().maximize();

	}

	@Test

	public void DoubleClickAction() throws InterruptedException {

		driver.get("https://stqatools.com/demo/DoubleClick.php");
		Actions action = new Actions(driver);
		WebElement dbleclck = driver.findElement(By.xpath("//button[contains(text(),\"Click Me / Double Click Me!\")]"));
		dbleclck.click();
		//action.doubleClick().pause(Duration.ofSeconds(2)).build().perform();
		action.doubleClick(dbleclck).pause(Duration.ofSeconds(2)).click(dbleclck).contextClick().perform();
		Thread.sleep(5000);
	}


	@AfterClass
	public void teardown() {

		//driver.quit();
	}

}
