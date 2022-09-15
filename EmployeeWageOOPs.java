
public class EmployeeWageOOPs {

	public static final int IsFullTime = 1;
	public static final int IsPartTime = 2;

	public void attendance() {
		double empCheck = Math.floor(Math.random() * 10) % 2;
		if (empCheck == IsFullTime) {
			System.out.println("Employee is Present");
		} else {
			System.out.println("Employee is Not Present");
		}
	}

	public static void main(String[] args) {
		EmployeeWageOOPs e1 = new EmployeeWageOOPs();
		e1.attendance();
	}

}
