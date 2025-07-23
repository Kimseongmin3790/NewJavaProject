package day5;

import java.util.Arrays;

public class Day4_Review2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {3,5,1,4,2};
		// 가장 작은 값의 위치 찾기(index)
		int minIndex = 0;
		for(int i=1; i<arr.length; i++) {
			if(arr[i] < arr[minIndex]) {
				minIndex = i;
			}
		}
		System.out.println("가장 작은 값의 위치 : " + minIndex);
		
		int temp = arr[0]; // temp = 3
		arr[0] = arr[minIndex]; // {1,5,1,4,2};
		arr[minIndex] = temp; // {1,5,3,4,2};
		
		System.out.println(Arrays.toString(arr));
		
		
		
	}

}
