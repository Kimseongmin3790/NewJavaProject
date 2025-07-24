package Day7_20250724;

public class Student extends Person {
	
	int stuNo;
	
	void study() {
		System.out.println("공부 한다.");
	}
	
	Student(String name, int age, String addr, double height, int stuNo) {
		super(name, age, addr, height);
		this.stuNo = stuNo;
		// TODO Auto-generated constructor stub
	}
	
	@Override
	void eat() {
		System.out.println(name + "이(가) 급식을 먹는다.");
	}
	
	
}
