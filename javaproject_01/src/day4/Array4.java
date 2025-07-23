package day4;

import java.util.Arrays;
import java.util.Scanner;

public class Array4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 1. 사용자로부터 숫자 5개를 입력받아서 배열에 저장
		// 단, 0이하의 숫자를 입력할 경우 다시 입력하도록
		// System.out.println(Arrays.toString(arr));
		Scanner s = new Scanner(System.in);
		int arr[] = new int[5];
		
		for(int i=0; i<arr.length; i++) {
			System.out.print((i+1) + "번째 숫자 입력 : ");
			arr[i] = s.nextInt();
			if(arr[i] <= 0) {
				System.out.println("1이상의 숫자 입력해주세요.");
				i--;
			}
		}
		System.out.println(Arrays.toString(arr));
		
	}

}
