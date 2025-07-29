package Day9_20250729;

public class Review_Day1_LoopWhile {

	public static void main(String[] args) {
		
		// for(int i=1; i<=10; i++)
		
		int i = 1;
		while(i<=5) {
			int j = 1;
			while(j<=5) {
				System.out.print("(" + i + "," + j + ")");
				j++;
			}
		System.out.println();
		i++;
		}
		// while = 반복문. 즉, 중첩 가능 while 안에 while이 가능하다
		
	}

}
