package Day12_Practice;

public class TV implements PowerControl{
	
	String name;
	public TV(String name) {
		this.name = name;
	}
	void turnOn() {
//		System.out.print("TV ");
//		PowerControl.turnOn();
		System.out.println(name + " 전원 켜짐");
	}
	
	void turnOff() {
		// TODO Auto-generated method stub
//		System.out.print("TV ");
//		PowerControl.turnOff();
		System.out.println(name + " 전원 꺼짐");
	}
	
}
