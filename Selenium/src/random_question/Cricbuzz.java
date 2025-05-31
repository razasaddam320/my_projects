package random_question;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Cricbuzz {
	WebDriver driver;
	@BeforeTest
	public void LounchBrowser() { 
		 driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.cricbuzz.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	@Test
	public void test_Scenario() throws InterruptedException {	
	
	
	
	
	driver.findElement(By.xpath("//span[text()='SRH']")).click();
	driver.findElement(By.linkText("Live Blog")).click();
	Thread.sleep(2000);
	
	
	driver.findElement(By.linkText("Points Table")).click();
	
	String mainid = driver.getWindowHandle();
	Set<String> allid  = driver.getWindowHandles();
	System.out.println(driver.getTitle());
	for (String id : allid) {
		if(!mainid.equals(id)) {
			driver.switchTo().window(id);
			}
	}
		
	driver.findElement(By.xpath("//a[text()='Schedule & Results']")).click();
	
	Thread.sleep(2000);
	System.out.println(driver.getTitle());
	driver.switchTo().window(mainid);
	driver.findElement(By.linkText("Commentary")).click();
	Thread.sleep(2000);
	driver.findElement(By.linkText("Squads")).click();
	Thread.sleep(2000);
	driver.findElement(By.linkText("Highlights")).click();
	Thread.sleep(2000);
	driver.findElement(By.linkText("Match Facts")).click();
	
	}
}
