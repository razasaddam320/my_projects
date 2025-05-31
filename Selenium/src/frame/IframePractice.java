package frame;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IframePractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demoqa.com/frames");
		//handle iframe1
		driver.switchTo().frame("frame1");
	String text = driver.findElement(By.id("sampleHeading")).getText();
	System.out.println(" this is 1st frame : "+text);
		//we have to go main frame only then we go 2nd frame  
		driver.switchTo().defaultContent();
		//handle 2nd frame
		driver.switchTo().frame("frame2");
	String text2 =	driver.findElement(By.xpath("//h1[text()='This is a sample page']")).getText();
	System.out.println(" this is 2st frame : "+text2);
	
	//driver.close();
	
	}

}
