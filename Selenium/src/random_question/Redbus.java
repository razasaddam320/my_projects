package random_question;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Redbus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.redbus.in");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.className("dateText")).click();
	String li	=driver.findElement(By.xpath("//div[@class=\"holiday_count\" and not(@class='1')]")).getText();
	System.out.println(li);
	}

}
