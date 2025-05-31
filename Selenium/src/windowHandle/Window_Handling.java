package windowHandle;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Window_Handling {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver dr = new ChromeDriver();
		dr.manage().window().maximize();
		dr.get("https://www.yatra.com/");
		dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement ele = dr.findElement(By.xpath("//span[.='For Travel Agents']"));
		Actions act = new Actions(dr);
		act.moveToElement(ele).click().perform();
		
		String id = dr.getWindowHandle();
		Set<String> allid = dr.getWindowHandles();
		
		for (String mainid : allid) {
			if(!id.equals(mainid))
			{
				Thread.sleep(2000);
				dr.switchTo().window(id);
			}
		}
		
	}

}
