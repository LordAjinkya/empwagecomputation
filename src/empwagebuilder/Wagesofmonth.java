package empwagebuilder;

public class Wagesofmonth {

	public static void main(String[] args) {
		int empHrs = 0,empWage = 0,totalEmpWage = 0;
		for (int day=0; day<NUM_OF_WORKING_DAYS; day++) {
			int empCheck = (int) Math.floor(Math.random() * 10) % 3;
			switch (empCheck) {
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
			empWage = empHrs * EMP_RATE_PER_HOUR;
			totalEmpWage += empWage;
			System.out.println("Emp Wage : "+empWage);
		}
		System.out.println("Total Employee Wage : "+totalEmpWage);
		

	}

}
