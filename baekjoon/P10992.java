import java.util.Scanner;

public class P10992 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for (int i=1; i<=n; i++) {
			if (i == n) {
				for (int j=0; j<2*n-1; j++) System.out.print("*");
			} else {
				for (int j=0; j<n-i; j++) System.out.print(" ");
				for (int j=0; j<2*i-1; j++) System.out.print((j==0 || j==2*i-2) ? "*" : " ");
			}
			
			System.out.println();
		}
		sc.close();
	}
}
