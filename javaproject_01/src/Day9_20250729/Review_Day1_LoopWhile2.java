package Day9_20250729;

import java.util.Random;

public class Review_Day1_LoopWhile2 {

	public static void main(String[] args) {
		
		// 랜덤한 숫자(1~100)를 지속적으로 출력하는데
		// 단, 50을 만나면 아래 텍스트 출력 후 종료
		// '50을 출력 후 종료되었습니다.'
		Random ran = new Random();
		
		while(true) {
			int num = ran.nextInt(100)+1;
			if(num == 50) {
				System.out.println("50을 출력 후 종료되었습니다");
				break;
			}
			System.out.println(num);
			
		}
		
		
	}

}
