package Day10_20250730;

public class Day2_Review_MethodMain {

	public static void main(String[] args) {
		
		String qe = Day2_Review_Methodex.testA();
		System.out.println(qe);
		
		Day2_Review_Methodex.testB(); // 리턴이 없는 메소드이므로 저장 불가
		
		int a = 10;
		int b = Day2_Review_Methodex.testC(a);
		
		double c = Day2_Review_Methodex.testD(a, 1.5);
		System.out.println(c);
		
		int testArr[] = {1,2,3,4,5};
		int d = Day2_Review_Methodex.testE(testArr);
	}

}
