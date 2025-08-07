package Day16_Practice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Random;

public class ArrayManager {
	
	// 두번째로 큰 숫자를 리턴해주는 함수
	// parameter 1 => 정수형 배열
	public static int secondMax (int[] arr) {
		Arrays.sort(arr);
		int secondMax = arr[arr.length-2];
		return secondMax;
	}
	
	public static int[] ranArr () {
		HashMap<Integer, Integer> map = new HashMap<>();
		int[] arr = new int[5];
		Random ran = new Random();
		for (int i=0; i<arr.length; i++) {
			int ranNum = ran.nextInt(30)+1;
			if (map.containsKey(ranNum)) {
				i--;
				continue;
			} else {
				map.put(ranNum, 0);
			}
			if (ranNum % 2 == 1) {
				arr[i] = ranNum;
			} else {
				i--;
			}
		}
		return arr;
	}
	
	public static void main(String[] args) {
		System.out.println(Arrays.toString(ranArr()));
	}
}
