package Day13_20250804;

import java.util.ArrayList;
import java.util.HashMap;

public class MapEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Object> user1 = new HashMap<>();
		user1.put("name", "홍길동");
		user1.put("age", 30);
		user1.put("height", 170.5);
		user1.put("isMarried", true);
		
		HashMap<String, Object> user2 = new HashMap<>();
		user2.put("name", "김철수");
		user2.put("age", 40);
		user2.put("height", 180.1);
		user2.put("isMarried", true);
		
		HashMap<String, Object> user3 = new HashMap<>();
		user3.put("name", "아무개");
		user3.put("age", 20);
		user3.put("height", 177.5);
		user3.put("isMarried", false);
		
//		System.out.println(user1);
//		System.out.println(user2);
//		System.out.println(user3);
		
		ArrayList<HashMap<String, Object>> list = new ArrayList<>();
		list.add(user1);
		list.add(user2);
		list.add(user3);
		System.out.println(list);
		
	}

}
