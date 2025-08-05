package Day14_20250805;

public class DeBugEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		int b = 30;
		a = a+b;
		b++;
		int c = a*b;
		if(a>5) {
			System.out.println("실행!");
		}
		for(int i=1; i<10; i++) {
			System.out.println(i);
		}
	}

}
