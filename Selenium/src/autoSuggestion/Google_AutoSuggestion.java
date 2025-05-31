package autoSuggestion;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google_AutoSuggestion {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.id("APjFqb")).sendKeys("Virat Kohli");
		// auto sugestion we have to ul for best result
		//ul[@role='listbox']/li	// slash( /li ) must used for best result
	List<WebElement> suggest = driver.findElements(By.xpath("//ul[@class='G43f7e']/li"));
	
	for (WebElement i : suggest) {
		
		System.out.println(i.getText()); 
		
		
	}
		Thread.sleep(4000);
		driver.quit();
	}

	
}
