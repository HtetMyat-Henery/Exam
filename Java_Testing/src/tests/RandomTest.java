package tests;

import java.util.Random;

public class RandomTest {

	public static void main(String[] args) {
		
		int minNum = 1;
		int maxNum = 999;
		
		Random ran = new Random();
		
		for (int i = 0; i < 5; i++) {
		
			int ranNum = ran.nextInt(maxNum)+minNum;
			
			if(ranNum <= 9){
				System.out.println("Random Number : 00"+ranNum);
			}
			if(ranNum <= 99){
				System.out.println("Random Number : 0"+ranNum);
			}
			else{
				System.out.println("Random Number : "+ranNum);
			}
			
		}
		
		
	}
	
	
}
