package Day10_Practice;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayQuiz2_2 {

	public static void main(String[] args) {
//		2. 배열 두 개의 교집합 구하기
//		두 개의 정수 배열을 입력받아 교집합에 해당하는 숫자들을 출력하세요.
//		예: [1, 2, 3, 4], [3, 4, 5, 6] → 3, 4
//		* 교집합에 해당하는 숫자를 새로운 배열에 넣는게 아니라 그냥 출력
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("첫 번째 배열의 5개 숫자 입력: ");
		int arr[] = new int[5];
		for (int i=0; i<5; i++) {
			arr[i] = s.nextInt();
		}
		System.out.println("두 번째 배열의 5개 숫자 입력: ");
		int arr2[] = new int[5];
		for (int i=0; i<5; i++) {
			arr2[i] = s.nextInt();
		}
		System.out.println("교집합 : ");
		for (int i=0; i<arr.length; i++) {
			for (int j=0; j<arr.length; j++) {
				if (arr[i] == arr2[j]) {
					System.out.print(arr[i] + " ");
				}
			}
		}
		
	}

}
