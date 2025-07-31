package Day11_20250731;

public class HumanMain {

	public static void main(String[] args) {
		
//		Human hong = new Human();
//		hong.name = "홍길동";
//		hong.eat();
//		hong.money = 100000;
//		Human hong = new Human();
//		Human kim = new Human();
//		kim.name = "김철수";
		
		Human hong = new Human("홍길동", 30, "인천", 10000);
		Human kim = new Human("김철수", 25, "서울", 5000);
		
		Human park = new Human("박영희" , 20000); // 이름 , 소유금액
		Human yu = new Human("유재석", 40, "제주도"); // 이름, 나이, 주소
	}

}
