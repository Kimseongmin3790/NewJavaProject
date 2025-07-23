package Day6_20250723;

public class BubbleSort {

	public static void main(String[] args) {
		
		int arr[] = {5,4,7,1,3};
		
//		for(int i=0; i<arr.length-1; i++) {
//			if(arr[i] > arr[i+1]) {
//				int temp = arr[i];   // temp(0) = arr[i](5)
//				arr[i] = arr[i+1]; // arr[i](5) = arr[i+1](4)
//				arr[i+1] = temp; // arr[i+1](4) = temp(5)
//			}
//		}
		
		for(int i=1; i<arr.length; i++) { // 0,1,2,3 -> 0,1,2 -> 0,1 -> 0
			for (int j=0; j<arr.length-j; j++) { // 1,2,3,4 -> 1,2,3 -> 1,2 -> 1
				if(arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
			
		}
		
		
		
		
		
	
		
	}

}
