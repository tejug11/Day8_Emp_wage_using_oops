public class EmployeeWageOOPs {

	public static final int IsFullTime = 1;
	public static final int IsPartTime = 2;
	public static final int Emp_present = 1;
	public static final int Wage_per_hour = 20;
	public static final int employeRatePerHour = 20;
	public static final int numWorkingDays = 20;
	public static final int hourInMonth = 100;

	public void attendance() {
		double empCheck = Math.floor(Math.random() * 10) % 2;
		if (empCheck == IsFullTime) {
			System.out.println("Employee is Present");
		} else {
			System.out.println("Employee is Not Present");
		}
	}

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

	public void getMonthlyWage() {
		int employeWages = 0, employeHour = 0, totalEmployeWage = 0;
		for (int day = 0; day < numWorkingDays; day++) {
			int EmployeCheck = (int) Math.floor(Math.random() * 10) % 3;
			switch (EmployeCheck) {
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
			totalEmployeWage += employeWages;
			System.out.println("Employewage: " + employeWages);
		}
		System.out.println("TotalEmployewage: " + totalEmployeWage);
	}

	public void getMonthlyWageCondition() {
		int employeWages = 0, totalEmployeHour = 0, totalEmployeWage = 0, totalWorkingDays = 0;
		while (totalWorkingDays < numWorkingDays && totalEmployeHour <= hourInMonth) {
			int employeHour = 0;
			totalWorkingDays++;
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
			totalEmployeHour += employeHour;
			employeWages = employeHour * employeRatePerHour;
			totalEmployeWage += employeWages;
			System.out.println("Employewage: " + employeWages);
		}
		System.out.println("TotalEmployewage: " + totalEmployeWage);
	}

	public static void main(String[] args) {
		EmployeeWageOOPs e1 = new EmployeeWageOOPs();
		e1.attendance();
		e1.dailyWage();
		e1.checkWage();
		e1.usingSwitch();
		e1.getMonthlyWage();
		e1.getMonthlyWageCondition();
	}
}