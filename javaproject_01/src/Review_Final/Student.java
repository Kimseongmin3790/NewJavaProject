package Review_Final;

public class Student extends Person {

	int stuNo;

	public Student(String name, int age, double height, int stuNo) {
		super(name, age, height);
		this.stuNo = stuNo;
	}

	public void study() {
		System.out.println("공부");
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("학식 먹는다");
	}

	@Override
	public boolean equals(Object obj) {
		Student s = (Student) obj;
		if (getName().equals(s.getName()) && getAge() == s.getAge() && getHeight() == s.getHeight()) {
				return true;
		} else {
			return false;
		}
	}
}