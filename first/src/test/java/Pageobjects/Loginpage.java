 package Pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
	WebDriver driver;
	
	public Loginpage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="username")
	WebElement username;
	
	@FindBy(id="password")
	WebElement password;
	
	@FindBy(name="login")
	WebElement login;
	
	
	public void enterusername(String text) {
		username.sendKeys(text);
	}
	public void enterpassword(String text) {
		password.sendKeys(text);
	}
	
	public void clickbutton() {
		
		login.click();
	}
	
	
	

}
