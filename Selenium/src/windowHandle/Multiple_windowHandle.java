package windowHandle;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Multiple_windowHandle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.youtube.com/");
	//	String id = driver.getWindowHandle();
		
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.primevideo.com/");
		
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.flipkart.com/");
		
	//	driver.switchTo().window(id);
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.amazon.in/");
		
		Set<String> allid = driver.getWindowHandles();
		List<String> size= new ArrayList<>(allid);
		int totaltab =size.size();
		System.out.println(" total window tab is :"+totaltab);
		int i=1;
		
		for (String str : allid) {
			if(i==totaltab-2) {
				driver.switchTo().window(str);
				i++;
			}
				i++;
		}
		

	}

}
