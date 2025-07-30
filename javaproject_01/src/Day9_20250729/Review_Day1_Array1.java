package Day9_20250729;

import java.util.Arrays;

public class Review_Day1_Array1 {

	public static void main(String[] args) {
		
		String subjectarr[] = {"java", "oracle", "html", "javascript", "jsp"};
		int scoreArr[] = {90, 85, 60, 95, 100};
		
		for(int i=0; i<subjectarr.length; i++) {
			System.out.print("과목명 : " + subjectarr[i] + ", ");
			System.out.println("점수 : " + scoreArr[i]);
		}
		
		int arr[] = new int[3]; // {0, 0, 0}
		
		// 점수가 평균을 넘는 과목들을 출력
		// 결과 : 평균이 넘는 과목은 java, javascript, jsp 입니다.
		int sum = 0;
		for(int i : scoreArr) {
			sum += i;
		}
		int num = sum/scoreArr.length; // 평균
		
		System.out.print("평균이 넘는 과목은 "); // String strArr[] = "";
		for(int j=0; j<scoreArr.length; j++) {
			if (scoreArr[j] > num) {
				System.out.print(subjectarr[j] + " "); // subStr += subjectArr[i] + " " ;
			}
		}
		System.out.println("입니다");
	}

}
