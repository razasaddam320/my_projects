package data_driven;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PropeetifeFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		FileInputStream fis = new FileInputStream("D:\\PracticeWorkspace\\Selenium\\commondata.properties");
		Properties prob = new Properties();
		prob.load(fis);
		
		String url = prob.getProperty("url");
		String username = prob.getProperty("username");
		String pwd = prob.getProperty("password");
		
		System.out.println(url);
		System.out.println(username);
		System.out.println(pwd);
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(url);
		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(pwd);
		driver.findElement(By.xpath("//button[text()=' Login ']")).click();
		
	}

}
