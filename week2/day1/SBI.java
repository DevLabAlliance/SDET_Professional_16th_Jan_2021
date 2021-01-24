package week2.day1;

public class SBI implements RBI{
	
	public void freeInsurance() {
		System.out.println("freeInsurance");
	}

	@Override
	public void doKYC() {
		System.out.println("Online KYC");
		
	}

	@Override
	public void panMandatory() {
		System.out.println("Attached");
	}

	public void someFuns() {
		// TODO Auto-generated method stub
		
	}

}
