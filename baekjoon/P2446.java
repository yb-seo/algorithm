import java.util.Scanner;

public class P2446 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for (int i=1; i<=2*n-1; i++) {
			int blk = (n-1) - Math.abs(n-i);
			int star = (2*n-1) - 2*blk;
			
			for (int j=0; j<blk; j++) System.out.print(" ");
			for (int j=0; j<star; j++) System.out.print("*");
			System.out.println();
		}
		sc.close();
	}
}
