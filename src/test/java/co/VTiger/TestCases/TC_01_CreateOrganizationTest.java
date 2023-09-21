package co.VTiger.TestCases;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.Base.BaseClass;

import pom.classes.HomePage;

public class TC_01_CreateOrganizationTest extends BaseClass
{

	@Parameters("data")
	@Test
	public void createOrg(String s1) throws InterruptedException {
		HomePage homePage = new HomePage(driver);
		homePage.getOrgPageLink().click();
		System.out.println(s1);
	}
}
