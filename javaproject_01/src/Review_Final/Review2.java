package Review_Final;

public class Review2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		% => 나머지연산(modulo) 많이쓰임
//		and, or 
		int a = 10;
		int b = 5;
		String str = "홍길동"; // 리터럴 메모리에 저장되어 str == "홍길동"은 true로 나옴
		String str2 = new String("홍길동"); // str2 == "홍길동"은 false
		
//		and(&&)는 둘다 true일때만 true, 나머지는 false
		System.out.println(a>b && str == "홍길동");
//		or(||)는 둘 중 하나라도 true면 true
		System.out.println(a<b || str == "홍길동");
//		&&, || => 두개씩 쓰는 이유는 앞의 계산으로 결과를 충족하면 뒤의 계산은 실행하지 않음 => 연산속도 증가
		
		System.out.println(a/b);
		
	}

}
