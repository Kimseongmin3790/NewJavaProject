package day4;

import java.util.Arrays;

public class Array6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. arr 배열에서 가장 큰 값의 위치(index) 찾기
		// 가장 작은 값의 위치도 찾기
		// 가장 큰 값과 작은 값의 위치 바꾸기 // {20,5,3,10,25}
		int arr[] = {20,5,25,10,3}; 
		int maxIndex = 0;
		int minIndex = 0;
		for(int i=1; i<arr.length; i++) {
			if(arr[i] > arr[maxIndex]) {
				maxIndex = i;
			}
			
			if(arr[i] < arr[minIndex]) {
				minIndex = i;
			}
		}
		System.out.println("가장 큰 값 위치 : " + maxIndex);
		System.out.println("가장 작은 값 위치 : " + minIndex);
		
		// 가장 큰 값과 작은 값의 위치 바꾸기 
		
		// {20,5,25,10,3}
		// {20,5,3,10,25}
		
		int temp = arr[maxIndex]; // temp = 25
		arr[maxIndex] = arr[minIndex];
		arr[minIndex] = temp;
		
		System.out.println(Arrays.toString(arr)); 
		
		
	}
}
