package Day9_20250729;

public class Review_Day1_If1 {

	public static void main(String[] args) {
		
//		if (true or false) {};
		
		int a = 5;
//		if (a > 2) 
//			System.out.println("a는 2보다 크다");
		// 결과문이 한줄일 경우 '{}' 생략 가능
		// 세미콜론(;)이 나올 경우 모두 출력한 것으로 간주하고 끝내버림
		
//		if (a > 10) {
//			System.out.println("a는 10보다 크다");
//		} else {
//			System.out.println("a는 10보다 작거나 같다");
//		}
		
		if (a > 10) {
			System.out.println("a는 10보다 크다");
		} else if (a >= 7) {
			System.out.println("a는 7보다 크거나 같다");
		} else if (a >= 5) {
			System.out.println("a는 5보다 크거나 같다.");
		} else {
			System.out.println("a는 10보다 작거나 같다");
		}
		
	}

}
