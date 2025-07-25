package Day8_Practice;

public class Point3D extends Point {
	
	int z;
	
	Point3D (int x, int y, int z) {
		super(x, y);
		this.z = z;
	}
	
	void moveUp() {
		z++;
	}
	
	void moveDown () {
		z--;
	}
	
//	@Override
//	protected void move(int x, int y) {
//		super.move(x, y);
//	}   슈퍼클래스의 속성을 모두 상속받았기 때문에 따로 move 메소드를 만들어줄 필요는 없다
	
	// 오버로딩 / 오버로딩은 같은 메소드라도 매개변수(파라미터)의 값이 다르면 사용가능하게 만들어주는것
	void move (int x, int y, int z) {
		super.move(x, y);
		this.z = z;
	}
	
	@Override
	public String toString() {
		return "(" + getX() + "," + getY() + "," + z + ") 의 점"; 
	}
	
}
//(1,2,3) 의 점입니다.
//(1,2,4) 의 점입니다.
//(10,10,3) 의 점입니다.
//(100,200,300) 의 점입니다.