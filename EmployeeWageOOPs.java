
public class EmployeeWageOOPs {

	public static final int IsFullTime = 1;
	public static final int IsPartTime = 2;
	public static final int employeRatePerHour = 20;

	public void usingSwitch() {
		int employeWages = 0, employeHour = 0;
		int employeCheck = (int) Math.floor(Math.random() * 10) % 3;
		switch (employeCheck) {
		case IsFullTime:
			employeHour = 8;
			break;
		case IsPartTime:
			employeHour = 4;
			break;
		default:
			employeHour = 0;
		}
		employeWages = employeHour * employeRatePerHour;
		System.out.println("Employewage: " + employeWages);
	}

	public static void main(String[] args) {
		EmployeeWageOOPs e1 = new EmployeeWageOOPs();
		e1.usingSwitch();
	}
}