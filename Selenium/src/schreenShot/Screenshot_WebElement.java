package schreenShot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot_WebElement {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WebDriver  dr = new ChromeDriver();
		dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		dr.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		WebElement ele = dr.findElement(By.name("username"));
		
		File src = ele.getScreenshotAs(OutputType.FILE);
		File dest = new File("./screenshot/wbscreenshot.png");
		FileUtils.copyFile(src, dest);
	}

}
