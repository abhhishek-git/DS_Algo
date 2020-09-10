package array;

//https://www.geeksforgeeks.org/maximum-difference-between-two-elements/

public class MaxDiffBetweenTwoElements {
	public static void main(String[] args) {
		int[] arr = {500, 1, 20, 90, 10, 110, 65};
		int size = arr.length;
		System.out.println("Mazimum diff is: "+ maxDiff(arr, size));
	}

	private static int maxDiff(int[] arr, int size) {
		int max_diff = arr[1]- arr[0];
		int min_element = arr[0];
		
		for(int i=1; i<size;i++) {
			if(arr[i] - min_element > max_diff)
				max_diff = arr[i] - min_element;
			
			if(arr[i] < min_element)
				min_element = arr[i];
		}
		return max_diff;
	}
}
