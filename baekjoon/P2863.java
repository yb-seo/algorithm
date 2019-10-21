import java.util.Scanner;

public class P2863 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		
		double max = (double)a/c + (double)b/d;
		int idx = 0;
		
		double rot1 = (double)c/d + (double)a/b;
		if (max < rot1) {
			max = rot1;
			idx = 1;
		}
		
		double rot2 = (double)d/b + (double)c/a;
		if (max < rot2) {
			max = rot2;
			idx = 2;
		}
				
		double rot3 = (double)b/a + (double)d/c;
		if (max < rot3) {
			max = rot3;
			idx = 3;
		}
		
		System.out.println(idx);
		sc.close();
	}
}
