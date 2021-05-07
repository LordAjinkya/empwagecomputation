package empwagebuilder;

public class EmployeeWageBuilder {
	public final static int IS_FULL_TIME = 1;
	public final static int IS_PART_TIME = 0;
	private final String company;
	private final int empRatePerHr;
	private final int workingDayPerMonth;
	private final int maxHrInMonth;
	private int totalEmpWage;

	public EmployeeWageBuilder(String company, int empRatePerHr, int workingDayPerMonth, int maxHrInMonth) {
		super();
		this.company = company;
		this.empRatePerHr = empRatePerHr;
		this.workingDayPerMonth = workingDayPerMonth;
		this.maxHrInMonth = maxHrInMonth;
	}
	
	public static void empWageCalculation(String company, int empRatePerHr, int workingDayPerMonth, int maxHrInMonth) {
		int empHrs = 0, totalEmpHrs = 0, totalWorkingDay = 0;
		// Using switch Case
		while (totalEmpHrs < maxHrInMonth && totalWorkingDay < workingDayPerMonth) {
			totalWorkingDay++;
			int myCheck = (int) Math.floor(Math.random() * 10) % 3;
			switch (myCheck) {
			case IS_PART_TIME:
				empHrs = 4;
				break;
			case IS_FULL_TIME:
				empHrs = 8;
				break;
			default:
				empHrs = 0;
				break;
			}
			totalEmpHrs += empHrs;
			System.out.println("Total Working Days: " + totalWorkingDay + " " + "Total EMP Hours:" + totalEmpHrs);
		}
		totalEmpWage = totalEmpHrs * empRatePerHr;
	}
	public String toString() {
		return "[Total Emp Wage for: "+company+" is: " + totalEmpWage + "]";
	}
	


	public static void main(String[] args) 
	{
		System.out.println("Welcome to Employee Wage Computation !!");
		EmployeeWageBuilder dmart = new EmployeeWageBuilder("D-MART", 20, 2, 10);
		EmployeeWageBuilder jio = new EmployeeWageBuilder("JIO", 20, 2, 10);
		dmart.empWageCalculation();
		System.out.println(dmart);
		jio.empWageCalculation();
		System.out.println(jio);
	}

}

class Wagecomputation {
	public static final int IS_PART_TIME = 1;
	public static final int IS_FULL_TIME = 2;
	public static final int EMP_RATE_PER_HOUR = 20;
	private static final int EMP_FULLTIMEHOUR = 8;
	private static final int EMP_PARTTIMEHR = 4;
	int is_full_time = 1;
	int days_per_month = 20;
	int maxHr = 100;
	int maxDays = 20;
	int totalEmpHr = 0;
	int totalWorkingHr = 0;
	int totalWorkingDays = 0;
	int FullTimeDay = 0;
	int absent = 0;
	int partTimeDay = 0;

	public void computation() {
		double empcheck = Math.floor(Math.random() * 10) % 2;
		if (empcheck == is_full_time) {
			System.out.println("Employee is present full time");
			System.out.println("Daily employee wage is: " + EMP_RATE_PER_HOUR * EMP_FULLTIMEHOUR);

		} else {
			System.out.println("Employee is present half day");
			System.out.println("Half day wage of emp is:" + EMP_RATE_PER_HOUR * EMP_PARTTIMEHR);

		}
		while (totalWorkingHr < maxHr && totalWorkingDays < maxDays) {
			totalWorkingDays++;
			int myCheck = (int) empcheck;
			switch (myCheck) {
			case 0:
				partTimeDay++;
				totalEmpHr = totalEmpHr + EMP_PARTTIMEHR;
				break;
			case 1:
				FullTimeDay++;
				totalEmpHr = totalEmpHr + (EMP_FULLTIMEHOUR / 2);
				break;
			default:
				absent++;
				break;
			}
		}
		int full_time_income = EMP_RATE_PER_HOUR * (EMP_FULLTIMEHOUR * FullTimeDay);
		int part_time_income = (partTimeDay * (EMP_FULLTIMEHOUR / 2) * EMP_RATE_PER_HOUR);
		System.out.println("   emp wages   ");
		System.out.println("Full time Days in month:\t" + FullTimeDay);
		System.out.println("Part time Days in month:\t" + partTimeDay);
		System.out.println("Absent Days in month:\t\t" + absent);
		System.out.println("Total working Days in month:\t" + (FullTimeDay + partTimeDay));
		System.out.println("Employee Full Time Income=" + full_time_income);
		System.out.println("Employee part Time Income=" + part_time_income);
		System.out.println("Total Salary:\t" + (full_time_income + part_time_income));

	}

}