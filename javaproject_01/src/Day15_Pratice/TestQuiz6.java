package Day15_Pratice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Random;
import java.util.Set;

public class TestQuiz6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		6. 20개의 공간을 가지는 배열을 생성하고, 랜덤한 숫자 1~10사이의 값을 20개의 공간에 모두 넣으시오.
//		그 후, 중복된 숫자가 가장 많은 수의 숫자와 개수를 출력하시오.
//		ex) [1,2,3,5,4,2,7,1,2,3,6,8,1,3,2,6,2,3,1,2]
//		위처럼 배열이 생성된 경우 2는 6개로 가장 많으므로 
//		'가장 많은 수 : 2, 개수 : 6' 형태로 출력
//		 -- 오늘 실습한 수도 맞추기 퀴즈에서 HashMap의 keyTable 형식을 참고하면 도움이 될 것

		HashMap<Integer, Integer> map = new HashMap<>();
		int[] arr = new int[20];
		Random ran = new Random();
		
		for (int i = 0; i < arr.length; i++) {
			int ranNum = ran.nextInt(10) + 1;
			if (map.containsKey(ranNum)) {
				map.put(ranNum, map.get(ranNum) + 1);
				arr[i] = ranNum;
				continue;
			}
			map.put(ranNum, 1);
			arr[i] = ranNum;
		}
		int max = 0;
		for (int Num : map.keySet()) {
			if (max < map.get(Num)) {
				max = map.get(Num);
			}
		}
		
		for (int Num : map.keySet()) {
			if (max == map.get(Num)) {
				System.out.println("가장 많은 수 : " + Num + ", 개수 : " + max);
			}
		}
		
//		System.out.println(max);
//		System.out.println(Arrays.toString(arr));
//		System.out.println("가장 많은 수 : " + num + ", 개수 : " + num2);

	}

}
