package Day8_Practice;

public class ElectricCar extends Car{
	
	private int batteryCapacity;
	
	ElectricCar(String brand, String name, int year, int batteryCapacity) {
		super(brand, name, year);
		this.batteryCapacity = batteryCapacity;
	}
	
	@Override
	void startEngine() {
		System.out.println(getBrand() + " " + getModel() + "의 전기 모터를 시동합니다.");
	}
	
	@Override
	void showInfo() {
		System.out.println("차량 정보 : " + getYear() + "년식 " + getBrand() + " " + getModel() + " (배터리 용량 : " + batteryCapacity + "kWh)");
	}
	
	int getBatteryCapacity() {
		return batteryCapacity;
	} 
}
