package tests;

import java.util.Scanner;

public class testingProject {

	public static Scanner scan = new Scanner(System.in);
	
	private static String userName = "";
	private static String destination = "";
	private static int daysToSpendTravelling = 0;
	private static double moneyToSpend = 0;
	private static String currencySymbol = "";
	private static double currencyExchamgeRatePerUSD = 0; 
	private static int differenceInTime = 0;
	private static double squareAreaInKm2 = 0;
	
	public static void main(String[] args) {

		greeting();
		travelTimeAndBudget();
		timeDifference();
		countryArea();
	}
	
	private static void greeting(){
		
		System.out.println("Welcome to vacation planner!");
		
		System.out.print("What is your name? ");
		userName = scan.nextLine();
		
		System.out.print("Nice to meet you "+userName+", where are you travelling to? ");
		destination = scan.nextLine();
		
		System.out.println("Great! "+destination+" sounds like a great trip");
		System.out.println("***********");
		System.out.println();
		
	}
	
	private static void travelTimeAndBudget(){
			
		System.out.print("How many days are you gonna spend travelling? ");
		daysToSpendTravelling = scan.nextInt();
		
		System.out.print("How much money, in USD, are you planning to spend on your trip? ");
		moneyToSpend = scan.nextDouble();
		
		System.out.print("What is the three letter currency symbol for your travel destination? ");
		currencySymbol = scan.next().toUpperCase();
		
		System.out.print("How many "+currencySymbol+" are there in 1 USD? ");
		currencyExchamgeRatePerUSD = scan.nextDouble();
		System.out.println();
		
		int hoursToSpendTravelling = daysToSpendTravelling*24;
		int minutesToSpendTravelling = hoursToSpendTravelling*60;
		
		System.out.println("If you are travelling for "+daysToSpendTravelling+" days that is the same as "+
		hoursToSpendTravelling+" hours or "+minutesToSpendTravelling+" minutes");
		
		double moneyToSpendPerDay = moneyToSpend/daysToSpendTravelling;
		System.out.println("If you are going to spend $"+moneyToSpend+" USD that means per day you canspend up to $"+moneyToSpendPerDay+" USD");
		
		double moneyToSpendInDestinationCurrency = currencyExchamgeRatePerUSD*moneyToSpend;
		double moneyToSpendInDestinationCurrencyPerDay = currencyExchamgeRatePerUSD*moneyToSpendPerDay;
		
		System.out.println("Your total budget in "+currencySymbol+" is "+
		moneyToSpendInDestinationCurrency+" "+currencySymbol+", which per day is "+moneyToSpendInDestinationCurrencyPerDay+" "+currencySymbol);
		System.out.println("***********");
		System.out.println();
		
	}
	
	private static void timeDifference(){
		
		System.out.print("What is the time difference, in hours, between your home and your destination? ");
		differenceInTime = scan.nextInt();
		
		System.out.println("That means that when it is midnight at home it will be "+timeCalculationFromMidnight(differenceInTime)+":00 in your travel destination");
		System.out.println("and when it is noon at home it will be "+timeCalcullationFromNoon(differenceInTime)+":00");
		System.out.println("***********");
		
	}
	
	private static int timeCalculationFromMidnight(int differenceInTime){
		int timeDifferenceFromMidnight = 0;
		
		if(differenceInTime < 0){
			timeDifferenceFromMidnight = (24-differenceInTime)%24;
		}
		
		else if(differenceInTime > 0){
			timeDifferenceFromMidnight = differenceInTime%24;
		}
		return timeDifferenceFromMidnight;
	}
	
	private static int timeCalcullationFromNoon(int differenceInTime){
		int timeDifferenceFromNoon = 0;
		
		if(differenceInTime < 0){
			timeDifferenceFromNoon = (36+differenceInTime)%24;
		}
		else if(differenceInTime > 0){
			timeDifferenceFromNoon = (12+differenceInTime)%24;
		}
		
		return timeDifferenceFromNoon;
		
	}
	
	private static void countryArea(){
		
		System.out.print("What is the square area of your destination country in km2? ");
		squareAreaInKm2 = scan.nextDouble();
		System.out.println("In miles2 that is "+squareAreaInKm2*0.386102);
		
	}
}
