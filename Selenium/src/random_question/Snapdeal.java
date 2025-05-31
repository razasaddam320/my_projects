package random_question;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Snapdeal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	//	WebDriverManager.chromedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.get("https://mvnrepository.com/search?q=webdriver+manager");

	}

}
