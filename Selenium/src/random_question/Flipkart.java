package random_question;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

// go to flipkart search phone and click phone fetch the title child and parent both

public class Flipkart {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.flipkart.com/");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//	driver.findElement(By.xpath("//span[text()='✕']")).click();
			driver.findElement(By.name("q")).sendKeys("samsung 23 ultra",Keys.ENTER);
			driver.findElement(By.className("KzDlHZ")).click();
			
			String mainid = driver.getWindowHandle();
			Set<String> allid = driver.getWindowHandles();
			
			for (String id : allid) {
				if(!mainid.equals(id)) { 
					driver.switchTo().window(id);
				}
				
			}
			
			Thread.sleep(2000);
			System.out.println(driver.getTitle());
		//	driver.close();
	}

}
