package Day9_Practice;

import java.util.Arrays;

public class ArrayQuiz1 {

	/* 1. 배열 요소 뒤집기
	설명: 주어진 배열을 거꾸로 뒤집어서 출력하기
	목표: 배열 인덱스 다루기
	예시 입력: {1, 2, 3, 4, 5}
	예시 출력: {5, 4, 3, 2, 1}*/
	
	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5};
		
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if (arr[j] > arr[i]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}

}
