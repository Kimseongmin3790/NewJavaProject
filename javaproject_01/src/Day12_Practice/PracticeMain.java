package Day12_Practice;

import java.util.Arrays;

import Day10_20250730.ArrayFunc;

public class PracticeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog dog = new Dog();
		dog.makeSound();
		
		Cat cat = new Cat();
		cat.makeSound();
		
		TV tv = new TV("TV");
		tv.turnOn();
		
		Computer computer = new Computer();
		computer.turnOff();
		
		int [] array1 = {1,5,7,9};
        int [] array2 = {3,6,-1,100,77};
        int [] array3 = ArrayFunc.concat(array1, array2);
        System.out.println(Arrays.toString(array3));
	}

}
