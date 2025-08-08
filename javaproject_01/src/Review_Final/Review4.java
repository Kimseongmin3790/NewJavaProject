package Review_Final;

import Day7_20250724.Student;

public class Review4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String arr[] = {"java", "oracle", "html", "javascript", "jsp"};
		// 가장 길이가 긴 문자 출력
		int max = 0;
		String maxstr = arr[0];
		for (String str : arr) {
			if (max < str.length()) {
				max = str.length();
				maxstr = str;
			}
		}
		System.out.println(maxstr);
		
		
	}

}
