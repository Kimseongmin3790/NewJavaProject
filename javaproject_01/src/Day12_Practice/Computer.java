package Day12_Practice;

public class Computer implements PowerControl{

	void turnOn() {
		System.out.print("Computer ");
		PowerControl.turnOn();
	}
	
	void turnOff() {
		System.out.print("Computer ");
		PowerControl.turnOff();
	}
}
