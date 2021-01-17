package week1.day2;

public class Car {
//	accessModifier returnType methodName(){
//	}
	// accessModifier - public, private, protected, default/package
	
	// instance variable / global / class level
	private String carname = "BMW";
	int engineCC = 1500;
	
	private int getNumberofCars() {
		
		return 0;
	}
	
	
	public void driveCar() {
		int a = 0;
		System.out.println("I am driving");
	}
	
	public String getColor() {
//		String color = "black";
		return "black";
	}
	// overloading
	public String getColor(String brandname) {
		if(brandname.equals("bmw")) {
			return "black";			
		}else {
			return "blue";
		}
	}
	
	
	
	

}
