package random_question;

//scenario open amazon print all the phone name and price

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class AmazonAllphonePage {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("new phones",Keys.ENTER);
		
		List<WebElement> name=driver.findElements(By.xpath("//div[@class='puisg-col puisg-col-4-of-12 puisg-col-8-of-16 puisg-col-12-of-20 puisg-col-12-of-24 puis-list-col-right']/descendant::h2[@class='a-size-mini a-spacing-none a-color-base s-line-clamp-2']"));
		
		List<WebElement> price=driver.findElements(By.xpath("//div[@class='a-section a-spacing-none a-spacing-top-micro puis-price-instructions-style']/descendant::span[@class='a-price-whole']"));
		
		for(int i=0; i<=name.size()-1; i++) {
			
			System.out.println(name.get(i).getText()+" price :- "+price.get(i).getText());
		}

	}

}
