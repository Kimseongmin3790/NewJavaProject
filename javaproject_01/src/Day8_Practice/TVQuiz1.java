package Day8_Practice;

public class TVQuiz1 {
	
	int size;
	String manufacturer;

	public TVQuiz1() {
		  this(32 ,"LG");
		  System.out.println(size+"인치 "+manufacturer);
	   }

	public TVQuiz1(String manufacturer) {
		  this(32, manufacturer);
		  System.out.println(size+"인치 "+manufacturer);
	   }

	public TVQuiz1(int size, String manufacturer) {
		  this.size = size;
		  this.manufacturer = manufacturer;
		  System.out.println(size+"인치 "+manufacturer);
	   }
	
}
// new TV(); 실행 결과 : 32인치 LG
// new TV("삼성"); 실행 결과 : 32인치 삼성
// 65인치 삼성 TV객체 생성 코드 : TVQuiz1 tv = new TVQuiz1(65, "삼성");
// this()를 이용하는 장점 : 중복으로 작성되는 코드 방지 가능