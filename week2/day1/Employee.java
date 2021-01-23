package week2.day1;

public class Employee {
	
	
	public static int getSalaryDetails() {
		return 1000;
	}
	
	public void getInfo() {
//		getSalaryDetails();
	}
	
	public static void main(String[] args) {
		
		int salary = Employee.getSalaryDetails();
		System.out.println(salary);
		
//		getInfo(); //cannot be called
		
		
		/*
		 * Employee emp = new Employee(); int mySalary = emp.getSalaryDetails();
		 * System.out.println(mySalary + 1000);
		 */
	}

}
