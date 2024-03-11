package differentElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropdown {

static WebDriver driver = new ChromeDriver();
	
	public static void radiob() {
		driver.get("https://www.selenium.dev/selenium/web/web-form.html");
		
		WebElement dropdown = driver.findElement(By.name("my-select"));
		WebElement disableddropdown = driver.findElement(By.name("my-disabled"));
		Select s = new Select(dropdown);
		//s.selectByIndex(2);
		//s.selectByValue("2");
		s.selectByVisibleText("Two");
		boolean isEnabled = disableddropdown.isEnabled();
		System.out.println(isEnabled);
	}
	public static void main(String[] args) {
		
		radiob();
}
}
