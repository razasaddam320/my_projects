package random_question;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

/*scenario:- fetch and print all data from dropdown list 
 * we can do using getOptions()
 * 
 */

public class Fetch_item_from_Listbox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().deleteAllCookies();
		
	WebElement listbox = driver.findElement(By.id("searchDropdownBox"));
	
		Select s = new Select(listbox);
	List<WebElement> all = s.getOptions();
		
		for (WebElement listdata : all) {
			System.out.println(listdata.getText());
		}
		
		Thread.sleep(2000);
		driver.close();
	}

}
