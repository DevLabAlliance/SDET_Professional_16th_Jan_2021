package week2.day2;

import week2.day1.RBI;
import week2.day1.SBI;

public class MyBank {
	static final int a = 0;
	public static void main(String[] args) {
		
//		a = 1;
		System.out.println(a);
		RBI bank  = new SBI();
		bank.getRateOfInterest();
//		RBI.minTran = 10000;
		System.out.println(RBI.minTran);
//		int interest = RBI.getRateOfInterest();
//		System.out.println(interest);
		
//		SBI bank = new SBI();
//		bank.doKYC();
	
	}

}
