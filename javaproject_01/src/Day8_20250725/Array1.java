package Day8_20250725;

import java.util.Arrays;

public class Array1 {
	
	public static void main(String[] args) {
		// 2차원 배열
		int arr[] = new int[3]; // {0, 0, 0}
		int arr2[][] = new int[3][2]; // {{0,0}, {0,0}, {0,0}}
		int arr3[][] = {{1,2}, {3,4}, {5,6}}; // 값을 직접 초기화 하는 것도 가능
		System.out.println(Arrays.toString(arr3[0]));
	}
}
