package week2.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Fruits {
	public static void main(String[] args) {
		List<String> fruits = new ArrayList<String>();
		fruits.add("apple");
		fruits.add("mango");
		fruits.add("pine");
		fruits.add("grape");
		fruits.add("apple");
		fruits.add("banana");
		System.out.println(fruits);
		Collections.sort(fruits);
		Collections.sort(fruits, Collections.reverseOrder());
		System.out.println(fruits);
		
		
//		fruits.clear();
//		System.out.println(fruits.isEmpty());
		
		
//		System.out.println("Before removing");
//		System.out.println(fruits);
//		System.out.println("After removing");
//		fruits.remove(0);
//		System.out.println(fruits);
		
//		for (String eachFruit : fruits) {
//			System.out.println(eachFruit);
//		}
		
		/*
		 * int size = fruits.size(); System.out.println(size);
		 * System.out.println(fruits.get(2).toUpperCase()); boolean contains =
		 * fruits.contains("Grape"); System.out.println(contains);
		 */
		
	}

}
