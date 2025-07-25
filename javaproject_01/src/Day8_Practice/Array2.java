package Day8_Practice;

import java.util.Arrays;

public class Array2 {

	public static void main(String[] args) {
		
		int arr[][] = new int[3][3];
		// arr [0] [1, 2, 3]
		// arr [1] [4, 5, 6]
		// arr [2] [7, 8, 9]
		int count = 1;
		for(int i = 0; i<arr.length; i++) { // 0,1,2,3,4,5,6,7,8,9
			for (int j=0; j<arr[i].length; j++) {
				arr[i][j] = count++;
//				i = 0,1,2  / j = 0,1,2 
//				arr[i][j]를 하면 arr[0][0,1,2] -> arr[1][0,1,2] 
//				순차적으로 접근 가능해짐
			}
		System.out.println(Arrays.toString(arr[i]));	
		}
		
	}

}
//{
//{1,2,3},
//{4,5,6},
//{7,8,9},
//}
//arr[i] 번째의 [0]번째 값이 올때마다 +3을 해주면 됨