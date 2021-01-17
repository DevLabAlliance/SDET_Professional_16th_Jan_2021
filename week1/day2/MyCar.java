package week1.day2;

import week1.day1.Trainer;

public class MyCar {

	public static void main(String[] args) {
//		className objectName = new className();
		Car carObject = new Car();
		int cc = carObject.engineCC;
		System.out.println(cc);
		carObject.driveCar();
		String color = carObject.getColor();
		System.out.println(color);
		System.out.println(carObject.getColor("audi"));
		
		
		/*
		 * Trainer myTrainer = new Trainer(); String name = myTrainer.TrainerName;
		 * System.out.println(name);
		 */
		
	}

}
