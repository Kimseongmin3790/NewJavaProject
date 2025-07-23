package Day6_20250723;

public class TJMember {
	String name;
	int age;
	String stuNo;
	int money;
	static int classMoney;
	
	
	TJMember (String name, int age, String stuNo, int money) {
		this.name = name;
		this.age = age;
		this.stuNo = stuNo;
		this.money = money;
	}
	
	static void test() {
		System.out.println("static 테스트");
	}
	
	
	
	
}
