package week2.day1;

public class LearnString {
	public static void main(String[] args) {
		
		String str1 = "Dev";
		String str2 = "Dev";
		
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		String str3 = new String("Dev");
		String str4 = new String("Dev");
		System.out.println(System.identityHashCode(str3));
		System.out.println(System.identityHashCode(str4));
		System.out.println(str1 == str3);
		System.out.println(str1.equals(str3));
		
		
		
		
//		String name = "Devlabs";
//		String name1 = name.toUpperCase();
//		System.out.println(name1);
////		name.toUpperCase();
//		System.out.println(name);
	}

}
