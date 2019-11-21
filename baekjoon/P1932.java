import java.util.Scanner;

public class P1932 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] arr = new int[n][n];
		int[][] sum = new int[n][n];
		
		//입력받기
		for (int i=0; i<n; i++) {
			for (int j=0; j<=i; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		sum[0][0] = arr[0][0];
		
		if (n == 1) System.out.println(sum[0][0]);
		else {
			int max = 0;
			
			for (int i=1; i<n; i++) {
				for (int j=0; j<=i; j++) {
					if (j == 0) sum[i][j] = sum[i-1][j] + arr[i][j];
					else if (j == i) sum[i][j] = sum[i-1][j-1] + arr[i][j];
					else {
						sum[i][j] = Math.max(sum[i-1][j-1], sum[i-1][j]) + arr[i][j];
					}
				}
			}
			
			//맨 마지막 줄 합 중 최대값 찾기
			for (int j=0; j<n; j++) {
				if (sum[n-1][j] > max) max = sum[n-1][j];
			}
			
			System.out.println(max);
		}
		
		sc.close();
	}
}
