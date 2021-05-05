package empwagebuilder;

public class EmployeeWageBuilder {
	public static final int IS_PART_TIME = 1;
	public static final int IS_FULL_TIME = 2;
	public static final int EMP_RATE_PER_HOUR = 20;
	private static final int EMP_FULLTIMEHOUR = 8;
	private static final int EMP_PARTTIMEHR = 4;

	public static void main(String[] args) {

		int is_full_time = 1;
		int days_per_month=20;
		int maxHr=100;
		int maxDays=20;
		int totalEmpHr=0;
		int totalWorkingHr=0;
		int totalWorkingDays=0;
		int FullTimeDay=0;
		int absent=0;
		int partTimeDay=0;
		double empcheck = Math.floor(Math.random() * 10) % 2;
		if (empcheck == is_full_time) {
			System.out.println("Employee is present full time");
			System.out.println("Daily employee wage is: " + EMP_RATE_PER_HOUR * EMP_FULLTIMEHOUR);

		}
		else {
			    System.out.println("Employee is present half day");
				System.out.println("Half day wage of emp is:" + EMP_RATE_PER_HOUR * EMP_PARTTIMEHR);

		    
		}
		while(totalWorkingHr<maxHr && totalWorkingDays<maxDays ) {
			totalWorkingDays++;
			int myCheck=(int) empcheck;
			switch(myCheck) {
			case 0:
				partTimeDay++;               
				totalEmpHr=totalEmpHr+EMP_PARTTIMEHR;
				break;
			case 1:
				FullTimeDay++;
				totalEmpHr=totalEmpHr+(EMP_FULLTIMEHOUR/2);
				break;
			default:
				absent++;
				break;
			}
		}
		int full_time_income=EMP_RATE_PER_HOUR*(EMP_FULLTIMEHOUR*FullTimeDay);
		int part_time_income=(partTimeDay*(EMP_FULLTIMEHOUR/2)*EMP_RATE_PER_HOUR);
		System.out.println("   emp wages   ");
		System.out.println("Full time Days in month:\t"+FullTimeDay);
		System.out.println("Part time Days in month:\t"+partTimeDay);
		System.out.println("Absent Days in month:\t\t"+absent);
		System.out.println("Total working Days in month:\t"+(FullTimeDay+partTimeDay));
		System.out.println("Employee Full Time Income="+ full_time_income);
		System.out.println("Employee part Time Income="+part_time_income);
		System.out.println("Total Salary:\t"+(full_time_income+part_time_income));
		

		
	    
	    
	}
		
	
	   

}
