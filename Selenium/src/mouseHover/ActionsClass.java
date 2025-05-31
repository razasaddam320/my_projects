package mouseHover;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
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
				dr.switchTo().window(mainid);
			}
			
		}
		//clicking in 2nd tab 
		dr.findElement(By.xpath("//a[.='Contact Us' and contains(@class,'text-center')]")).click();
	
	
		

	}

}
