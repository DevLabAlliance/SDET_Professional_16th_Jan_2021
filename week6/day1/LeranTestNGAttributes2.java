package week6.day1;

import org.testng.annotations.Test;

public class LeranTestNGAttributes2 {
	
	@Test() // sign up 
	public void eat() {
		System.out.println("eating");
	}
	@Test(dependsOnMethods = "eat") // log in
	public void code() {
		System.out.println("coding");
//		throw new RuntimeException();
	}
	@Test(dependsOnMethods = "code", alwaysRun = true, enabled = false) // add to cart
	public void sleep() {
		System.out.println("sleeping");
	}
	@Test(dependsOnMethods = "sleep") // check out
	public void repeat() {
		System.out.println("repeating");
	}

}
