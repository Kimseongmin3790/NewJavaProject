package Day13_20250804;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class MapEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		ArrayList<HashMap<String, Object>> list = new ArrayList<>(); 
		// 해시맵클래스 타입으로 만든 객체가 들어갈 리스트 생성
		
//		for (int i=0; i<3; i++) {
//			HashMap<String, Object> map = new HashMap<>();
//			// 정보를 담을 객체 생성(해시맵으로 만든)
//			System.out.println("이름 : ");
//			map.put("name", s.next());
//			System.out.println("나이 : ");
//			int age = s.nextInt();
//			map.put("age", age);
//			System.out.println("주소 : ");
//			String addr = s.next();
//			map.put("addr", addr);
//			list.add(map); // 리스트에 해시맵으로 만든 객체 넣기 (정보가 들어간)
//		}
//		System.out.println(list);
		
		for(int i=0; i<list.size(); i++) {
			HashMap<String, Object> user = list.get(i);
//			System.out.println(user.get("name"));
			System.out.println(list.get(i).get("name"));
		}
		
		System.out.println("검색할 사람 입력 : ");
		String name = s.next();
		for(int i=0; i<list.size(); i++) {
			HashMap<String, Object> user = list.get(i);
			if (name.equals(user.get("name"))) {
				System.out.println("찾았다!");
			}
		}
		
	}

}
