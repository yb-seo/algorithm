import java.util.Scanner;

public class P2822 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = 8;
		int[] score = new int[N]; 
		int sum = 0;
		String res = "";
		
		for (int i=0; i<N; i++) {
			score[i] = sc.nextInt();
		}
		
		for (int i=0; i<N; i++) {
			int cnt = 0;
			for (int j=0; j<N; j++) {
				if (i == j) continue;
				if (score[i] < score[j]) {
					cnt++;
				}
			}
			if (cnt >= 0 && cnt <= 4) {
				sum += score[i];
				res += (i+1) + " ";
			}
		}
		
		System.out.println(sum);
		System.out.println(res);
		sc.close();
	}
}
