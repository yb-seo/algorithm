import java.util.Scanner;

public class P10708 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();	//친구 수
		int m = sc.nextInt(); 	//게임 횟수
		
		int[] target = new int[m];
		int[] score = new int[n];
		
		for (int i=0; i<m; i++) {
			target[i] = sc.nextInt();
		}
		
		for (int i=0; i<m; i++) {
			int wrong = 0;
			for (int j=0; j<n; j++) {
				int guess = sc.nextInt();
				
				if (guess == target[i]) {
					score[j]++;
				} else {
					wrong++;
				}
			}
			score[target[i]-1] += wrong;
		}
		
		for (int i=0; i<n; i++) {
			System.out.println(score[i]);
		}
		sc.close();
	}
}
