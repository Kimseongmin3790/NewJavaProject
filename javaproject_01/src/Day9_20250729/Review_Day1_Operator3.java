package Day9_20250729;

public class Review_Day1_Operator3 {

	public static void main(String[] args) {
		// 비교연산자
		// >, <, >=, <=, ==, !=
		
		int num1 = 10;
		int num2 = 5;
		System.out.println(num1 > num2); // true
		if(num1 > num2) {
			System.out.println("num1이 num2보다 크다");
		}
		
		System.out.println(num1 < num2); // false
		
		System.out.println(num1 > 10); // false
		System.out.println(num1 >= 10); // true
		
		System.out.println(num1 == 10); // true
		System.out.println(num1 != 10); // false
		
		System.out.println(!(num1 > num2)); // false ( !는 부정의 의미)
		System.out.println(!true); // false
		
	}

}
