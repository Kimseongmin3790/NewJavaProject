package Day14_Practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CollectionQuiz1 {
	
	public static int subjectScore(String subject) {
		Scanner s = new Scanner(System.in);
		System.out.print(subject + " 점수 : ");
		int score = s.nextInt();
		return score;
	}
	

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		ArrayList<HashMap<String, Object>> list = new ArrayList<>();
		
		while(true) {
			System.out.print("[ (1) 추가 (2) 확인 (3) 점수수정 (4) 종료 ] : ");
			int menu = s.nextInt();
			
			if (menu == 1) {
				HashMap<String, Object> map = new HashMap<>();
				System.out.print("이름 : ");
				String name = s.next();
				map.put("name", name);
				
				map.put("korScore", subjectScore("국어"));
				map.put("engScore", subjectScore("영어"));
				map.put("mathScore", subjectScore("수학"));
				
				list.add(map);
			}
			
			if (menu == 2) {
				for(int i=0; i<list.size(); i++) {
					float sum = 0;
					HashMap<String, Object> user = list.get(i);
					sum = (int)user.get("korScore") + (int)user.get("engScore") + (int)user.get("mathScore");
					sum = sum / 3 ; 
					System.out.println((i+1) + ". 이름 : " + user.get("name"));
					System.out.print("   국어 : " + user.get("korScore") + ", ");
					System.out.print("영어 : " + user.get("engScore") + ", ");
					System.out.print("수학 : " + user.get("mathScore") + ", ");
					System.out.println("평균 : " + sum);
				}
				
			}
			
			if (menu == 3) {
				System.out.println("점수를 수정할 학생의 이름을 입력해주세요 :");
				String name = s.next();
				boolean flg = false;
				for(int i=0; i<list.size(); i++) {
					if(name.equals(list.get(i).get("name"))) {
						System.out.println("수정할 과목을 선택하세요 (1. 국어 2. 영어 3. 수학): ");
						flg = true;
						int num = s.nextInt();
						if (num == 1) {
							System.out.println("새로운 점수를 입력하세요: ");
							int newScore = s.nextInt();
							list.get(i).put("korScore", newScore);
							System.out.println("점수가 수정되었습니다.");
						} else if (num == 2) {
							System.out.println("새로운 점수를 입력하세요: ");
							int newScore = s.nextInt();
							list.get(i).put("engScore", newScore);
							System.out.println("점수가 수정되었습니다.");
						} else if (num == 3) {
							System.out.println("새로운 점수를 입력하세요: ");
							int newScore = s.nextInt();
							list.get(i).put("mathScore", newScore);
							System.out.println("점수가 수정되었습니다.");
						} else {
							System.out.println("잘못된 과목 번호입니다.");
						}
					}
				}
			if (flg == false) {
				System.out.println("없는 사람입니다");
				}
			}
			if (menu == 4) {
				break;
			}
			
		System.out.println("-------------------------");	
		}
		
		
		
	}

}
