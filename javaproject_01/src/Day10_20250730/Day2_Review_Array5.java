package Day10_20250730;

import java.util.Arrays;

public class Day2_Review_Array5 {


	public static void main(String[] args) {
		
		int arr[] = ArrayFunc.randomArr(10, 1, 30);
		System.out.println(Arrays.toString(arr));
		
		int oddsize = ArrayFunc.arrLength(arr,"odd");
		int evensize = ArrayFunc.arrLength(arr, "even");
		
		int[] oddArr = ArrayFunc.returnArr(arr, "odd", oddsize);
		// 홀수들만 담긴 배열을 리턴
		int[] oddArr2 = ArrayFunc.returnArr(arr, "odd");
		// 홀수들만 담긴 배열을 리턴
	}

}
