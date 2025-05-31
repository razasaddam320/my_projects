package frame;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Nasted_Frame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://the-internet.herokuapp.com/nested_frames");
		
	List<WebElement> no =	driver.findElements(By.tagName("frame"));
	System.out.println(" numbber of frame  " +no.size());
	//print frame2 
	driver.switchTo().frame(1);
	String framebottom = driver.findElement(By.tagName("body")).getText();
	System.out.println(framebottom);
	//back to main frame
	driver.switchTo().defaultContent();
	//print 1st frame
	  driver.switchTo().frame(0);
	//1st frame nested frame print
	  driver.switchTo().frame("frame-left");
	  //left nested frame
	  String frameleft = driver.findElement(By.xpath("//body[contains(text(),'LEFT')]")).getText();
	  System.out.println(frameleft);
	 
	  driver.switchTo().parentFrame();
	  driver.switchTo().frame("frame-middle");
	  //middle nested frame
	  String framemiddle = driver.findElement(By.id("content")).getText();
	  System.out.println(framemiddle);
	  
	  driver.switchTo().parentFrame();
	  driver.switchTo().frame("frame-right");
	  //right  nested frame 
	  String frameright = driver.findElement(By.tagName("body")).getText();
	  System.out.println(frameright);
	
	}

}
