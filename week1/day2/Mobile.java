package week1.day2;

public class Mobile {
	
	public int price = 50000;
	public String brandname = "one plus";
	
	public String getColor() {
		return "black";
	}
	
	public boolean has5G() {
		return false;
		
	}
	
	public void printBrandName() {
		System.out.println(this.brandname);
	}
	
	public void callSomeOne(String name) {
		System.out.println("Calling "+name);
	}
	public void callSomeOne(int number) {
		System.out.println("Calling "+number);
	}
	

}
