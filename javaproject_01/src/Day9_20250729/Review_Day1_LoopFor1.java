package Day9_20250729;

import java.util.Random;

public class Review_Day1_LoopFor1 {

	public static void main(String[] args) {
		
		Random ran = new Random();
		// 100번 동안 랜덤한 숫자를 갱신해가면서
		// 50이라는 숫자가 몇번째에 나오는지
		
		boolean flg = false;
		int count = 0;
		
		for (int i=1; i<=100; i++) {
			int input = ran.nextInt(100)+1;
			if (input == 50) {
				flg = true;
				break;
			}
		System.out.println(i + "번째 : " + input);
		count++;
		}
		
		if(flg) {
			System.out.println((count+1) + "번째에 50을 찾았습니다.");
		} else {
			System.out.println("100번안에 50이 나오지 않았습니다.");
		}
		
		
	}

}
