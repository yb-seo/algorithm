import java.util.Scanner;

public class P3046 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int r1 = sc.nextInt();
		int avg = sc.nextInt();
		
		System.out.println(avg * 2 - r1);
		sc.close();
	}
}
