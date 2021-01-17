package week1.day2;

public class ControlFlowSwitch {

	public static void main(String[] args) {
		
		String browserName = "firefox";
		switch(browserName) {
		
		case "chrome":
			System.out.println("chrome is running");
			break;
		case "firefox":
			System.out.println("firefox is running");
			break;
		
		}
		int day = 7;
//		int a =0; int b =9;
		switch (day) {
		case 1:
			System.out.println("sunday");
			break;
		case 2:
			System.out.println("monday");
			break;
		case 3:
			System.out.println("tuesday");
			break;
		default:
			System.out.println("please enter correct day");
			break;
		}
	}

}
