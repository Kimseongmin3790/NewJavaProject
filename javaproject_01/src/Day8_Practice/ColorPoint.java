package Day8_Practice;

public class ColorPoint extends Point {

	String color;
	
	public ColorPoint () {
		super(0, 0);
		this.color = "Black";
//		this(0, 0, "Black");
	}
	
	public ColorPoint(int x, int y, String color) {
		super(x, y);
		this.color = color;
	}
	
	public ColorPoint(int x, int y) {
		this(x, y, "Black");
	}
	
	void setXY(int x, int y) {
		super.move(x, y);
	}

	void setColor(String color) {
		this.color = color;
	}
	
	@Override
	public String toString() {
		return color + "색의 " + "(" + getX() + "," + getY() + ")의 점"; 
	}
}
