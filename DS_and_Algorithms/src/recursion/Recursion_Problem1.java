package recursion;

public class Recursion_Problem1 {
	public static void main(String[] args) {
		fun(3);
	}

	private static void fun(int n) {
		if(n<1) {
			return;
		}else {
			System.out.println(n);
			fun(n-1);
			System.out.println(n);
		}
		
	}
}
