package empwagebuilder;

public class EmployeeWageBuilder {
	public static final int IS_PART_TIME = 1;
	public static final int IS_FULL_TIME = 2;
	public static final int EMP_RATE_PER_HOUR = 20;
	private static final int EMP_FULLTIMEHOUR = 8;
	private static final int EMP_PARTTIMEHR = 4;

	public static void main(String[] args) {

		int is_full_time = 1;
		double empcheck = Math.floor(Math.random() * 10) % 2;
		if (empcheck == is_full_time) {
			System.out.println("Employee is present");
			System.out.println("Daily employee wage is: " + EMP_RATE_PER_HOUR * EMP_FULLTIMEHOUR);

		}
		else {
			
				System.out.println("Half day wage of emp is:" + EMP_RATE_PER_HOUR * EMP_PARTTIMEHR);

		    
		}
		int myCheck=(int) empcheck;
		switch(myCheck) {
		case 0:
			System.out.println("Employee is Absent !!");
			break;
		case 1:
			System.out.println("Employee is Present !!");
			break;
		}

		
	    
	    
	}
		
	
	   

}
