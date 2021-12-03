public class Employeecheckuc1 {

	public static void main(String[] args) {
	// constants
	int IS_PRESENT=1;
	double empcheck = Math.floor(Math.random() * 10) % 2;
	if ( empcheck == IS_PRESENT )
		System.out.println("Employee is present");
	else
		System.out.println("Employee is absent");

	}
}
