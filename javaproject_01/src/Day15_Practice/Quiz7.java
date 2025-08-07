package Day15_Practice;

import java.util.HashMap;
import java.util.Scanner;

public class Quiz7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 문자열을 입력받아서
		// 문자 빈도 찾기
		// ex) Show me the money
		// 결과 : s : 1, h : 2, o : 2, w : 1 .... y : 1
		// 대소문자 구분x
		HashMap<String, Integer> map = new HashMap<>();
		Scanner s = new Scanner(System.in);
		System.out.println("문자열 입력 : ");
		String word = s.nextLine();
		String word2 = "";
		for (int i = 0; i < word.length(); i++) {
			word2 = Character.toString(word.charAt(i)).toLowerCase();
			if (word2.equals(" ")) {
				continue;
			}
			if (map.containsKey(word2)) {
				map.put(word2, map.get(word2) + 1);
			} else {
				map.put(word2, 1);
			}
		}
		System.out.println(map);
		
	}

}
