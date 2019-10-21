import java.util.Scanner;

public class P9550 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();	//테스트 케이스
		
		for (int i=0; i<t; i++) {
			int n = sc.nextInt();	//사탕 종류 수
			int k = sc.nextInt();	//사탕 먹을 때 만족하는 최소 개수
			int sum = 0;
			
			for (int j=0; j<n; j++) {
				int candy = sc.nextInt();	//각 종류 별 사탕 개수
				sum += candy / k;
			}
			System.out.println(sum);
		}
		sc.close();
	}
}
