import java.util.Scanner;

public class P2921 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int sum = 0;	//총 개수
		
		//ex) n: 2 => 0+0, 0+1, 0+2 / 1+1, 1+2 / 2+2 => sum: 12
		
		for (int i=0; i<=n; i++) {
			for (int j=i; j<=n; j++) {
				sum += i + j;
			}
		}
		System.out.println(sum);
		sc.close();
	}
}
