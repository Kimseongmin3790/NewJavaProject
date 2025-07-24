package Day7_20250724;

public class FruitMain {
	
	public static void fruitBoxing(Fruit f, int num ) { // Fruit 클래스 타입의 객체 f를 받는다
		System.out.println(f.name + "를 " + num + "개 포장했습니다.");
	}
	
	public static void main(String[] args) {
		
		Apple apple = new Apple("사과", 1000);
		Orange orange = new Orange("오렌지", 1500);
		Banana banana = new Banana("바나나", 500);
	    
		fruitBoxing(banana, 0); // banana클래스는 Fruit클래스의 서브 클래스이기에 대입이 가능하다.(업캐스팅)
	    Fruit goldApple = new Apple("황금사과", 20000);
	    
	    // class 사람(super class) , class 학생(sub class) , class 교수(sub class) , class 백수(sub class)
	    // 학생 김철수 , 교수 김철수 , 백수 김철수는 모두 사람임
	    // 사람 김철수 , 사람 김철수 , 사람 김철수로 통일가능 (업캐스팅)
	    // 즉, 학생 김철수는 사람 김철수로 취급할 수 있다.
	    // 업캐스팅하면 학생 김철수만의 정보와 메소드는 소실됨 단, 다운캐스팅시 다시 사용 가능
	}

}
