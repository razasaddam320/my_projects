package commondata_Properties;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FetchData_FromPropertiesFile {

	public static void main(String[] args) throws IOException {
		//java connect to the physical file
		FileInputStream fis = new FileInputStream("D:\\PracticeWorkspace\\Selenium\\commondata.properties");
		Properties prob = new Properties();
		prob.load(fis);//load the physical file in the object
			
		String url = prob.getProperty("url");
		String username = prob.getProperty("username");
		String password = prob.getProperty("password");
		
		System.out.println(url);
		System.out.println(username);
		System.out.println(password);
		
		//OrangerHrm login
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(url);
		driver.manage().window().maximize();
		
		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(password,Keys.ENTER);
		
	}

}
