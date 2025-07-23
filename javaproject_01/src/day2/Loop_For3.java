package day2;

public class Loop_For3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1부터 100까지 중에서 홀수들의 합을 출력
		int oddSum = 0;
//		for(int i=1; i<=100; i++) {
//			if(i % 2 == 1) {
//				oddSum += i; // oddSum = oddSum + i;
//			}
//		}
//		System.out.println(oddSum);
		
		for(int i=1; i<=100; i+=2) {
			oddSum += i;
		}
		System.out.println(oddSum);
	}

}
