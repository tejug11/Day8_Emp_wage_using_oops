
public class EmployeeWageOOPs {

	public static final int Emp_present = 1;
	public static final int Wage_per_hour = 20;

	public void dailyWage() {

		double empcheck = Math.floor(Math.random() * 10) % 2;
		if (empcheck == Emp_present) {
			System.out.println("Employee is present");
			int Full_day_hour = 8;
			int Salary = (Wage_per_hour * Full_day_hour);
			System.out.println("Total_Salary" + Salary);
		} else {
			System.out.println("Employee is not present");
			int Full_day_hour = 0;
			int Salary = (Wage_per_hour * Full_day_hour);
			System.out.println("Salary is" + Salary);
		}
	}

	public static void main(String[] args) {
		EmployeeWageOOPs e1 = new EmployeeWageOOPs();
		e1.dailyWage();
	}
}