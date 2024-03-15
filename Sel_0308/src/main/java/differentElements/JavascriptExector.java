package differentElements;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import TestNGpack.RunAll;

@RunAll
public class JavascriptExector {
	WebDriver driver;

	@BeforeMethod
	public void invoke() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();

	}

	@Test

	public void TestJavaScript() {
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		driver.get("https://www.browserstack.com/users/sign_in");
		
		js.executeScript("window.scrollBy(0,document.body.scrollHeight");
		
	}

	}
