package recursion;

public class Recursion_PrintNto1 {
	public static void main(String[] args) {
		int n =5;
		printNToOne(n);
	}
	
	private static void printNToOne(int n) {
		
		if(n==0) {
			return;
		}
		System.out.println(n);
		printNToOne(n-1);
	}
}
