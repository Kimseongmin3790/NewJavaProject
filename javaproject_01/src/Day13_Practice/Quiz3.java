package Day13_Practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Quiz3 {
	
	// 점수의 최대범위만 적어서 나오게 해주는 메소드를 작성
	public static int scoreFunc(String subject, int max) {
		Scanner s = new Scanner(System.in);
		int score = 0;
		while(true) {
			System.out.print(subject + " >> ");
			score = s.nextInt();
			if (score < 0 || score > max) {
				System.out.println(subject + "의 범위는 0부터 " + max + "까지 입니다.");
			} else {
				break;
			}
		}
		return score;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);

		ArrayList<HashMap<String, Object>> list = new ArrayList<>();

		System.out.println("======= 성적관리 시스템 =======");
		System.out.print("인원 수 입력 : ");
		int num = s.nextInt();
		for (int i = 0; i < num; i++) {
			HashMap<String, Object> map = new HashMap<>();

			System.out.print("이름 >> ");
			String name = s.next();
			map.put("name", name);
			
			map.put("java" , scoreFunc("자바", 40));
			map.put("oracle" , scoreFunc("오라클" , 35));
			map.put("html" , scoreFunc("html" , 25));
			
			list.add(map);
			System.out.println("-------------------------");
		}
			
		for(int i=0; i<num; i++) {
			int sum = 0;
			HashMap<String, Object> map = list.get(i);
			sum = (int)map.get("java") + (int)map.get("oracle") + (int)map.get("html");
			System.out.println("이름 : " + map.get("name") + ", 총점 : " + sum);	
		}
		

	}

}
