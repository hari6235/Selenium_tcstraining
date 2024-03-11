package differentElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiveElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		try {
			driver.get("http://www.google.com");
			driver.findElement(By.cssSelector("[name='q']")).sendKeys("webElement");

			// Get attribute of current active element
			String attr = driver.switchTo().activeElement().getAttribute("title");
			System.out.println(attr);
		} finally {
			driver.quit();
		}
	}
}
