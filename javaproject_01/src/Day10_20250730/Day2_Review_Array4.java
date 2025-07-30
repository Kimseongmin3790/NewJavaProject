package Day10_20250730;

import java.util.Arrays;

public class Day2_Review_Array4 {

	public static void main(String[] args) {
		// 공간은 10개
		// 랜덤 숫자범위 : 1~30
		int arr[] = ArrayFunc.randomArr(10, 1, 30);
		System.out.println(Arrays.toString(arr));
		
		int oddCount = ArrayFunc.arrLength(arr, "odd");
		int evenCount = ArrayFunc.arrLength(arr, "even");

		int oddArr[] = ArrayFunc.returnArr(arr,"odd");
		System.out.println(Arrays.toString(oddArr));
		
		int evenArr[] = ArrayFunc.returnArr(arr, "even");
		System.out.println(Arrays.toString(evenArr));
		// 홀수배열 {1,3,5,7,9};
		// 짝수배열 {2,4,6,8,10};
		// oddArr, evenArr
	}

}
