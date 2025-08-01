package Day12_20250801;

public interface Calc {
	
	int add(int a, int b);
	public int subtract(int a, int b);
	public abstract double average(int[] a); // public abstract 생략 가능 (인터페이스 메소드 기본값)
	 
}
