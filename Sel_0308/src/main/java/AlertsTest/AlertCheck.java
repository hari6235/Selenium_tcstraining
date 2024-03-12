package AlertsTest;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlertCheck {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		Wait<WebDriver> wait = new WebDriverWait(driver,Duration.ofSeconds(2));
		driver.get("https://www.selenium.dev/documentation/webdriver/interactions/alerts/");
		driver.findElement(By.linkText("See an example alert")).click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Alert alert = wait.until(ExpectedConditions.alertIsPresent());
		
		Alert alert1 = driver.switchTo().alert();
		
		String alrt = alert.getText();
		
		System.out.println(alrt);
		
		alert1.accept();
		
	
		
		//Alert alert= wait.until(Expectedcondtions.alertIsPresent());

	}

}
