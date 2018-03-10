package tests;

import java.util.Scanner;

public class ForExamTutionJava {

	public static void main(String[] args) {
		
	String typeOfProduct;
	double unitPrice = 0.0;
		
	Scanner scan = new Scanner(System.in);
	
	System.out.println("Enter the type of Product : ");
	typeOfProduct = scan.next();
	
	System.out.println("Enter the unitPrice of the Product : ");
	unitPrice = scan.nextDouble();
	
	scan.close();
	
	System.out.println(calculateProfit(typeOfProduct, unitPrice)+"$");
		
	}
	
	private static double calculateProfit(String typeOfProduct,double unitPrice){
		double profit = 0.00 ;
		
		if(typeOfProduct.equalsIgnoreCase("shoe")){
			if(unitPrice < 15.00){
				System.out.println("asdfgshoe");
				
				profit = (unitPrice*15)/100;
			}
			else if(unitPrice >= 15.00 && unitPrice <30.00){
				profit = (unitPrice*20)/100;
			}
			else if(unitPrice >= 30){
				profit = (unitPrice*25)/100;
			}
			
		}

		else if(typeOfProduct.equalsIgnoreCase("cloth")){
			if(unitPrice < 15.00){
				profit = (unitPrice*15)/100;
			}
			else if(unitPrice >= 15.00 && unitPrice <30.00){
				profit = (unitPrice*20)/100;
			}
			else if(unitPrice >= 30){
				profit = (unitPrice*25)/100;
			}
			
		}
		return profit;
	}
}