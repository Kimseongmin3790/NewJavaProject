package Day10_Practice;

import java.util.Arrays;
import java.util.Scanner;

import Day10_20250730.ArrayFunc;

public class ArrayQuiz2_1 {

	public static void main(String[] args) {
//		1. 배열 회전 프로그램
//		사용자로부터 정수 배열(예: 5개)을 입력받고, 오른쪽으로 한 칸씩 회전시킨 결과를 출력하세요.
//		예: 1 2 3 4 5 → 5 1 2 3 4
		
		Scanner s = new Scanner(System.in);
		
		int arr[] = new int[5];
		System.out.println("정수 5개를 입력하세요 : ");
		for (int i = 0; i<=4; i++) {
			arr[i] = s.nextInt();
		}
		
		for (int i=0; i<arr.length-1; i++) {
			int temp = arr[i];
			arr[i] = arr[arr.length-1];
			arr[arr.length-1] = temp;
		}
		
		System.out.println(Arrays.toString(arr));
	}

}
