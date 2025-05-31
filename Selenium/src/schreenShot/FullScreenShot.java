package schreenShot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FullScreenShot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		 WebDriver dr = new ChromeDriver();
		 dr.manage().window().maximize();
		dr.get("https://mvnrepository.com/");
		dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		TakesScreenshot ts = (TakesScreenshot)dr;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("./screenshot/fullscreenshot.png");
		FileUtils.copyFile(src, dest);
		
		

	}

}
