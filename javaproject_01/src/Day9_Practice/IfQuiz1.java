package Day9_Practice;

import java.util.Scanner;

public class IfQuiz1 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
//		boolean flg = true;
//		
//		while(flg) {
//			String enter = s.nextLine();
//			flg = false;
//			System.out.println(flg);
//		}
		
		boolean flg = false;
		
		while(true) {
			s.nextLine(); // 엔터키 입력
//			flg = !flg;  엔터키 입력할때마다 바뀐다
			
			if (flg == true) {
				System.out.print("true");
				flg = false;
			} else {
				System.out.print("false");
				flg = true;
			}
		}
	}

}
