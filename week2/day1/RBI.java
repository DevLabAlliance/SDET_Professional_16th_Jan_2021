package week2.day1;

public interface RBI {
	
	int minTran = 5000;
	
	// abstract
	void doKYC();
		
	default int getRateOfInterest() {
		return 10;
	}
	
	void panMandatory();

}
