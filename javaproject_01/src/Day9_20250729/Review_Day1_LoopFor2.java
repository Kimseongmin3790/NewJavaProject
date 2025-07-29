package Day9_20250729;

public class Review_Day1_LoopFor2 {

	public static void main(String[] args) {
		
		for (int i=5; i>=1; i--) {
			for (int j=1; j<=i; j++) {
				System.out.print("(" + i + "," + j + ")");
			}
			System.out.println();
		}
		
		System.out.println("----------------------");
		
		for (int i=5; i>=1; i--) {
			for (int j=1; j<=6-i; j++) { // j=1 j>=1 j++ / j가 커져도 조건을 만족하기에 무한루프
				System.out.print("(" + i + "," + j + ")");
			}
		System.out.println();
		
		}
		/* i가 5일때 j는 1  6-5 = 1
		   i가 4일때 j는 2  6-4 = 2
		   i가 3일때 j는 3  6-3 = 3
		   i가 2일때 j는 4  6-2 = 4
		   i가 1일때 j는 5  6-1 = 5
		   */
	}

}
