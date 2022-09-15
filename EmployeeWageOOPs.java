public class EmployeeWageOOPs {

	public static final int IsFullTime = 1;
	public static final int IsPartTime = 2;
	public static final int employeRatePerHour = 20;
	public static final int numWorkingDays = 20;
	public static final int hourInMonth = 100;

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
		e1.getMonthlyWageCondition();
	}
}