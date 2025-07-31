package Day11_20250731;

public class Student extends Person{
	private int stuNo;
	
	public Student(String name, int age, String addr, int stuNo) {
		super(name, age, addr);
		this.stuNo = stuNo;
	}
	
	public void study() {
		System.out.println("공부를 한다");
	}
	
}
