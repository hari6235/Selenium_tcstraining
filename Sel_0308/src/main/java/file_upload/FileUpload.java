package file_upload;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {

	public static WebDriver driver = new ChromeDriver();
	
	public static void uploadtest() {
		
		driver.get("https://the-internet.herokuapp.com/upload");
		File uploadfile = new File("C:\\Users\\Administrator\\git\\Selenium_tcstraining\\Sel_0308\\src\\sl.txt");
		WebElement fileinput = driver.findElement(By.cssSelector("input[type=file]"));
		
		fileinput.sendKeys(uploadfile.getAbsolutePath());
		driver.findElement(By.id("file-submit")).click();
		
		WebElement filenamechk = driver.findElement(By.id("uploaded-files"));
		
		String nchk  = filenamechk.getText();
		
		if (nchk.contains("Selenium_Learning.txt")) {
			System.out.println("Test passed");
				
			}
		else {
			System.out.println("Test passed with different file name"+  nchk);
		}
		
		
				
	}
	
	public static void main(String[] args) {
		
		uploadtest();
		

	}

}
