package Day9_20250729;

public class Review_Day1_Operator5 {
	
	public static boolean oddCheck(int num1) {
		if (num1 % 2 == 1) {
			System.out.println(num1 + "는 홀수 입니다.");
			return true;
		} else {
			System.out.println(num1 + "는 짝수 입니다.");
			return false;
		}
	}

	public static void main(String[] args) {
		
		int num1 = 10;
		int num2 = 5;
		
		System.out.println(num1 > num2 | oddCheck(num1));
		// or를 나타내는 '||'를 두개 쓰면 앞의 값이 true일때 뒤의 값을 실행하지 않음
		// 한개만 쓸 경우 true든 false든 상관없이 무조건 출력함.
	}

}
