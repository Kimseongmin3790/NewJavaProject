package day3;

import java.util.Scanner;

public class Day2_Review5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		Scanner s = new Scanner(System.in);
		// 1. 숫자를 하나 입력받아서 홀수면 '홀수' 짝수면 '짝수' 출력
//		System.out.print("숫자 입력 : ");
//		int input = s.nextInt();
//		if(input % 2 == 0) {
//			System.out.println("짝수");
//		} else {
//			System.out.println("홀수");
//		}
		
		
		// 2. 숫자를 5번 입력받아서 해당 숫자들의 합을 출력
//		int sum = 0;
//		for(int i=1; i<=5; i++) {
//			System.out.print(i + "번째 숫자 입력 : ");
//			int input = s.nextInt();
//			sum = sum + input; // sum += input;
//		}
//		System.out.println("총 합 : " + sum);
		
		
		// 3. 숫자를 5번 입력받아서 입력받은 수 중에서 가장 큰 수만 출력
		// 무조건 양수만 입력한다고 가정
		int max = 0; // 5
		for(int i=1; i<=5; i++) {
			System.out.print(i + "번째 숫자 입력 : ");
			int input = s.nextInt();
//			if(i == 1) { // 모두 음수를 입력했을 때 정상 동작시키는 조건문
//				max = input;
//			}
			if(input > max) {
				max = input;
			}
		}
		System.out.println("큰 수 : " + max);
		
	}

}
