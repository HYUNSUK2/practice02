package prob5;

import java.util.Random;
import java.util.Scanner;

public class Prob5 {

	public static void main(String[] args) {

		// 게임 변수 초기화
		int minNumber = 1;
		int maxNumber = 100;
		int count = 0;

		// 정답 램덤하게 만들기
		Random random = new Random();
		Scanner in = new Scanner(System.in);
		
			int correctNumber = random.nextInt(maxNumber) + minNumber;
			int guessNumber;
			System.out.println("수를 맞추어 보세요");
			while(true) {
				while(true) {
					count++;
					System.out.println(minNumber+"-"+maxNumber);
					System.out.print(count+">>");
					guessNumber=in.nextInt();
					
					if (guessNumber == correctNumber) {
						System.out.println("맞췄습니다.");
						break;
					}
	
				
					if (guessNumber > correctNumber) {
						System.out.println("더 낮게");
						maxNumber = guessNumber;
					} else {
						System.out.println("더 높게");
						minNumber = guessNumber;
					}
					
				
				
				}
				
			System.out.print("다시 하시겠습니까?(y/n)>>");
			String answer = in.next();
			if( "y".equals( answer ) == false ) {
				break;
			}
			
		}
	
	}

}