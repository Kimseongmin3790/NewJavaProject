package Day10_20250730;

public class Day2_Review_Array2 {

	public static void main(String[] args) {
		
		int arr[] = {1,3,4,5,2};
		int sumArr = ArrayFunc.sum(arr);
		System.out.println("배열 합 : " + sumArr); // 배열 안 값들의 총 합 결과 출력
		
		int num = ArrayFunc.indexValue(arr, 2);
		System.out.println(num); // 두번째 파라미터로 보낸 값(index)의 위치에 있는 값
		
		double avg = ArrayFunc.avg(arr);
		System.out.println("평균 값은 : " + avg); // 배열안의 전체 평균 값 출력
		
		boolean isFlg = ArrayFunc.searchValue(arr, 3);
		System.out.println(isFlg); 
		// 두번째 파라미터로 보낸 값이 배열 내에 존재하면 true
		// 없으면 false 리턴
	}

}
