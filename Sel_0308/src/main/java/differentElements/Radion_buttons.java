package differentElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radion_buttons {

	static WebDriver driver = new ChromeDriver();
	
	public static void radiob() {
		driver.get("https://www.selenium.dev/selenium/web/web-form.html");
		
		WebElement radiobutton1 = driver.findElement(By.id("my-radio-1"));
		boolean IsSelected = radiobutton1.isDisplayed();
		
		System.out.println(IsSelected);
	}
	public static void main(String[] args) {
		
		radiob();

	}

}
