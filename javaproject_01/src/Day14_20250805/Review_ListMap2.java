package Day14_20250805;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Review_ListMap2 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// List + Map
		// 사용자로부터 이름, 나이를 입력받아서
		// 3명의 정보를 Map의 형태로 만든 후 List에 저장하는 코드 작성
		ArrayList<HashMap<String, Object>> list = new ArrayList<>();
		Scanner s = new Scanner(System.in);
		for(int i=0; i<3; i++) {
			HashMap<String, Object> map = new HashMap<>();
			System.out.print("이름을 입력하세요 : ");
			String name = s.next();
			map.put("name", name);
			System.out.print("나이를 입력하세요 : ");
			int age = s.nextInt();
			map.put("age", age);
			
			list.add(map);
		}
		System.out.println(list);
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i).get("name")); // 메소드 체이닝 => 메소드끼리 연결
		}
	}

}
