package Review_Final;

import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class Review3 {
	
	public static void main(String[] args) {
		// 향상된 for문
		// 삼항연산자
		int arr[] = {1,5,2,4,6,8};
		for (int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		for(int num : arr) {
			System.out.print(num + " ");
		}
		System.out.println();
		
		HashMap<Integer, Integer> map = new HashMap<>();
		Random ran = new Random();
		
		for(int i=0; i<10; i++) {
			map.put(ran.nextInt(10)+1 , ran.nextInt(10)+1);
		}
		System.out.println(map);
		
		for(int key : map.keySet()) {
			System.out.print(key + " ");
		}
		System.out.println();
		
		Scanner s = new Scanner(System.in);
		String str = s.nextInt() > 10 ? "큰 수" : "작은 수";
		System.out.println(str);
	}
}
