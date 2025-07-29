package Day9_20250729;

import java.util.Random;
import java.util.Scanner;

public class Review_Day1_LoopWhile3 {
	
	static Random ran = new Random();
	static Scanner s = new Scanner(System.in);
//	static int collect = 0;
//	static int all = 0;
	
	public static void randomGuGuDan() { // 정답 갯수를 돌려받게 데이터 타입 선언 후 정답개수 return
		for (int i = 1; i<=3; i++) {
			int dan = ran.nextInt(8)+2;
			int dan2 = ran.nextInt(9)+1;
			System.out.print(dan + "*" + dan2 + "=");
//			all++;
			int answer = s.nextInt();
			if (answer == dan*dan2) {
				System.out.println("정답입니다.");
//				collect++;
			} else {
				System.out.println("오답입니다. 정답은 : " + (dan*dan2) + "입니다.");
			}
		}
	// arr[] = {count, 3-count, 3}	
	// return arr;	
	}
	
	public static void gameUpAndDown() {
		// 1부터 30 사이의 랜덤한 숫자 생성 후
		// 값을 입력받아서 몇번만에 맞추는지 출력해준 후 종료
		// 랜덤 숫자가 입력 값보다 더 클 경우 => 'UP'
		// 작을 경우 => 'DOWN' 출력
		// 정답을 맞추면 'OO번 만에 맞추셨습니다.' 출력
		int ranNum = ran.nextInt(30)+1;
		int count = 0;
		
		while(true) {
			System.out.print("값을 입력해주세요 : ");
			int input = s.nextInt();
			count++; // 여기에 넣으면 3줄짜리를 1줄로 줄일수있다
			if (ranNum > input) {
				System.out.println("UP");
//				count++;
			} else if (ranNum < input) {
				System.out.println("DOWN");
//				count++;
			} else {
//				count++;
				System.out.println(count + "번 만에 맞추셨습니다.");
				break;
			}
		}
	}
	
	public static void main(String[] args) {
		// 메뉴
		// 1을 선택하면 랜덤 구구단 문제 3문제 풀이
		// 2를 선택하면 up&down 게임
		// 1~2 외의 값을 선택하면 종료
		while(true) {
			// int correctCount = 0;
			// int inCorrectCount = 0;
			// all = 0;
			System.out.println("=== 메뉴를 선택해 주세요. ===");
			System.out.print("(1) 랜덤 구구단 (2) up&down (3) 구구단 성적 조회 (그외) 종료 : ");
			int menu = s.nextInt();
			if (menu == 1) {
				// 랜덤 구구단
				randomGuGuDan(); // 배열로 돌려받으면 int arr[] = {정답개수, 오답개수}로 받을수있다
				// correctCount += arr[0];
				// inCorrectCount += arr[1];
				// all += arr[2];
			} else if (menu == 2) {
				// up&down
				gameUpAndDown();
			} else if (menu == 3) {
//				System.out.println(all + "문제 중 " + correctCount + "문제를 맞추셨습니다.");
			} else {
				// 종료
				break;
			}
		}
	}

}
