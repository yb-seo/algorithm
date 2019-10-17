import java.util.Scanner;

public class P5533 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[][] num = new int[n][3];
		
		for (int i=0; i<n; i++) {
			num[i][0] = sc.nextInt();	//플레이어 i가 1번째 게임에서 쓴 수
			num[i][1] = sc.nextInt();	//플레이어 i가 2번째 게임에서 쓴 수
			num[i][2] = sc.nextInt();	//플레이어 i가 3번째 게임에서 쓴 수
		}
		
		for (int i=0; i<n; i++) {
			int sum = 0;
			boolean[] isDup = new boolean[3];
			
			//플레이어 i가 다른 플레이어 j와 쓴 수 비교하면서 같은 수 있는지 체크
			for (int j=0; j<n; j++) {
				if (i != j) {
					if (!isDup[0] && num[i][0] == num[j][0]) {
						isDup[0] = true;
					}
					if (!isDup[1] && num[i][1] == num[j][1]) {
						isDup[1] = true;
					}
					if (!isDup[2] && num[i][2] == num[j][2]) {
						isDup[2] = true;
					}
				}
			}
			
			sum += isDup[0] ? 0 : num[i][0]; //플레이어 i의 1번째 게임에서 숫자 같은 수 있으면 0, 없으면 그 점수 얻음
			sum += isDup[1] ? 0 : num[i][1];
			sum += isDup[2] ? 0 : num[i][2];
			
			System.out.println(sum);	//플레이어 i의 1,2,3번째 게임 점수 합 출력
		}
		sc.close();
	}
}