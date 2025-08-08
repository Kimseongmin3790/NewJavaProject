package Review_Final;

public class Review1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int , double , char , boolean => 일반 데이터 타입
//		String => 클래스
		int a = 10; // => 일반 데이터 타입 변수, 메소드 활용 불가능
		String b = new String("Hello");
		System.out.println(b.length());
		
		Integer c = 30;
		c.equals(null); // 메소드 활용 가능
		
		String strNumber = "10";
		int number = Integer.parseInt(strNumber); // 문자열을 정수로 바꾸는 메소드
		
	}

}
