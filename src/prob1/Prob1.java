package prob1;

import java.util.Scanner;

public class Prob1 {
	public static void main(String[] args) {
		
		int[] count=new int[10];
		
		final int[] MONEYS = { 50000, 10000, 5000, 1000, 500, 100, 50, 10, 5, 1 };
		Scanner scanner = new Scanner(System.in);
		int money = scanner.nextInt();
		
		System.out.println("금액: "+money);
		
		while(true) {
		
			for(int i =0; i<10; i++) {
				
				if(money/MONEYS[i]!=0) {
					
					count[i] = money/MONEYS[i];
					money = money-MONEYS[i]*count[i];					
				}
			}
			
			if(money==0) {
				break;
			}
		}
		
		for(int i =0; i<10; i++) {
			System.out.println(MONEYS[i]+" : "+ count[i]+"개");
		}
		
 	}
}