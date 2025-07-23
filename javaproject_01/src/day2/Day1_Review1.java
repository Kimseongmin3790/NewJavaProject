package day2;

public class Day1_Review1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 문자를 저장할때는 String 타입을 사용
		String name = "홍길동";
		String addr = "인천";
		// 숫자(정수)를 저장할때는 int 타입을 사용
		// byte, short, long(21억이 넘어가는 아주 큰 숫자들)
		int age = 30;
		// 숫자(실수)를 저장할때는 double 타입을 사용
		// float도 사용가능하지만 숫자뒤에 f를 붙여야 한다.
		double height = 170.5;
		// 참or거짓을 저장할때는 boolean 타입을 사용
		boolean isMarreid = true; // true or false
		
		// ooo의 나이는 oo, 키는 ooo 입니다.
		System.out.println(name + "의 나이는 " + age + ", 키는 " + height + " 입니다.");
		
	}

}
