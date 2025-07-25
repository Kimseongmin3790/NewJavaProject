package Day8_Practice;

public class PositivePoint extends Point{
	
	PositivePoint () {
		super(0, 0);
	}
	
	PositivePoint (int x, int y) {
		super(x, y);
		if(x < 0 || y < 0) { // x가 0보다 작거나 y가 0보다 작을시에
			super.move(0, 0); // x,y값에 x,y값을 대입해라
		}
	}
	
	public void move (int x, int y) {
		if (x >= 0 && y >= 0) { // x가 0이상이고 y가 0이상이면 / x와y가 0이상이면
			super.move(x,y);   // x,y값에 x,y값을 대입해라
		}
	}
	
	@Override // 오버라이드는 메소드로 return되는 내용을 재정의한다
	public String toString() { // 
		return "(" + getX() + "," + getY() + ") 의 점";
	}
}
