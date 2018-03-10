package tests;

import java.util.Scanner;

public class PayCalculator {

    
    static final int MAX_NO_OVER_TIME = 160;//the number of hours avaliable for overtime
	static final double OVER_TIME_RATE = 1.5;
	static final double ENGINEER_HOURLY_PAY = 30.0;
	static final double TECHNICIAN_HOURLY_PAY = 25.5;
	static double salary;
	static int hoursWorked = 160;
	static int position;
		
    public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print ("Enter position('0' for Engineer / '1' for Techinician): ");
		position = scan.nextInt();
		System.out.println("Enter hoursWorked: ");
		hoursWorked = scan.nextInt();
		scan.close();
		calculateSalary();
    }
    
    private static void calculateSalary(){
    	// calculate the amount of salary
		if(position == 0){
			if(hoursWorked <= MAX_NO_OVER_TIME){
				salary = hoursWorked*MAX_NO_OVER_TIME;
			}
			else {
				salary = (MAX_NO_OVER_TIME*ENGINEER_HOURLY_PAY)+((OVER_TIME_RATE*ENGINEER_HOURLY_PAY)*(hoursWorked-MAX_NO_OVER_TIME));
			}//(calculate normal monthly pay)+(calculate engineer over time rate)*(calculate hours of overtime)
			System.out.println("This month's salary: $"+salary);
		}
    	
		else if(position == 1){
				if(hoursWorked <= MAX_NO_OVER_TIME){
					salary = hoursWorked*MAX_NO_OVER_TIME;
				}
				else{
					salary =  (MAX_NO_OVER_TIME*TECHNICIAN_HOURLY_PAY)+((OVER_TIME_RATE*TECHNICIAN_HOURLY_PAY)*(hoursWorked-MAX_NO_OVER_TIME));
				}
				System.out.println("This month's salary: $"+salary);
			}
		
		else{
			System.out.println("Employee Type Unknown");
		}
		}
    

	
}
