package Day15_20250806;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		while (true) {
			try {
				System.out.println("숫자 입력 1 : ");
				int num1 = s.nextInt(); // 홍길동\n 이 입력됨
				// 홍길동\n이 버퍼에 남아있음
				System.out.println("숫자 입력 2 : ");
				int num2 = s.nextInt();
				System.out.println(num1 / num2);
			} catch (ArithmeticException e) {
				// TODO: handle exception
				System.out.println("0으로 나눌 수 없음");
			} catch (InputMismatchException e) {
				// TODO: handle exception 
				System.out.println("숫자를 입력해라");
				// 예외 처리로 이동해서 프린트문을 실행하고 다시 올라감
				s.nextLine(); // \n을 인식해서 홍길동\n을 없앰
			}
		}
	}

}
