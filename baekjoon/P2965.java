import java.util.Scanner;

public class P2965 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//0 < a < b < c < 100
		int a = sc.nextInt();	//캥거루 A 위치
		int b = sc.nextInt();	//캥거루 B 위치
		int c = sc.nextInt();	//캥거루 C 위치
		
		int max = Math.max(b-a, c-b);
		
		System.out.println(max - 1);
		
		sc.close();
	}
}
