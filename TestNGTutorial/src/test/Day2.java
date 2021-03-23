package test;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class Day2 {
	
	@Test(timeOut = 4000)   //set time to wait until this time before showing any error message
	public void demo1day2() {
		System.out.println("Hello from day 2");
	}
	
	@AfterTest
	public void demo2day2() {
		System.out.println("Hello from day 2 after test");
	}
	//<!-- forcely not executed -->
	@Test(enabled = false)  
	public void demo3day2() {
		System.out.println("Hello from day 2 executed");
	}
	@Test(groups={"smoke"})
	public void demo4day2() {
		System.out.println("Hello from day 2");
	}

}
