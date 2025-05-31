package random_question;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Irctc {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.irctc.com/board-of-directors.html");
		
		List<WebElement> names= driver.findElements(By.xpath("//td[@data-title='Name']"));	
		List<WebElement> desg= driver.findElements(By.xpath("//td[@data-title='Designation']"));
		
		for(int i=0;i<=names.size()-1;i++) {
			System.out.println(names.get(i).getText()+" : "+desg.get(i).getText());
		}
	
		
	}

}
