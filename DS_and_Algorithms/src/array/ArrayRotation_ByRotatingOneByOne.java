package array;

public class ArrayRotation_ByRotatingOneByOne {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7};
		int d = 4;
		rotateArray(arr, d);
		displayArray(arr);
	}

	private static void displayArray(int[] arr) {
		// TODO Auto-generated method stub
		int len = arr.length;
		for(int i=0; i<len;i++) {
			System.out.print(arr[i]+ " ");
		}
	}

	private static void rotateArray(int[] arr, int d) {
		for(int i=0; i<d; i++) {
			rotateArrayOneByOne(arr[i], arr);
		}
	}

	private static void rotateArrayOneByOne(int first, int[] arr) {
		int temp = arr[0];
		int len = arr.length;
		int i=0;
		for(i=0; i< len-1; i++) {
			arr[i] = arr[i+1];
		}
		arr[i]= temp;
	}
}
