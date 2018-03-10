package tests;

import java.util.*;

public class JavaScannerTest {

	private static Scanner x;
	private static Scanner y;
	private static Scanner z;

	public static void main(String[] args) {
		
		System.out.print("Input value of x : ");
		x = new Scanner(System.in);
		int numx1 = Integer.parseInt(x.next());
		System.out.println();
		
		System.out.print("Input value of y : ");
		y = new Scanner(System.in);
		int numy1 = Integer.parseInt(y.next());
		System.out.println();
		
		System.out.print("Input value of z : ");
		z = new Scanner(System.in);
		int numz1 = Integer.parseInt(z.next());
		
		accept(numx1, numy1, numz1);
		
	}
	
	private static void accept(int x,int y,int z){
		
			if(x > y && x > z){
				System.out.println("x is the greatest value");
			}
			if(y > x && y > z){
				System.out.println("y is the greatest value");
			}
			if(z > x && z >y){
				System.out.println("z is the greatest value");
			}
			else{
				System.out.println("Three values of x,y,z must not be the same");
			}	
		}
	}
