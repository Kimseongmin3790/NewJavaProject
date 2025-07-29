package Day9_20250729;

public class Review_Day1_Var {

	public static void main(String[] args) {
		
		int age = 30; // 정수 => long(21억 이상의 숫자)
		double height = 170.5;
		boolean isMarried = true; // true or false
		
		String name = "홍길동";
		
		if (age == 30) {
			System.out.println("30 맞다");
		}
		if (name.equals(name)) { 
			// 문자열에서는 '==' 이거 쓰지 말 것
			// String은 클래스이기에
			System.out.println("홍길동이다");
		}
		
		int a = 30;
		double b = a; // 30.0
		
		double c = 30.5;
		int d = (int) c; // 값의 소실(0.5가 사라짐)
		
		String f = "1";
		System.out.println(f + 1); // 문자로 취급되어서 11 을 출력함
		
//		int g = Integer.parseInt(f + 1); 숫자로 바꿀수는 있다
		
		
	}

}
