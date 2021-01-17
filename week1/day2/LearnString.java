package week1.day2;

import java.util.Iterator;

public class LearnString {

	public static void main(String[] args) {
		
		
//		  String  str ="amazon development center";
//	        int co =0;
//	        char[] chars = str.toCharArray();
//	        for (char c:chars)
//	        {
//	            System.out.println(c);
//	            if(c == 'e') {
//	            	co++;
//	            }
//	        }
	        
	        
	        
		String str1 = "amazon India";
		String str2 = "amazon";
		if(str1.contains(str2)) {
			System.out.println("both same");
		}else {
			System.out.println("different");
		}
		
		
		
		// 2 ways
		//		String str = new String("Devlabs"); // object
		//		System.out.println(str);

		//	String str = "amazon development center"; // literal
		//		e = 5;
		//		int count = 0;
		//		char toMatch = 'e';
		//		for (int i = 0; i < str.length(); i++) {
		//			char c = str.charAt(i);
		//			if(c == toMatch) {
		//				count++;
		//			}
		//		}
		//		System.out.println(count);


		//		e = 5;
		//		String[] words = str.split(" ");
		//		for (String word : words) {
		//			System.out.println(word);
		//		}
		//		System.out.println(words.length);
		//		char c = str.charAt(1);
		//		System.out.println(c);




		//		System.out.println(str.trim());




		//		sbalveD
		//		char[] chars = str.toCharArray();
		//		String temp = "";
		//		for(int i = str.length() - 1; i > -1; i--) {
		//			temp = temp + chars[i];
		//		}
		//		System.out.println(temp);
		//		for (char c : chars) {
		//			System.out.println(c);
		//		}

		//		System.out.println(str.toUpperCase());
		//		System.out.println(str.toLowerCase());
		//		int len = str.length();
		//		System.out.println(len);


	}

}
