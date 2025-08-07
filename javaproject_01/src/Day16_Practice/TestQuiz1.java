package Day16_Practice;

import java.util.Random;
import java.util.Scanner;

public class TestQuiz1 {

	public static void main(String[] args) {
		/*
		 * 클래스 : 객체 지향적 요소로서 필드와 메소드를 가지고 있는 일종의 틀이자 설계도이다. 앞글자는 무조건 대문자로 써야하며 추상적인 구조.
		 * 객체 : 클래스에 의해 정의되며, 클래스를 기반으로 생성된 데이터, 클래스의 인스턴스라고 불린다 상속 : extends를 사용하여
		 * 상속하거나 받을 수 있으며 상속하는 클래스는 부모(super)클래스, 상속받는 클래스는 자식(sub)클래스 라고 부른다. 자식 클래스는
		 * 부모 클래스가 가진 필드,메소드를 모두 가지게 되며 super를 통해 사용할 수 있게 된다. 부모 클래스의 메소드는 자식 클래스에서
		 * 오버라이딩이 가능하다.
		 * 
		 * 데이터 형식 : int(정수), double(실수), String(문자열) <= [앞글자가 대문자이기에 클래스], char(문자),
		 * int[](정수가 담긴 배열) , boolean(true or false)
		 */

//		2. 1부터 50까지 숫자 중 짝수이거나 5의 배수인 숫자를 출력하시오.
//		 조건 1. 반복문과 조건문을 사용할 것

//		for (int i=1; i<=50; i++) {
//			if(i % 2 == 0 || i % 5 == 0) {
//				System.out.println(i);
//			}
//		}

//		3. 구구단 문제를 랜덤으로 생성하여 출력하고 사용자로부터 답을 입력 받으시오.
//		 조건 1. 기본적으로 랜덤 문제를 5번 제공한다.
//		 조건 2. 5문제 중 3문제 이상 정답을 맞췄을 경우 종료한다.
//		 조건 3. 5문제 중 3문제 이상 틀렸을 경우 위 과정을 다시 반복 한다.
//		 조건 4. print문으로 출력하는 문구는 자유롭게 정의한다.
//		Scanner s = new Scanner(System.in);
//		Random ran = new Random();
//
//		while (true) {
//			int correct = 0;
//			int wrong = 0;
//			for (int i = 0; i < 5; i++) {
//				int dan1 = ran.nextInt(8) + 2;
//				int dan2 = ran.nextInt(9) + 1;
//				System.out.print(dan1 + " * " + dan2 + " = ");
//				int answer = s.nextInt();
//				if (answer == dan1 * dan2) {
//					System.out.println("정답");
//					correct++;
//				} else {
//					System.out.println("오답");
//					wrong++;
//				}
//			}
//			if (correct >= 3) {
//				System.out.println("3문제 이상 맞췄으므로 종료합니다.");
//				break;
//			} else if (wrong >= 3) {
//				System.out.println("3문제 이상 틀렸으므로 다시 반복합니다.");
//			}
//		}

	}

}
