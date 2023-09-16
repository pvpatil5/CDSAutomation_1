package com.UnitTesting;

import org.testng.annotations.Test;

public class Login 
{

	// @test method will never be static
	// it should not have return type
	// default execution order is bases on name og the methods
	@Test
	public  void login() {
		System.out.println("Login success");
	
	}
	
	
	@Test
	public void managerLogin() {
		System.out.println("Login success manager");
	}
	
	@Test
	public void customerLogin() {
		System.out.println("login succcess customer");
	}
	
}
