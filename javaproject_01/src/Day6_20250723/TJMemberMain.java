package Day6_20250723;

public class TJMemberMain {
	
	public static void main(String[] args) {
		
		TJMember hong = new TJMember("홍길동", 30, "20250123", 20000);
		hong.money += 50000;
		hong.classMoney += 10000;
		
		TJMember kim = new TJMember("김철수", 20, "20251331", 50000);
		kim.money = kim.money - 10000;
		kim.classMoney += 10000;
		
		TJMember park = new TJMember("박영희", 25, "20252363", 1000000);
		park.money = park.money - 10000;
		hong.classMoney -= 10000;
		System.out.println(TJMember.classMoney);
		
		TJMember.test();
		
		
		// =====================
		
		// Math 클래스는 모든 요소들을 static으로 선언해놨음
		// 따라서 클래스 명으로 PI, abs(), max() 등의 멤버에 접근이 가능
		int a = Math.abs(-10);
		
	}
}
