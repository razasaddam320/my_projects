package mouseHover;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SkillRarry {
	
	public static void main(String[] args) {
		
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoapp.skillrary.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement ele = driver.findElement(By.linkText("COURSE"));
		
		Actions act = new Actions(driver);
		act.moveToElement(ele).perform();
		
		driver.findElement(By.linkText("autometion")).click();
		
		driver.findElement(By.xpath("//button[@ondblclick='addtocart()']")).click();
		
		Alert alt = driver.switchTo().alert();
			alt.accept();
			
	
	}
	
	

}
