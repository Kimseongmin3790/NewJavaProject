package Day9_20250729;

import java.util.Scanner;

public class Review_Day1_Operator4 {

	public static void main(String[] args) {
		
		// and(&&) , or(||)
		// and는 둘다 true이면 결과가 true
//		System.out.println(true && true); // true
//		System.out.println(true && false); // false
//		System.out.println(false && true); // false
//		System.out.println(false && false); // false
		
//		int num1 = 10;
//		int num2 = 5;
//		System.out.println(num1 > num2 && num1 % 2 ==0); // true
//		System.out.println(num1 > 8 && num1 % 3 ==0); // false
		
		// or => 둘 중 하나라도 true이면 결과가 true
		// 둘 다 false일때만 결과가 false
		System.out.println(true || true); // true
		System.out.println(true || false); // true
		System.out.println(false || true); // true
		System.out.println(false || false); // false
		
		// 입력받은 숫자가 짝수이거나 3의 배수이면 true 출력
		// 그렇지 않으면 false 출력
		
		Scanner s = new Scanner(System.in);
		System.out.print("숫자를 입력하세요 : ");
		int num = s.nextInt();
		
		System.out.println(num % 2 == 0 || num % 3 == 0);
		
//		if (num % 2 == 0 || num % 3 == 0) {
//			System.out.println("true");
//		} else {
//			System.out.println("false");
//		}
		
	}

}
