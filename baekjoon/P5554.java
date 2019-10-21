import java.util.Scanner;

public class P5554 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int ab = sc.nextInt();
		int bc = sc.nextInt();
		int cd = sc.nextInt();
		int da = sc.nextInt();
		
		int total = ab + bc + cd + da;
		
		System.out.println(total/60);
		System.out.println(total%60);
		sc.close();
	}
}
