package day5;

import java.util.Random;
import java.util.Scanner;

public class QuizEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		Random ran = new Random();
		
		System.out.println("******* 랜덤 구구단 문제 *******");
		
		int correctCount = 0;
		int incorrectCount = 0;
		while(true) {
			System.out.println("======== 메뉴 선택  ========");
			System.out.print("[ (1)문제풀이 (2)현재스코어 (3)종료 ] : ");
			int menu = s.nextInt();
			if(menu == 1) {
				System.out.println("문제풀이를 선택하셨습니다. 정답에 0을 입력하면 메뉴로 이동합니다.");
				for(;;) {
					int x = ran.nextInt(8)+2;
					int y = ran.nextInt(9)+1;
					System.out.print(x + " * " + y + " = ");
					int answer = s.nextInt();
					if(answer == (x*y)) {
						System.out.println("정답입니다 !");
						correctCount++;
					} else if(answer == 0){
						System.out.println("0을 입력하셨으므로 메뉴로 이동합니다.");
						break;
					} else {
						System.out.println("오답입니다 ! 정답은 " + (x * y) + " 입니다.");
						incorrectCount++;
					}
				}
			} else if(menu == 2) {
				System.out.println("현재까지 맞춘 정답 개수 : " + correctCount);
				System.out.println("현재까지 틀린 정답 개수 : " + incorrectCount);
			} else if(menu == 3) {
				System.out.println("종료되었습니다.");
				break;
			} else {
				System.out.println("1~3중에 선택해주세요.");
			}
		}
		
		
	}

}
