
public class EmployeeWageOOPs {

	public static final int IsFullTime = 1;
	public static final int IsPartTime = 2;
	public static final int employeRatePerHour = 20;

	public void checkWage() {
		int employeWages = 0, employeHour = 0;
		double empCheck = Math.floor(Math.random() * 10) % 3;
		if (empCheck == IsFullTime) {
			employeHour = 8;
		} else if (empCheck == IsPartTime) {
			employeHour = 8;
		} else {
			employeHour = 0;
		}

		employeWages = employeHour * employeRatePerHour;
		System.out.println("Employewage: " + employeWages);
	}

	public static void main(String[] args) {
		EmployeeWageOOPs e1 = new EmployeeWageOOPs();
		e1.checkWage();
	}
}