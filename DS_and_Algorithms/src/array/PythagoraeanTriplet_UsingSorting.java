package array;

import java.util.Arrays;

public class PythagoraeanTriplet_UsingSorting {
	public static void main(String[] args) {
		int[] arr = {2,8,4,7,5,9,3};
		int len = arr.length;
		System.out.println(hasPythagoreanTriplet(arr, len));
	}

	private static boolean hasPythagoreanTriplet(int[] arr, int n) {
		for(int i=0; i<n; i++) {
			arr[i]= arr[i]* arr[i];
		}
		
		Arrays.sort(arr);
		
		for(int i=n-1; i>2; i--) {
			int l=0; 
			int r= i-1;
			
			while(l<r) {
				if(arr[l]+arr[r] == arr[i])
					return true;
				if(arr[l]+arr[r] > arr[i])
					r--;
				else
					l++;
			}
		}
		return false;
	}
}
