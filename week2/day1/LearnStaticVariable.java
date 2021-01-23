package week2.day1;

public class LearnStaticVariable {
	
	
	int a = 0;
	static int  b= 0;
	
	public static void get() {
//		System.out.println(a);
	}
	
	public void counter() {
		a++;
		b++;
		System.out.println("static : "+b + " ==> non-static: "+a);
	}
	public static void main(String[] args) {
		LearnStaticVariable ls1 = new LearnStaticVariable();
		ls1.counter();
		ls1.counter();
		ls1.counter();
		
		LearnStaticVariable ls2 = new LearnStaticVariable();
		ls2.counter();
		ls2.counter();
		
		LearnStaticVariable ls3 = new LearnStaticVariable();
		ls3.counter();
		ls3.counter();
		
	}

}
