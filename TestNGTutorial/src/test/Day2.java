package test;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class Day2 {
	
	@Test
	public void demo1day2() {
		System.out.println("Hello from day 2");
	}
	
	@AfterTest
	public void demo2day2() {
		System.out.println("Hello from day 2 after test");
	}
	@Test
	public void demo3day2() {
		System.out.println("Hello from day 2");
	}
	@Test
	public void demo4day2() {
		System.out.println("Hello from day 2");
	}

}
