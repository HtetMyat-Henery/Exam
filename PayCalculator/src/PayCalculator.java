/**
 * @(#)PayCalculator.java
 *
 * PayCalculator application
 *
 * @author 
 * @version 1.00 2018/3/10
 */
 
 import java.util.*;
 
public class PayCalculator {
    
    static final int MAX_NO_OVER_TIME = 160;//the number of hours avaliable for overtime
	static final double OVER_TIME_RATE = 1.5;
	static final double ENGINEER_HOURLY_PAY = 30.0;
	static final double TECHNICIAN_HOURLY_PAY = 25.5;
	static double salary;
	static int houesWorked;
	static int position;
		
    public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println ("Enter position: ");
		position = scan.nextInt();
		
    }
    
    priavte double calculateSalary(int position){
    	
    }
}
