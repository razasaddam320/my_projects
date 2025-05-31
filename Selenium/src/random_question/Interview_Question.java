package random_question;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Interview_Question {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		

		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.wipo.int/patinformed/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//input[@class='searchField']")).sendKeys("rilpivirine");
		driver.findElement(By.className("green")).click();
		driver.findElement(By.xpath("//div[@class='flex center-h c-results animated scroller']/descendant::div[text()='HIV INHIBITING PYRIMIDINES DERIVATIVES (38)']")).click();
		String mainid = driver.getWindowHandle();
		Set<String> allid= driver.getWindowHandles();
		
		driver.findElement(By.linkText("Open in PATENTSCOPE")).click();
		
		Thread.sleep(2000);
//		WebElement ele= driver.findElement(By.xpath("//div[text()='1. EP1419152 - HIV INHIBITING PYRIMIDINES DERIVATIVES']"));
//		
//		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(10));
//		wait.until(ExpectedConditions.t(ele));
		for (String id : allid) {
			
			if(!mainid.equals(id)) {
				
				
				driver.switchTo().window(id);
			}
		//	suso
			
		}
		
					
	}

}

		