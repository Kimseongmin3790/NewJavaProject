package day3;

import java.util.Random;
import java.util.Scanner;

public class Loop_Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random ran = new Random();
		Scanner s = new Scanner(System.in);
		
		System.out.print("원하는 문제수를 입력해 주세요 : ");
		int num = s.nextInt();
		System.out.println(num + "문제 풀이를 시작합니다. 정답에 0을 입력하면 종료됩니다.");
		
		int count = 0; // 정답 개수
		for(int i=1; i<=num; i++) {
			int x = ran.nextInt(8)+2; // 2~9
			int y = ran.nextInt(9)+1; // 1~9
			System.out.print(i+"번 문제 : " + x + " * " + y + " = ");
			int answer = s.nextInt();
			if(answer == (x*y)) {
				System.out.println("정답 입니다.");
				count++; 
			} else if(answer == 0) {
				System.out.println("0일 입력하여 종료됩니다..");
				num = i-1;
				break;
			} else {
				System.out.println("오답 입니다.");
			}
		}
		System.out.println("총 " + num + "문제 중 " + count + "문제를 맞추셨습니다.");
	}

}
