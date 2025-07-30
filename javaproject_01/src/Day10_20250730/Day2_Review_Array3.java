package Day10_20250730;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Day2_Review_Array3 {

	public static void main(String[] args) {
		
		// 숫자 5개를 입력받아서 배열에 저장하고
		// 해당 배열의 평균을 구하시오.
		
//		Scanner s = new Scanner(System.in);
//		int arr[] = new int[5];
//		System.out.println("숫자 5개를 입력하세요 : ");
//		for (int i=0; i<arr.length; i++) {
//			arr[i] = s.nextInt();
//		}
//		double avg = ArrayFunc.avg(arr);
//		System.out.println("평균 : " + avg);
		
		// --------------------------
		
		// 5개의 공간을 가지는 배열에 랜덤한 숫자(1~10) 사이 값을 넣고
		// 해당 값들 중에서 가장 큰 값을 출력
		
		int arr2[] = ArrayFunc.randomArr(5, 1, 10);
		
		System.out.println(Arrays.toString(arr2));
		int max = ArrayFunc.max(arr2);
		
		System.out.println("가장 큰 값은 : " + max); // ArrayFunc.max(arr2) 굳이 함수 대입 안해도됨
		
		int arr3[] = ArrayFunc.randomArr(5, 20, 100);
		System.out.println(Arrays.toString(arr3));
		// 첫번째 파라미터 : 랜덤한 숫자의 개수(배열의 크기)
		// 두번째 파라미터 : 랜덤한 숫자의 시작점
		// 세번째 파라미터 : 랜덤한 숫자의 끝
		// 결론 : 5개의 공간을 가지는 배열 생성 후
		// 20~100 사이의 랜덤한 값을 넣고 해당 배열 리턴
		
	}

}
