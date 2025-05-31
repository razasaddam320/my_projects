package random_question;

// Scenario open irctc,click on hotels,then click on bus, search bengaluru goa select date and 

import java.time.Duration;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Irctc_Random {
	WebDriver driver;
	
	@BeforeTest
	public void Launch_Brawser() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.irctc.co.in/nget/train-search");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	@Test
	public void tc1() {
		
		WebElement hotel = driver.findElement(By.xpath("//span[@class='allcircle circletwo']"));
		Actions act = new Actions(driver);
		act.moveToElement(hotel).click().perform();
		
	//	Set<String> id = driver.getWindowHandles();
		
	}

}
