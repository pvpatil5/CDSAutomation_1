package pom.classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage 
{
	private WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver=driver;
	PageFactory.initElements(driver, this);
	}
	
	@FindBy(name="user_name")
	private WebElement userNameTextFeild;

	@FindBy(name="user_password")
	private WebElement passwordTextFeild;

	@FindBy(id="submitButton")
	private WebElement submitButton;

	public WebElement getUserNameTextFeild() {
		return userNameTextFeild;
	}

	public WebElement getPasswordTextFeild() {
		return passwordTextFeild;
	}

	public WebElement getSubmitButton() {
		return submitButton;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
