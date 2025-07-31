package Day11_Practice;

public class GamingLaptop extends Laptop{
	String Gcard;

	public GamingLaptop(String brand, double kg, String Gcard) {
		super(brand, kg);
		this.Gcard = Gcard;
	}
	
	@Override
	public void printSpecs() {
		System.out.println(getBrand() + " 브랜드의 " + getKg() + "kg " + Gcard + " 게이밍 노트북");
	}
}
