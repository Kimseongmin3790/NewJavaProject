package Day12_20250801;

public class FoodMain {
	
	public static void foodBoxing(Food f) { // Food를 상속받은 모든 자식클래스의 객체를 넣을 수 있다
		System.out.println(f.name + "를 포장했습니다");
		int takeOutPrice = 0;
		if (f instanceof Pizza) {
			takeOutPrice = 3000;
		} else if (f instanceof Burger) {
			takeOutPrice = 2000;
		} else if (f instanceof Salad) {
			takeOutPrice = 1000;
		}
		System.out.println(f.name + "는 포장비 " + takeOutPrice + "원 입니다");
//		System.out.println("피자는 포장비 3000원 입니다");
	}
	
//	public static void pizzaBoxing(Pizza p) {
//		System.out.println(p.name + "를 포장했습니다");
//		System.out.println("피자는 포장비 3000원 입니다");
//	}
//
//	public static void burgerBoxing(Burger b) {
//		System.out.println(b.name + "를 포장했습니다");
//		System.out.println("햄버거는 포장비 2000원 입니다");
//	}
//	
//	public static void saladBoxing(Salad s) {
//		System.out.println(s.name + "를 포장했습니다");
//		System.out.println("샐러드는 포장비 1000원 입니다");
//	}
	
	public static void main(String[] args) {
		
		Pizza pizza = new Pizza("피자");
		System.out.println(pizza); // pizza.toString() toString은 생략 가능
//		foodBoxing(pizza);
//		
//		Burger burger = new Burger("햄버거");
//		foodBoxing(burger);
//		
//		Salad salad = new Salad("샐러드");
//		foodBoxing(salad);
//		
//		boolean a = 0.1 + 1.1 == 1.2;
//		System.out.println(a);
	}

}
