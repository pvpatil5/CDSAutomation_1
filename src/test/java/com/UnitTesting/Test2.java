package com.UnitTesting;

import org.testng.annotations.Test;

public class Test2 {

	@Test(enabled = true,priority = 2)
	public  void a() {
		
		System.out.println("Login success a ");

	}

	@Test(enabled = false)
	public void b() {
	
		System.out.println("Login success b");
	}

	@Test(enabled = false)
	public void c() {
		
		System.out.println("login succcess c");
	}
	
	@Test(enabled = true,priority = 1)
	public void d() {
	
		System.out.println("login succcess d");
	}
	
	

}
