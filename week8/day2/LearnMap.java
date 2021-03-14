package week8.day2;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnMap {
	
	public static void main(String[] args) {
		
		// HashMap - random
		// LinkedHashMap - insertion
		// TreeMap - ASCII
		
		// Student mark sheet
		// math = 100
		// Science = 0
		
		Map<String, Integer> stud1 = new TreeMap<String, Integer>();
		
		stud1.put("Math", 89);
		stud1.put("Science", 62);
		stud1.put("Computer science", 100);
		stud1.put("Math", 30);
		
		boolean containsKey = stud1.containsKey("Science");
//		stud1.clear();
		boolean empty = stud1.isEmpty();
//		Collection<Integer> values = stud1.values();
		System.out.println(containsKey);
		
//		stud1.put("math", 89);
//		System.out.println(stud1);
//		// short cut - CTRL + 2, L
//		int size = stud1.size();
//		System.out.println("Size is "+size);
//		
		Set<Entry<String, Integer>> entrySet = stud1.entrySet();
		for (Entry<String, Integer> entry : entrySet) {
			String key = entry.getKey();
			Integer value = entry.getValue();
			System.out.println("Key --> "+key + " value --> "+value);
		}
//		
		
		
		
		
		
		
		
		
	}

}
