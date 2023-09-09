package com.basemethods;

public class Sample2 implements Web2{

	public static void main(String[] args) {
		Sample2 s2 = new Sample2();
		s2.m2();
		s2.m1();

	}

	@Override
	public void m1() {
		System.out.println(99/3);
		
	}

	@Override
	public void m2() {
		System.out.println(55-30);
		
	}

}
