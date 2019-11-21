import java.util.Scanner;

public class P2748 {

	public static long[] f;
	public static long[] ff;
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();  //입력조건 : n<=90

		//System.out.println(fib(n));
		
		//f = new long[n+1];
		//System.out.println(fib2(n));
		
		ff = new long[n+1];
		System.out.println(fib3(n));
		
		sc.close();
	}
	
	//1. 재귀
	public static long fib(int n) {
		if (n == 1 || n == 2) return 1;
		return fib(n-1) + fib(n-2);
	}
	
	//2. memorization - caching
	public static long fib2(int n) {
		if (n == 1 || n == 2) return 1;
		
		if (f[n] == 0) f[n] = fib(n-1) + fib(n-2);
		return f[n];
	}
	
	//3. dynamic - bottom-up
	public static long fib3(int n) {
		ff[0] = 0; ff[1] = 1;
		
		if (n == 0 || n == 1) return ff[n];
		
		for (int i=2; i<=n; i++) {
			ff[i] = ff[i-1] + ff[i-2];
		}
		return ff[n];
	}
}
