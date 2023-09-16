package com.UnitTesting;

import org.testng.annotations.Test;

public class Test4 {

	@Test(invocationCount = 0)
	public  void a() {
		
		System.out.println("Login success a ");

	}

	@Test(enabled =false)
	public void b() {
	
		System.out.println("Login success b");
	}

	@Test()
	public void c() {
		
		System.out.println("login succcess c");
	}
	
	@Test()
	public void d() {
	
		System.out.println("login succcess d");
	}
	
	

}
