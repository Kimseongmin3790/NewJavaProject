package Day11_20250731;

import Day10_20250730.ArrayFunc;

public class FinalVar {

	public static void main(String[] args) {
		
		int arr[] = ArrayFunc.randomArr(10, 1, 30);
		int num = ArrayFunc.arrLength(arr, ArrayFunc.EVEN);
		int num2 = ArrayFunc.arrLength(arr, ArrayFunc.ODD);
		
	}

}
