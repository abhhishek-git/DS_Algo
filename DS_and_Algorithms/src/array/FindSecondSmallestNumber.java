package array;

public class FindSecondSmallestNumber {
	public static void main(String[] args) {
		int[] arr = {6,1,5,2,9,3,8,7};
		int len = arr.length;
		findSecondMax(arr, len);
	}

	private static void findSecondMax(int[] arr, int len) {
		int firstMin, secondMin;
		firstMin = secondMin = Integer.MAX_VALUE;
		
		for(int i=0; i<len; i++) {
			if(arr[i]<firstMin) {
				secondMin = firstMin;
				firstMin = arr[i];
			}
			if(arr[i]>firstMin && arr[i]<secondMin) {
				secondMin= arr[i];
			}
		}
		System.out.println("Second Minimum number is: "+secondMin);
	}
}
