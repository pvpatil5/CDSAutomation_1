package before_after;

import org.testng.annotations.Test;

public class Test_1 {

	@Test(priority = 1)
	public void launchBrowser() {
	System.out.println("browser launched");
	}
	
	@Test(priority = 2)
	public void login() {
		System.out.println("Login done");
	}
	@Test(priority = 3)
	public void script() {
		System.out.println("Create Organization");
	}
	@Test
	public void script_1() {
		System.out.println("Create contact");
	}
	@Test(priority = 4)
	public void logOut() {
		System.out.println("Logout Done");
	}
	@Test(priority = 5)
	public void closeBrowser() {
		System.out.println("browser closed");
	}
}
