package Day15_Practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class WordQuiz {

	public static ArrayList<HashMap<String, String>> quizList() {

		ArrayList<HashMap<String, String>> list = new ArrayList<>();

		String[] keys = { "멕시코", "스페인", "프랑스", "영국", "그리스", "독일", "중국", "러시아", "일본", "대한민국", "이탈리아", "캐나다", "브라질", "인도",
				"이집트", "호주", "터키", "노르웨이" };

		String[] values = { "멕시코시티", "마드리드", "파리", "런던", "아테네", "베를린", "베이징", "모스크바", "도쿄", "서울", "로마", "오타와", "브라질리아",
				"뉴델리", "카이로", "캔버라", "앙카라", "오슬로" };

		for (int i = 0; i < keys.length; i++) {
			HashMap<String, String> map = new HashMap<>();
			map.put(keys[i], values[i]);
			list.add(map);
		}
		return list;
	}
	
	public static void main(String[] args) {
		
		// 문제는 중간에 종료하지 않으면 최대 10문제까지 출력
		// 중복은 있으면 안됨 
		// 한문제당 10점
		// 종료시 점수 출력 (중간에 종료하지 않았을 경우)
		
		Random ran = new Random();
		Scanner s = new Scanner(System.in);
		ArrayList<HashMap<String, String>> quizList = quizList();

		System.out.println("수도 문제 풀이 ! [-1을 입력하면 종료됩니다.]");
		System.out.println("현재 총 " + quizList.size() + "문제가 있습니다!");	
		// 중복된 문제가 나오지 않게 , quizList.size()만큼 문제를 다 풀면 종료
		HashMap<Integer, Integer> keyTable = new HashMap<>();
		int count = 0;
		int score = 0;
		while (true) {
			int ranNum = ran.nextInt(quizList.size());
			if(keyTable.containsKey(ranNum)) {
				continue;
			}
			keyTable.put(ranNum, 0);
			HashMap<String, String> quiz = quizList.get(ranNum);
			
			String country = "";
			String capital = "";
			Set<String> quizkeySet = quiz.keySet();
			for (String key : quizkeySet) {
				country = key;
				capital = quiz.get(key);
			}
			System.out.print("[" + country + "]의 수도는? >> ");
			String answer = s.next();
			if (answer.equals(capital)) {
				System.out.println("정답!");
				count++;
				score += 10;
			} else if (answer.equals("-1")) {
				System.out.println("게임을 종료합니다.");
				break;
			} else {
				System.out.println("오답! 정답은: " + capital);
				count++;
			}
			if (count == 10) {
				System.out.println("총 10 문제를 다 풀었습니다.");
				System.out.println("최종 점수는 : " + score + "점");
				break;
			}
		}
	}
}
