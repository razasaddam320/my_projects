package random_question;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class amazon {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("toy for kids",Keys.ENTER);
		
	String price =	driver.findElement(By.xpath("//span[contains(text(),'Smartivity Hydraulic Plane Launcher STEM DIY Fun Toy for Kids')]/ancestor::div[@class='a-section a-spacing-base']/descendant::span[@class='a-price-whole']")).getText();
		
	System.out.println(price);
	
	}

}
