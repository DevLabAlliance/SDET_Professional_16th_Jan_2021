package week2.day2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class FruitsSet {
public static void main(String[] args) {
	Set<String> fruits = new HashSet<String>();
	boolean add = fruits.add("apple");
	fruits.add("mango");
	fruits.add("pine");
	fruits.add("grape");
	boolean add2 = fruits.add("apple");
	fruits.add("banana");
	
	List<String> list = new ArrayList<>();
	list.addAll(fruits);
	String fristFruit = list.get(0);
	System.out.println(fristFruit);
	
	
	
//	boolean contains = fruits.contains("banana");
//	System.out.println("second time: "+add2);
//	System.out.println("First apple: "+add);
//	System.out.println(contains);
//	int size = fruits.size();
//	System.out.println(size);
//	fruits.remove("apple");
//	System.out.println(fruits);
	
//	fruits.get(0);/ -- no get in set
//	System.out.println(fruits);
}
}
