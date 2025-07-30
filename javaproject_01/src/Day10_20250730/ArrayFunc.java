package Day10_20250730;

import java.util.Arrays;
import java.util.Random;

public class ArrayFunc {
	
	// 배열의 모든 값을 음수로 만드는 메소드
	// parameter1 : 정수형 배열
	public static void minusArr(int arr[]) {
		for (int i=0; i<arr.length; i++) {
			arr[i] = -arr[i];
		}
	}
	
	// 배열에서 가장 큰 값을 찾아서 리턴하는 메소드
	// parameter1 : 정수형 배열
	public static int max(int arr[]) {
		int max = arr[0];
		for (int i=1; i<arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		return max;
	}
	
	// 배열의 모든 값의 합을 구해서 리턴하는 메소드
	// parameter1 : 정수형 배열
	public static int sum(int arr[]) {
		int sum = 0;
		for (int i : arr) {
			sum += i;
		}
		return sum;
	}
	
	// 배열에서 특정 인덱스(parameter2)의 값을 리턴하는 메소드
	// parameter1 : 정수형 배열
	// parameter2 : 정수
	public static int indexValue(int arr[], int a) {
		return arr[a];
	}
	
	// 배열안의 값들의 평균값을 구해서 리턴하는 메소드
	// parameter1 : 정수형 배열
	public static double avg(int arr[]) {
		int sum = 0;
		for (int i : arr) {
			sum += i;
		}
		double avg = sum / arr.length;
		return avg;
	}
	
	// 배열 안에 특정 값(parameter2)이 있는지 확인해주는 메소드
	// parameter1 : 정수형 배열
	// parameter2 : 정수
	public static boolean searchValue(int arr[], int a) {
		boolean flg = false;
		for(int i : arr) {
			if (i == a) {
				flg = true;
			}
		}
		return flg;
	}
	
	// 정해진 크기(parameter1)만큼의 배열을 만들고 시작값(parameter2)과 끝(parameter3) 숫자 사이의
	// 값을 중복되지 않게 랜덤으로 넣어주는 메소드
	// parameter1 : 정수
	// parameter2 : 정수
	// parameter3 : 정수
	public static int[] randomArr(int size, int start, int end) {
		
		int arr2[] = new int[size];
		
		Random ran = new Random();
		
		for (int i = 0; i<arr2.length; i++) {
			arr2[i] = ran.nextInt(end-start+1) + (start); 
			for (int j=0; j<i; j++) {
				if (arr2[i] == arr2[j]) {
					i--;
					break;
				}
			}
		}
		
		return arr2;
	}
	
	// 배열 내의 홀수(odd), 짝수(even)의 개수를 리턴해주는 메소드
	// parameter1 : 정수형 배열
	// parameter2 : 홀수, 짝수 구분 문자열(odd or even)
	// ** kind에 odd,even 외에 값에 대한 예외처리 필요 **
	public static int arrLength(int arr[], String kind) {
		
		
		int Count = 0;
//		int oddCount = 0;
		int num = kind.equals("odd") ? 1 : 0;
		for (int i=0; i<arr.length; i++) {
			if (arr[i] % 2 == num) {
				Count++;
			}
		}	
//		
//		if (odd.equals("odd")) {
//			return oddCount;
//		} else if (odd.equals("even")){
//			return evenCount;
//		} else {
//			return 0;
//		}
		return Count;
	}
	
	// 배열 내의 홀수(odd), 짝수(even)를 따로 분류해서 배열로 만든 후 리턴해주는 메소드
	// parameter1 : 정수형 배열
	// parameter2 : 홀수, 짝수 구분 문자열(odd or even)
	// parameter3 : 홀수 혹은 짝수 배열의 개수
	// ** kind에 odd,even 외에 값에 대한 예외처리 필요 **
	public static int[] returnArr(int[] arr, String kind, int size) {
		
		int newArr[] = new int[size];
		
		int count = 0;
		int num = kind.equals("odd") ? 1 : 0;
		
		for (int i=0; i<arr.length; i++) {
			if(arr[i] % 2 == num) {
				newArr[count++] = arr[i];
			}
		}
		return newArr;
	}
	
//	public static int[] returnArr(int[] arr, String kind) {
//	
//		int oddArr[] = new int[ArrayFunc.arrLength(arr, kind)];
//		int count = 0;
//		
//		int num = kind.equals("odd") ? 1 : 0;
//		for (int i=0; i<arr.length; i++) {
//			if (arr[i] % 2 == num) {
//				oddArr[count++] = arr[i];
//			}
//		}
//		return oddArr;
//	}
	
	// 배열 내의 홀수(odd), 짝수(even)를 따로 분류해서 배열로 만든 후 리턴해주는 메소드
	// parameter1 : 정수형 배열
	// parameter2 : 홀수, 짝수 구분 문자열(odd or even)
	// ** kind에 odd,even 외에 값에 대한 예외처리 필요 **
	public static int[] returnArr(int[] arr, String kind) {
		return returnArr(arr, kind, ArrayFunc.arrLength(arr, kind));
	}
	
	// 배열을 내림차순 해주는 메소드
	public static void descSort(int[] arr) {
//		for (int i=0; i<arr.length-1; i++) {
//			for (int j=i+1; j<arr.length; j++) {
//				if (arr[i] < arr[j]) {
//					int temp = arr[i];
//					arr[i] = arr[j];
//					arr[j] = temp;
//				}
//			}
//		}
		
		ArrayFunc.minusArr(arr);
		Arrays.sort(arr);
		ArrayFunc.minusArr(arr);
		
	}
	
}	
