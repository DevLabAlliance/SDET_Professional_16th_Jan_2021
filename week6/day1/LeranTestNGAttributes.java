package week6.day1;

import org.testng.annotations.Test;

public class LeranTestNGAttributes {
	
	@Test(priority = 1) // sign up 
	public void eat() {
		System.out.println("eating");
//		throw new RuntimeException();
	}
	@Test(priority = 1) // log in
	public void code() {
		System.out.println("coding");
	}
	@Test() // add to cart
	public void sleep() {
		System.out.println("sleeping");
	}
	@Test(priority = -1) // check out
	public void repeat() {
		System.out.println("repeating");
	}

}
