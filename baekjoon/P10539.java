import java.util.Scanner;

public class P10539 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int sum = 0;
		
		for (int i=1; i<=n; i++) {
			int a = sc.nextInt();
			int b = a * i - sum;
			System.out.print(b + " ");
			sum += b;
		}
		sc.close();
	}
}
