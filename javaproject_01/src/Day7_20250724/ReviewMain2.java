package Day7_20250724;

import java.util.Arrays;

public class ReviewMain2 {

	public static void main(String[] args) {
		
//		int a = 10;
//		int b = a;
//		b = 15;
//		System.out.println(a);
		
		Fruit_Review orange = new Fruit_Review("오렌지",1000);
		Fruit_Review jejuorange = new Fruit_Review("제주 오렌지", 1200);
//		Fruit_Review jejuorange = orange;
		
		System.out.println(orange.getPrice());
		jejuorange.setPrice(2000);
		System.out.println(orange.getPrice());
		
//		int arr[] = {1,3,2,4,5};
//		int arr2[] = arr;
//		arr2[2] = 99999;
//		System.out.println(Arrays.toString(arr));
		
		int arr[] = {1,3,2,4,5};
		int arr2[] = new int[arr.length]; // 배열 arr의 길이만큼의 길이를 가진 새로운 배열을 만듬
		
		for(int i = 0; i<arr.length; i++) {
			arr2[i] = arr[i];
		}
		
		
	}

}
