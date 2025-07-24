package Day7_Practice;

import java.util.Arrays;

public class ArrayFunc {
	
	static int maxArr(int arr[]) {
		int max = 0; // arr[0]
		for (int i=0; i<arr.length-1; i++) { // [i = 1 ; i<arr.length
			if (arr[i] > arr[i+1]) { // > max
				max = arr[i]; 
			}
		}
		return max;
	}
	
	// =====================================
	static double avgArr(int arr[]) {
		int avg = 0;
		for(int i=0; i<arr.length; i++) {
			avg += arr[i];
		}
		double ans = (double)(avg / arr.length);  // return (double) avg / arr.length
		return ans; 
	}
	
	// ===============================================
	static int[] oddArr(int arr[]) {
		int count = 0;
		
		for(int i=0; i<arr.length; i++) {
			if (arr[i] % 2 == 1) {
				arr[count] = arr[i]; 
				count++; // 3
			}
		}
		
		int arr2[] = new int[count]; 
		
		for(int j=0; j<arr2.length; j++) {
			arr2[j] = arr[j];
		}
		return arr2;
	}
	
	//========================================
	static int[] bigNumArr (int arr[]) {
		int bigcount = 0;
		
		for(int i=0; i<arr.length; i++) {
			if (arr[i] > 7) {
				arr[bigcount] = arr[i];
				bigcount++;	
			}
		}
		
		int arr2[] = new int [bigcount];
		
		for (int i=0; i<arr2.length; i++) {
			arr2[i] = arr[i];
		}
		
		return arr2;
	}
	
	
	
	
	
	
	
}
