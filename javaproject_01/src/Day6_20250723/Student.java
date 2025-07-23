package Day6_20250723;

public class Student {
	int stuNo;
	String stuName;
	String stuDept;
	int age;
	String gender;
	
	Student (int stuNo, String stuName) {
		this(stuNo, stuName, "");
	}
	
	Student (int stuNo, String stuName, String stuDept) {
		this.stuNo = stuNo;
		this.stuName = stuName;
		this.stuDept = stuDept;
	}
	
	
	void setInfo(int age, String gender) {
		this.age = age;
		this.gender = gender;
	}
	
	int getAge() { // void로 쓰면 그대로 출력만 됨 / 나이를 넣고 값 리턴받는건 int return 쓰기
		return age; // void로 쓰면 getAge값을 어딘가에 저장할 수 없음
	}
	
	void stuInfo() {
		System.out.println(stuName + " 학생의 학번은 " + stuNo + ", 나이는 " + age + " 입니다.");
	}
	
}
