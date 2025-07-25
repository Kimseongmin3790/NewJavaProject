package Day8_20250725;

public class Dog_Review extends Animal_Review{
	
	String dogBreed; // 견종
	
	Dog_Review(String name, int age, String dogBreed) {
		super(name, age);
		this.dogBreed = dogBreed;
	}
	
	@Override
	void speak() {
		System.out.println(dogBreed + "(이)가 멍멍 짖는다");
	}
	
	void walk () { // 산책
		System.out.println(dogBreed + "(이)가 산책한다.");
	}
	
}
