package windowHandle;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Single_handle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver dr = new ChromeDriver();
		dr.manage().window().maximize();
		dr.get("https://www.yatra.com/");
		dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement ele = dr.findElement(By.xpath("//span[.='For Travel Agents']"));
		Actions act = new Actions(dr);
		act.moveToElement(ele).click().perform();
		
		Set<String> allid = dr.getWindowHandles();
		List<String> size = new ArrayList<>(allid);
		int totaltab = size.size();
		System.out.println(" total tab is "+totaltab);
		
		int i=1;
		
		for (String str : allid) {
			if(i==totaltab-1)
			{
				dr.switchTo().window(str);
				i++;
			}
			
				i++;
		}
		
		
	}

}
