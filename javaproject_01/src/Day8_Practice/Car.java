package Day8_Practice;

public class Car {
	
	private String brand;
	private String model;
	private int year;
	
	Car (String brand, String model, int year) {
		this.brand = brand;
		this.model = model;
		this.year = year;
	}
	
	void startEngine() {
		System.out.println(brand + " " + model + "의 엔진을 시동합니다.");
	}
	
	void showInfo() {
		System.out.println("차량 정보 : " + year + "년식 " + brand + " " + model);
	}
	
	public String getBrand() {
		return brand;
	}

	public String getModel() {
		return model;
	}
	
	public int getYear() {
		return year;
	}
}
