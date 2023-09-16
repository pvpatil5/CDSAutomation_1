package com.UnitTesting;

import org.testng.annotations.Test;

public class Test3 {

	@Test(priority = 3)
	public  void a() {
		//3
		System.out.println("Login success a ");

	}


	@Test(priority = 2)
	public void b() {
		//1
		System.out.println("Login success b");
	}

	@Test(priority = -1)
	public void c() {
		//2
		System.out.println("login succcess c");
	}
	
	@Test()
	public void d() {
		//2
		System.out.println("login succcess d");
	}
	
	

}
