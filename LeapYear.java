package tests;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		int year ;
		boolean isLeap = false ;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the year : ");
		year = scan.nextInt();
		
		isLeap = isLeapYear(year);
		if(isLeap == true){
		System.out.println("The yaer "+year+" is Leap Year.");
		}
		else{
		System.out.println("The year "+year+" is not Leap Year.");
		}
	}
	
	private static boolean isLeapYear(int year){
		// this method calculate if the year is leap year or not
		if(year % 4 == 0 ){
			if(year % 100 == 0){
				if(year % 400 == 0){
					return true;
				}
				else{
					return false;
				}
			}
			else{
				return true;
			}
		}
		else{
			return false;
		}
	}
	
}
