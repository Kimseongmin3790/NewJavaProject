package day3;

import java.util.Scanner;

public class Loop_While {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		int i=0;
//		while(i<10) {
//			System.out.println(i);
//			i++;
//		}
		
		// 1. 1부터 사용자가 입력한 숫자까지 합을 구하기
		// while문 사용하기
		
//		Scanner s = new Scanner(System.in);
//		System.out.print("숫자 입력 : ");
//		int num = s.nextInt();
//		
//		int i = 1;
//		int sum = 0;
//		while(i<=num) {
//			sum += i; // sum = sum + i;
//			i++;
//		}
//		System.out.println("총 합 : " + sum);
		
		// 2. 구구단짜기
		// while문 사용하기
		
		int i=2;
		while(i<=9) {
			System.out.println("====== " + i + "단 ======");
			int j=1;
			while(j<=9) {
				System.out.println(i + " * " + j + " = " + (i*j));
				j++;
			}
			i++;
			System.out.println();
			
		}
		
		
	}

}
