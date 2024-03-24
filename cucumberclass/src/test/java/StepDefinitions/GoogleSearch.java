package StepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class GoogleSearch {
	
	WebDriver driver;
	
	@Given("Google page launch successful")
	public void Google_page_launch_successful() {
	    // Write code here that turns the phrase above into concrete actions
		driver = new ChromeDriver();
		driver.get("http://www.google.com");
		String title  = driver.getTitle();
		Assert.assertEquals("Google", title);
				
	}

	@Then("Search for {string}")
	public void search_for(String keyword) {
		driver.findElement(By.cssSelector("[name='q']")).sendKeys(keyword);
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		

	}

	@And("Close the browser")
	public void close_the_browser() {
	    driver.quit();
	 
	}

}
