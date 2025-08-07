package Day16_Practice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Random;
import java.util.Set;

public class TestQuiz6 {

	public static int maxValue (HashMap<Integer, Integer> map) {
		int max = 0;
		for (int key : map.keySet()) {
			if (max < map.get(key)) {
				max = map.get(key);
			}
		}
		return max;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		6. 20개의 공간을 가지는 배열을 생성하고, 랜덤한 숫자 1~10사이의 값을 20개의 공간에 모두 넣으시오.
//		그 후, 중복된 숫자가 가장 많은 수의 숫자와 개수를 출력하시오.
//		ex) [1,2,3,5,4,2,7,1,2,3,6,8,1,3,2,6,2,3,1,2]
//		위처럼 배열이 생성된 경우 2는 6개로 가장 많으므로 
//		'가장 많은 수 : 2, 개수 : 6' 형태로 출력
		
		int arr[] = new int [20];
		Random ran = new Random();
		HashMap<Integer, Integer> map = new HashMap<>();
		for(int i=0; i<arr.length; i++) {
			arr[i] = ran.nextInt(10)+1;
			if (map.containsKey(arr[i])) {
				map.put(arr[i], map.get(arr[i]) + 1);
			} else {
				map.put(arr[i], 1);
			}
		}
		System.out.println(Arrays.toString(arr));
		System.out.println(map);
		
		int max = maxValue(map);
		
		for (int maxKey : map.keySet()) {
			if (map.get(maxKey) == max) {
				System.out.println("가장 많은 수 : " +  maxKey + ", 개수 : " + max);
			}
		}
	}

}
