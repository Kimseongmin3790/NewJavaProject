package Day12_20250801;

import java.util.Scanner;

public class SubStr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String word = "Java Programming";
		
		
//		System.out.println(word.substring(1));
//		System.out.println(word.substring(1, 5));
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("문자열을 입력하세요 : ");
		
		String word = s.next();
		
		for (int i=0; i<word.length(); i++) {
			String first = word.substring(0,1);
			String last = word.substring(1);
			word = last + first;
			System.out.println(word.substring(0));
		}
		
//		for (int i=0; i<word.length(); i++) {
//			System.out.print(word.substring(i+1));
//			System.out.println(word.charAt(0));
//		}
	}

}
