package Day9_20250729;

public class Review_Day1_Operator1 {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 3;
		System.out.println(num1 + num2);
		System.out.println(num1 - num2);
		System.out.println(num1 * num2);
		System.out.println(num1 / num2); // 정수와 정수의 계산 결과 => 정수
		System.out.println((double)num1 / num2); // 실수가 하나라도 포함되어 있다면 => 실수
		System.out.println(num1 % num2); // 10 mod 3(나머지 연산)
		
	}

}
