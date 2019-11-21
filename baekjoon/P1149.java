import java.util.Scanner;

public class P1149 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[][] arr = new int[n][3];
		int[][] sum = new int[n][3];
		
		//n개 집의 RGB 값 입력받기
		for (int i=0; i<n; i++) {
			for (int j=0; j<3; j++) {
				arr[i][j] = sc.nextInt();
				if (i == 0) sum[i][j] = arr[i][j];
			}
		}
		
		for (int i=1; i<n; i++) {
			for (int j=0; j<3; j++) {
				if (j == 0) { //이전 이웃집이 R
					sum[i][j] = Math.min(sum[i-1][1], sum[i-1][2]) + arr[i][j]; 
				} else if (j == 1) { //이전 이웃집이 G
					sum[i][j] = Math.min(sum[i-1][0], sum[i-1][2]) + arr[i][j];
				} else { //이전 이웃집이 B
					sum[i][j] = Math.min(sum[i-1][0], sum[i-1][1]) + arr[i][j];
				}
			}
		}
		
		//합 최소값 구해서 출력
		int min = sum[n-1][0];
		for (int j=1; j<3; j++) {
			if (sum[n-1][j] < min) min = sum[n-1][j]; 
		}
		System.out.println(min);
		sc.close();
	}
}
