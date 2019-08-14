package array;

import java.util.Arrays;


//O(n^2)
public class PythagoraeanTriplet_UsingSorting {
	public static void main(String[] args) {
		int[] arr = {2,8,4,7,5,9,3};
		int len = arr.length;
		System.out.println(hasPythagoreanTriplet(arr, len));
	}

	private static boolean hasPythagoreanTriplet(int[] arr, int n) {
		//this step takes O(n)
		for(int i=0; i<n; i++) {
			arr[i]= arr[i]* arr[i];
		}
		
		//this step takes O(nlogn)
		Arrays.sort(arr);
		
		//this step takes O(n^2): n for for loop and n for while loop
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
