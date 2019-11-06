import java.util.Scanner;

public class P10409 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();	//일의 개수
		int t = sc.nextInt();	//최대 수행 시간
		int[] time = new int[n];
		int sum = 0;
		int cnt = 0;
		
		for (int i=0; i<n; i++) {
			time[i] = sc.nextInt();
		}
		
		for (int i=0; i<n; i++) {
			if (sum + time[i] <= t) {
				sum += time[i];
				cnt++;
			} else {
				break;
			}
		}
		System.out.println(cnt);
		sc.close();
	}
}
