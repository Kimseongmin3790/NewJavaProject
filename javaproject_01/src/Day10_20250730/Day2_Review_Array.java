package Day10_20250730;

import java.util.Arrays;

public class Day2_Review_Array {
	
	public static void main(String[] args) {
		
		int arr[] = {5, 8, 2, 6, 10, 4};
		
//		for (int i=0; i<arr.length; i++) {
//			for (int j=0; j<arr.length; j++) {
//				if (arr[i] > arr[j]) {
//					int temp = arr[i];
//					arr[i] = arr[j];
//					arr[j] = temp;
//				}
//			}
//		}
		ArrayFunc.minusArr(arr);
		
		Arrays.sort(arr);
		
		ArrayFunc.minusArr(arr);
		
		System.out.println(Arrays.toString(arr));
		
		int maxValue = ArrayFunc.max(arr); // 배열내의 가장 큰 값을 리턴
		System.out.println(maxValue);
		
		
	}

}
