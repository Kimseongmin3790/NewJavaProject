package Day6_20250723;

import java.util.Arrays;

public class BubbleSort2 {

	public static void main(String[] args) {
		
		int arr[] = {3,5,1,4,2};
		
		for(int i=1; i<arr.length; i++) { // 1,2,3,4 -> 2,3,4 -> 3,4 -> 4
			for(int j=0; j<arr.length; j++) { // 0,1,2,3,4 -> 1,2,3,4 -> 2,3,4 -> 3,4 -> 4
				if (arr[j] < arr[i]) { // arr[0,1,2,3,4] < arr[1]
					int temp = arr[i]; // temp = 5;
					arr[i] = arr[j]; // {3,3,1,4,2}
					arr[j] = temp; // {5,3,1,4,2}
				}
			}
		System.out.println(Arrays.toString(arr));
		}
		
		for(int i=1; i<arr.length; i++) { // 1,2,3,4 -> 2,3,4 -> 3,4 -> 4
			for(int j=0; j<arr.length-i; i++) { // 0,1,2,3,4 -> 1,2,3,4 -> 2,3,4 -> 3,4 -> 4
				if (arr[j] < arr[j+1]) { // arr[0,1,2,3,4] < arr[1]
					int temp = arr[j]; // temp = 5;
					arr[j] = arr[j+1]; // {3,3,1,4,2}
					arr[j+1] = temp; // {5,3,1,4,2}
				}
			}
		System.out.println(Arrays.toString(arr));
		}
		
	}

}
