package autoSuggestion;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {
	
public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().deleteAllCookies();
		driver.get("https://www.amazon.in/");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("dress");
		
		List<WebElement> autosuggestion=driver.findElements(By.xpath("//div[@class='s-suggestion-container']"));
		
		for (WebElement webElement : autosuggestion) {
			
			
			System.out.println(webElement.getText());
		}
		//driver.quit();	
	}
//div[contains(@aria-label,'dresses')]

}
