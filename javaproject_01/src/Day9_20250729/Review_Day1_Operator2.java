package Day9_20250729;

public class Review_Day1_Operator2 {

	public static void main(String[] args) {
		
//		int a = 10;
//		a++; // a = a+1
		
		int a = 10;
		int b = ++a; 
		int c = b++; 
		int d = c++; 
		a = b--;
		
		System.out.println(a); // 12
		System.out.println(b); // 11
		System.out.println(c); // 12
		System.out.println(d); // 11
		
	}

}
