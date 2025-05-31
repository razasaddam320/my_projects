package pomClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom_Login_page {
	
		//declaration
	@FindBy (name = "username")
	private WebElement usernametxt;
	
	@FindBy (name = "password")
	private WebElement pwd;
	
	@FindBy (xpath = "//button[normalize-space (text()='Login')]")
	private WebElement loginbtn;
	
	//inisilization
	public Pom_Login_page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	} 
	
	//utilization
	public void set_username(String username) {
		 usernametxt.sendKeys(username);
	}
	
	public void set_pwd(String password) {
		 pwd.sendKeys(password);;
	}
	
	public void  click_loginbtn() {
		 loginbtn.click();
	}
	
	
	
}
