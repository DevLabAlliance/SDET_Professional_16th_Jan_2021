package week2.day2;

public class LearnConstructor {
	
	int a;
	
	public void counter() {
//		int b;
//		System.out.println(b);
		System.out.println(a);
	}
	public LearnConstructor() {
		System.out.println("hey im in cons");
	}
	
	public LearnConstructor(int a) {
		this.a = a;
	}
	
	
	public void get() {
		System.out.println(a);
		System.out.println("getting something");
	}
	
	public static void main(String[] args) {
		LearnConstructor ls = new LearnConstructor();
		ls.get();
		ls.counter();
	}

	

}
