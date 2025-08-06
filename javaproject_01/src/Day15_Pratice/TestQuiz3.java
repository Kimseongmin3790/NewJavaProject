package Day15_Pratice;

import java.util.Random;
import java.util.Scanner;

public class TestQuiz3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		3. 구구단 문제를 랜덤으로 생성하여 출력하고 사용자로부터 답을 입력 받으시오.
//		 조건 1. 기본적으로 랜덤 문제를 5번 제공한다.
//		 조건 2. 5문제 중 3문제 이상 정답을 맞췄을 경우 종료한다.
//		 조건 3. 5문제 중 3문제 이상 틀렸을 경우 위 과정을 다시 반복 한다.
//		 조건 4. print문으로 출력하는 문구는 자유롭게 정의한다.

		Random ran = new Random();
		Scanner s = new Scanner(System.in);
		while (true) {
			int collect = 0;
			int wrong = 0;
			for (int i = 0; i < 5; i++) {

				int dan = ran.nextInt(8) + 2;
				int dan2 = ran.nextInt(9) + 1;

				System.out.print(dan + " * " + dan2 + " = ");
				int answer = s.nextInt();

				if (answer == dan * dan2) {
					System.out.println("정답!");
					collect++;
				} else {
					System.out.println("오답!");
					wrong++;
				}
			}
			if (collect >= 3) {
				System.out.println("정답을 3문제 이상 맞췄으므로 종료합니다");
				break;
			} else if (wrong >= 3) {
				System.out.println("오답이 3문제 이상이므로 계속합니다");
				continue;
			}
		}
		
	}

}
