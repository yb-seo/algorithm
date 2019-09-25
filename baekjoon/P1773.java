import java.util.Scanner;

/*
	#1773. 폭죽쇼
	N명의 학생들이 각 주기별로 폭죽을 터뜨릴 때, 폭죽쇼 동안 폭죽을 볼 수 있는 시간을 구하는 프로그램 
*/
public class P1773 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();					// 학생 수
		int end = sc.nextInt();					// 폭죽 끝나는 시간
		boolean[] isTime = new boolean[end];	// 각 시간별 폭죽 볼 수 있는지 여부
		int cnt = 0;							// 폭죽 볼 수 있는 시간
		
		for (int i=0; i<n; i++) {
			int cycle = sc.nextInt();			// 학생이 폭죽 쏘는 주기
			int idx = 1;
			int time; 
			while ((time = cycle * idx) <= end) {	// 폭죽 끝날 때까지 주기별로 폭죽 쏘는 시간대에 값을 true로
				isTime[time-1] = true;
				idx++;
			}
		}
		
		// 시간별로 폭죽 볼 수 있는지 확인하여 볼 수 있으면 cnt 증가
		for (int i=0; i<end; i++) {
			if (isTime[i]) cnt++;
		}
		
		// 폭죽 볼 수 있는 시간 출력
		System.out.println(cnt);
		sc.close();
	}
}