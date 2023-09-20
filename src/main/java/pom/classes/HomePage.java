package pom.classes;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	private WebDriver driver;
	
	//page name should be class name
	// all webelements should be private
	//use getters for accessing webelements
	// use page factory for initilizing elemets
	//locate all elements by using @findby and @findBys annotation

	public HomePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//a[normalize-space()='Home']")
	private WebElement homePagelink;


	@FindBy(xpath = "(//a[text()='Organizations'])[1]")
	private WebElement orgPageLink;

	public WebElement getHomePagelink() {
		return homePagelink;
	}

	public WebElement getOrgPageLink() {
		return orgPageLink;
	}



}
