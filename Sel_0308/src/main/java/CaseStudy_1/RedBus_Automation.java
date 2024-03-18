package CaseStudy_1;

import java.lang.ProcessHandle.Info;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import TestNGpack.RunAll;

@RunAll
public class RedBus_Automation {

	static WebDriver driver ;

	/*----Invoking the Browser----*/
	@BeforeClass
	public void Invoke()
	{

		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}


	@Test(priority = 1)
	public void Testcase_1() {

		/*----Testcase1::Launching the url----*/

		driver.get("https://www.redbus.in/");
		String title = driver.getTitle();
		String acttitle = "Book Bus Tickets Online, Easy & Secure Booking, Top Operators - redBus";

		/*----Testcase1 Validation----*/

		try {
			Assert.assertEquals(title,acttitle); 
		}
		catch (AssertionError e) {
			String assertionOutput = e.getMessage();
			System.out.println(assertionOutput);
		}

	}
	@Test(priority = 2)
	public void Testcase_2() throws InterruptedException {

		/*---Testcase2::Sending the inputs---*/

		//Source Input
		driver.findElement(By.xpath("//input[@id='src']")).click();
		driver.findElement(By.xpath("//input[@id='src']")).sendKeys("Chennai");
		Thread.sleep(5000);

		//---Destination Input
		driver.findElement(By.xpath("//input[@id='dest']")).click();
		driver.findElement(By.xpath("//input[@id='dest']")).sendKeys("Bangalore");
		Thread.sleep(5000);

		//---Date Picker

		WebElement dateInputField = driver.findElement(By.id("onwardCal"));
		dateInputField.click();

		//---Passing current date to Date Input Field

		LocalDate currentDate = LocalDate.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd");
		String formattedDate = currentDate.format(formatter);

		WebElement dayElement = driver.findElement(By.xpath("//span[contains(@class,'DayTiles__CalendarDaysSpan-sc-1xum02u-1 fgdqFw') and text()='"+ formattedDate +"']"));
		dayElement.click();

		//---Search for available buses

		driver.findElement(By.id("search_button")).click();

		String Searchbus = driver.getTitle();
		String SearchbusAct = "Book Bus Tickets Online, Easy & Secure Booking, Top Operators - redBus";

		Assert.assertEquals(Searchbus, SearchbusAct);
		
		Thread.sleep(5000);

	}
	@Test(priority = 3)
	public void Testcase3() {
		
		//---Listing the available buses on the given route
		WebElement listofBuses = driver.findElement(By.xpath("//div[@id=\"result-section\"]//ul[@class='bus-items']"));

		String AvailableListofBuses = listofBuses.getText();

		System.out.println("Available buses for the selected route is/are below: "+AvailableListofBuses);

		
	} 

	@AfterClass

	public void teardown(){

		//driver.quit();
	}

}
