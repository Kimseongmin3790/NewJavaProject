package Day7_20250724;

public class ReviewMain1 {

	public static void main(String[] args) {
		Fruit_Review apple = new Fruit_Review("사과", 1000);
//		apple.price = 99999; private이라서 접근 불가능
		
//		System.out.println(apple.price);
		System.out.println(apple.getPrice());
		
		
		//
		apple.setPrice(20000);
		System.out.println(apple.getPrice());
	}
}
