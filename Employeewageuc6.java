public class Employeewageuc6 {

	static final int IS_PRESENT = 1;
	static final int IS_PART_TIME = 2;
	static final int SALARY_PER_HRS = 20;
	static final int NUM_OF_WORK_DAYS = 20;
	static final int MAX_HRS_IN_MONTH = 100;
	static final int FULL_TIME_WORKING = 8;


	public static void main(String[] args) {

	int empcheck = 0; int Totalempsalary = 0;
	int day = 0;
	int emphr = 0;
	while (day < NUM_OF_WORK_DAYS && (emphr+FULL_TIME_WORKING) <= MAX_HRS_IN_MONTH) {
	day++;
	empcheck =(int) Math.floor(Math.random() * 10) % 3;

	switch(empcheck) {
		case IS_PRESENT :
			emphr+=FULL_TIME_WORKING;
		break;

		case IS_PART_TIME :
			emphr+=FULL_TIME_WORKING;
		break;

		default:
			emphr+=0;
		break;
		}
	System.out.println("working day \t :"+day+"(present : "+empcheck+")");

		}
	Totalempsalary = emphr * SALARY_PER_HRS;
	System.out.println( "Total employee salary \t" +Totalempsalary );
	}
}
