public class EmployeeWageOOPs {

	public static final int IsFullTime = 1;
	public static final int IsPartTime = 2;
	public static final int employeRatePerHour = 20;
	public static final int numWorkingDays = 20;

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

	public static void main(String[] args) {
		EmployeeWageOOPs e1 = new EmployeeWageOOPs();
		e1.getMonthlyWage();
	}
}