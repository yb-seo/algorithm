import java.util.Scanner;

public class P2903 {

	public static void main(String[] args) {
		
		Scanner	sc = new Scanner(System.in);
		
		int n = sc.nextInt();	//n단계 거친 횟수
		
		//(2^n + 1)^2
		System.out.println((int)Math.pow(Math.pow(2, n)+1, 2));
		sc.close();
	}
}