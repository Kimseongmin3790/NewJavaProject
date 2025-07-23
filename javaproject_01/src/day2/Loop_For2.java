package day2;

import java.util.Scanner;

public class Loop_For2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int sum = 0; // 1+2+3+4+....+10
//		for(int i=1; i<=10; i++) {
//			sum = sum + i; // sum += i;
//		}
//		System.out.println(sum);
		
		
		// 숫자를 1개 입력받아서 
		// 1부터 입력받은 숫자까지 모두 더하기
		// ex) 20을 입력하면 1부터 20까지의 합 출력
		Scanner s = new Scanner(System.in);
		System.out.print("숫자 입력 : ");
		int num = s.nextInt();
		
		int sum = 0;
		for(int i=1; i<=num ; i++) {
			sum += i; // sum = sum + i;
		}
		System.out.println("1부터 " + num + "까지의 합은 " + sum + " 입니다.");
		
		
		
	}

}
