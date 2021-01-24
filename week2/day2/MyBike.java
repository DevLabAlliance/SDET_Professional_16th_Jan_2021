package week2.day2;

import week2.day1.Bike;

public class MyBike extends Bike {
	public static void main(String[] args) {
//		Bike bike = new Bike();
//		bike.startEngine();
		MyBike bike = new MyBike();
		bike.startEngine();
	}
	int b;
	public void get(int a ) {
		this.b = a;
	}

}
