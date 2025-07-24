package Day7_20250724;

public class PersonMain {

	public static void main(String[] args) {
		/* -> 주석 시작
//		Person hong = new Person("홍길동", 30, "인천", 170.1, "남");
//		hong.eat();
//		hong.study(); 자식클래스의 메소드 이므로 접근 불가
//		
//		Student kim = new Student("김철수", 25, "서울", 180.1, 20251234);
//		kim.eat(); // 부모클래스에 속성을 상속받았으므로 eat() 메소드 호출 가능
//		kim.study();
//		주석 끝 -> */
		
//		Worker park = new Worker();
		
		Worker park = new Worker("박영희", 20, "제주도", 165.1);
		park.eat();
	}

}
