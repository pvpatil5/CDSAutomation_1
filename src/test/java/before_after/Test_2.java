package before_after;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Test_2 {

	
	
	@BeforeMethod
	public void login() {
		System.out.println("Login done");
	}
	@Test
	public void script() {
		System.out.println("Create Organization");
	//	Assert.fail();
	}
	@Test
	public void script_1() {
		System.out.println("Create contact");
	}
	@AfterMethod
	public void logOut() {
		System.out.println("Logout Done");
	}
	
}
