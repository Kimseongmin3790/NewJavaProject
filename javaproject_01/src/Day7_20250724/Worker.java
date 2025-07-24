package Day7_20250724;

public class Worker extends Person{
	
	Worker() {
		System.out.println("Worker 생성자 실행");
	}
	
	// 생성자를 따로 지정하지 않으면 부모의 기본 생성자 호출
	Worker(String name, int age, String addr, double height) {
		super(name, age, addr, height);
		System.out.println("매개변수 4개짜리 worker 생성자 실행");
	}
	
	
	
}
