package utilities;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.bidi.script.Source;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Screenshot {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://the-internet.herokuapp.com/iframe");
		String timestamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date()); 
		
		System.out.println(timestamp);
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		
		File source = ts.getScreenshotAs(OutputType.FILE);
		String destination = "./Screenshots/"+"Test"+".png";
		
		try {
			FileUtils.copyFile(source, new File(destination));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
