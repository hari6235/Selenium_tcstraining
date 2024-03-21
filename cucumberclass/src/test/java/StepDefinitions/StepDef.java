package StepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDef {

	WebDriver driver = new ChromeDriver();

	@Given("I am on the login page")
	public void i_am_on_the_login_page() {

		driver.get("https://www.saucedemo.com");
		System.out.println("I am on the login page");
	}
	@When("I enter valid credentials")
	public void i_enter_valid_credentials() {

		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		System.out.println("I enter valid credentials");
	}
	@And("I click the login button")
	public void i_click_the_login_button() {

		driver.findElement(By.id("login-button")).click();
		System.out.println("I click the login button");
	}
	@Then("I should be redirected to the dashboard")
	public void i_should_be_redirected_to_the_dashboard() {
		System.out.println("I click the login button");
	}
	@And("I should see a welcome message")
	public void i_should_see_a_welcome_message() {
		String title = driver.getTitle();
		String actitle = "Swag Labs";

		Assert.assertEquals(title, actitle);
		
		driver.quit();

	}


}
