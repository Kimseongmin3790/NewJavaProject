package Day6_20250723;

public class Car_Test {
	
	private String name;
	private String color;
	private int speed;
	
	Car_Test () {
		this("기본차", "하얀색", 0); // this() 다른 생성자 호출.
//		this.name = "기본차";
//		this.color = "하얀색";
//		this.speed = 0;
	}
	
	Car_Test (String name, String color, int speed) {
		this.name = name;
		this.color = color;
		this.speed = speed;
	}
	
	void carInfo () {
		System.out.println("자동차의 이름은 " + name + ", 색상은 " + color + " 입니다.");
	}
	
	void setInfo (String name, String color, int speed) {
//		this("기본차", "하얀색", 0);  / 생성자는 한번만 호출되기에 불가능
		this.name = name;
		this.color = color;
		this.speed = speed;
	}
	
	void speedUp (int speed) {
		this.speed += speed;
		if (this.speed > 200 || speed > 200) {
			System.out.println("200 초과의 속도는 불가합니다. 200으로 변경됩니다.");
			this.speed = 200;
		}
	}
	
	void speedDown (int speed) {
		this.speed -= speed;
		if (this.speed - speed < 0) {
			System.out.println("0 미만의 속도는 불가합니다. 0으로 변경됩니다.");
			this.speed = 0;
		}
	}
	
	int getSpeed() {
		return speed;
	}
}
