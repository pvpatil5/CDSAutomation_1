package before_after;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class Base {

	@BeforeClass
	public void launchBrowser() {
		System.out.println("browser launched");
	}

	@AfterClass
	public void closeBrowser() {
		System.out.println("browser closed");
	}
	
	@BeforeMethod
	public void login() {
		System.out.println("Login done");
	}
	
	@AfterMethod
	public void logOut() {
		System.out.println("Logout Done");
	}
	
	@BeforeTest
	public void beforeTest() {
		System.out.println("Before Test");
	}
	
	@AfterTest
	public void afterTest() {
		System.out.println("After Test");
	}
	
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("Before Suite");
	}
	
	
	@AfterSuite
	public void afterSuite() {
		System.out.println("After Suite");
	}
	
}
