package Selenium_0308;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class Locators {

	static WebDriver driver = new ChromeDriver();

	public static void InvokeBrowser() {
		driver.get("C:\\Users\\Administrator\\git\\Selenium_tcstraining\\Sel_0308\\htmlfile.html");
		driver.manage().window().maximize();
		By maleradiobutton = RelativeLocator.with(By.tagName("input")).toLeftOf(By.cssSelector("input[value='f']"));
		driver.findElement(maleradiobutton).click();
	}

	/*
	 * public static void Locators() { By maleradiobutton =
	 * RelativeLocator.with(By.tagName("input")).toLeftOf(By.xpath(
	 * "//input[@value='f']")); driver.findElement(maleradiobutton).click(); }
	 */
	public static void main(String[] args) {

		InvokeBrowser();
	}

}
