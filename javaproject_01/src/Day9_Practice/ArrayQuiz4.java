package Day9_Practice;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayQuiz4 {

	public static void main(String[] args) {
		/* 4. 달팽이 배열 만들기
		설명: 입력된 크기 n에 대해 n x n 배열을 달팽이처럼 숫자로 채우세요.
		제약: 배열과 조건문만 사용
		입력 예시: n = 4
		출력 예시:

		1   2   3   4
		12  13  14  5
		11  16  15  6
		10   9   8  7*/
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("크기를 입력하세요 : ");
		
		int n = s.nextInt();
		
		int arr[][] = new int[n][n];
		
		int count = 1;
		for (int i = 0; i<n; i++) {
			for (int j=0; j<n; j++) {
				arr[i][j] = count;
				count++;
			}
		System.out.println(Arrays.toString(arr[i]));	
		}
		
//		arr[0,1,2,3][0,1,2,3] = 1 2 3 4
//		arr[1][3], arr[2][3], arr[3][3] = num + 1 , num + 2 , num + 3
//		arr[3][2], arr[3][1], arr[3][0] = arr[3][3] +1 , +2, +3
//		arr[2][0], arr[1][0] = arr[3][0] +1, +2
//		3, 2, 2, 1, 1
//		4, 3, 3, 2, 2, 1, 1
//		5, 4, 4, 3, 2, 2, 1, 1
//		6, 5, 5, 4, 4, 3, 3, 2, 2, 1, 1
//		7, 6, 6, 5, 5, 4, 4, 3, 3, 2, 2, 1, 1
	}

}
