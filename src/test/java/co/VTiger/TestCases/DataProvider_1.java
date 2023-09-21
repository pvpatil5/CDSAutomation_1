package co.VTiger.TestCases;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider_1 
{
	@Test(dataProvider = "getValue")
	public void test1(String src, String dest) 
	{
		System.out.println(src+"---->"+dest);
	}

	@DataProvider
	public Object[][] getValue() 
	{
		
		Object arr[][]= new Object[4][2];	

		arr[0][0]="Mumbai";
		arr[0][1]="Pune";

		arr[1][0]="Delhi";
		arr[1][1]="Banglore";

		arr[2][0]="Hyd";
		arr[2][1]="Chenai";

		arr[3][0]="Dubai";
		arr[3][1]="NY";
	
		return arr;
	}
}
