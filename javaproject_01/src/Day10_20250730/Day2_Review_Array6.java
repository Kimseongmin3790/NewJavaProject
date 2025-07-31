package Day10_20250730;

import java.util.Arrays;

public class Day2_Review_Array6 {

	public static void main(String[] args) {
		
		/* int arr[] = ArrayFunc.randomArr(10, 1, 30);
		System.out.println(Arrays.toString(arr));
		// 오름차순 => Arrays.sort(arr)
		// 내림차순 => ArrayFunc.descSort(arr);
		
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		
		ArrayFunc.descSort(arr);
		System.out.println(Arrays.toString(arr));
		
//		new int [3][2]
		int arr2[][] = {
				{10, 5},
				{3, 7},
				{2, 9}
		};
		
//		arr2[1][0] = 30;
//		arr2[1][1] = 50;
//		
//		int arr3[] = {100,200};
//		arr[1] = arr3;
		
		// arr2 의 모든 값의 합
		
		int sum = 0;
		
//		for (int i=0; i<arr2.length; i++) {
//			for (int j=0; j<arr2[i].length; j++) {
//				sum += arr2[i][j];
//			} 
//		}
		
		for (int i=0; i<arr2.length; i++) {
			sum += ArrayFunc.sum(arr2[i]); // arr2[0] = 배열 {10,5}
		}
		
		System.out.println(sum);*/
		
		// ----------------------------
		// 4 * 5 배열에 랜덤한 숫자를 넣으면 좋겠다
		// 랜덤한 숫자의 범위는 10~50 사이이면 좋겠다
		// ArrayFunc 클래스의 randomArr() 함수를 쓰면 좋겠다
		
		int arr3[][] = new int[4][5];
		for (int i=0; i<arr3.length; i++) {
			int arr4[] = ArrayFunc.randomArr(5, 10, 50);
			arr3[i] = arr4;
		System.out.println(Arrays.toString(arr3[i]));	
		}
		
//		arr3[0][3] 값과
//		arr3[2][1] 값이 중복될경우
//		다시 랜덤한 값을 부여하도록
		
//		for (int i = 0; i<arr2.length; i++) {
//			arr2[i] = ran.nextInt(end-start+1) + (start); 
//			for (int j=0; j<i; j++) {
//				if (arr2[i] == arr2[j]) {
//					i--;
//					break;
//				}
//			}
//		}
	}

}
