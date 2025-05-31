package autoSuggestion;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Snapdeal {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.snapdeal.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.name("keyword")).sendKeys("laptop");
		
		List<WebElement> suggestions = driver.findElements(By.xpath("//ul[@class=\"suggestionList_menu\"]"));
		
		for (WebElement i : suggestions) {
			
			String s = i.getText();
			//print all suggestions
			System.out.println(s);
			
			if(s.contains("Laptop"))
		{
			i.click();
			break;
		}
					
	}
				
	}
		
}
