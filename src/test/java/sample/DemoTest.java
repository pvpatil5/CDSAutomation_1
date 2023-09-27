package sample;

import org.testng.annotations.Test;

public class DemoTest {

	static {
		String k=System.getProperty("env");
		System.out.println(k+"==");
		if(k.equals("staging")) {
			System.out.println("This is working");
		}
		else if(k.equals("prod")){
			System.out.println("Not working");
		}
	}
	
	
	@Test
	public void demo1() {
		System.out.println("Hello Java");
		
	}
}
