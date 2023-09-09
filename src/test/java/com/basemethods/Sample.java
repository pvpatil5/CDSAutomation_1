package com.basemethods;

public class Sample implements Web2
{

	public static void main(String[] args) {
	
		Sample s1 = new Sample();
		s1.m1();
		s1.m2();

	}

	@Override
	public void m1() {
		System.out.println(5+10);
		
	}

	@Override
	public void m2() {
		System.out.println(100);
		
	}

}
