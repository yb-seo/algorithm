import java.util.Scanner;

public class P2522 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for (int i=1; i<=2*n-1; i++) {
			int blk = Math.abs(n-i);
			for (int j=0; j<blk; j++) System.out.print(" ");
			for (int j=0; j<n-blk; j++) System.out.print("*");
			System.out.println();
		}
		sc.close();
	}
}
