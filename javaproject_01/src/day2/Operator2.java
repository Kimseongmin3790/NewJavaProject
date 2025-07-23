package day2;

public class Operator2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 비교 연산자
		// 크다, 작다, 같다, 다르다
		
		int num1 = 10;
		int num2 = 5;
		
		System.out.println(num1 > 8); // true
		System.out.println(num1 < num2); // false
		System.out.println(num2 > 5); // false
		System.out.println(num2 >= 5); // true
		System.out.println(num1 <= 10); // true
		
		System.out.println(num1 == num2); // false
		System.out.println(num1 == 10); // true
		
		System.out.println(num1 != num2); // true
		System.out.println(num1 != 10); // false
		
		System.out.println(true); // true
		System.out.println(!true); // false
		
		System.out.println(!(num1 == num2)); // true
		
	}

}
