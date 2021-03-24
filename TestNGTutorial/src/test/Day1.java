package test;

import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Day1 {

	/*public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hello");

	}*/
	
	@Test
	public void Demo1day1(){
		
		System.out.println("hello from day1 demo1");
		
	}
	@Test
	public void Demo1day11(){
		
		System.out.println("hello from day1 demo1");
		
	}
	@Test(groups={"smoke"})
	public void Demo1day12(){
		
		System.out.println("hello from day1 demo1");
		
	}

	@BeforeTest
	public void Demo2day1(){
		
		System.out.println("hello from before test day1 demo2");
		
	}
	@Test
	public void Demo3day1(){
		Assert.assertTrue(false);
		System.out.println("hello from day1 demo 3");
		
	}
	@AfterSuite
	public void Demo4day1(){
		
		System.out.println("I m the last");
		
	}
	@BeforeSuite
	public void Demo5day1(){
		
		System.out.println("I m frist");
		
	}

	@BeforeMethod
	public void EveryTime() {
		System.out.println("Every time");
	}
}
