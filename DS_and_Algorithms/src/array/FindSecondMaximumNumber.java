package array;

public class FindSecondMaximumNumber {
	public static void main(String[] args) {
		int[] arr = {6,1,5,2,9,3,8,7};
		int len = arr.length;
		findSecondMax(arr, len);
	}

	private static void findSecondMax(int[] arr, int len) {
		int firstMax, secondMax;
		firstMax = secondMax = Integer.MIN_VALUE;
		
		for(int i=0; i<len; i++) {
			if(arr[i]>firstMax) {
				secondMax = firstMax;
				firstMax = arr[i];
			}
			if(arr[i]<firstMax && arr[i]>secondMax) {
				secondMax= arr[i];
			}
		}
		System.out.println("Second Maximum number is: "+secondMax);
	}
}
