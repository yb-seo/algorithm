import java.util.Scanner;

public class P8979 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();	//국가 수
		int k = sc.nextInt();	//등수 알고 싶은 국가 번호
		int[][] info = new int[n][4];
		int cnt = 0; //k 국가보다 등수 높은 나라 수
		int kidx = 0;
		
		for (int i=0; i<n; i++) {
			for (int j=0; j<4; j++) {
				info[i][j] = sc.nextInt();
				if (j == 0 && info[i][j] == k) kidx = i;
			}
		}
		
		for (int i=0; i<n; i++) {
			if (i == kidx) continue;	//자신 국가 제외
			if ((info[i][1] > info[kidx][1]) || ((info[i][1] == info[kidx][1]) && (info[i][2] > info[kidx][2])) || ((info[i][1] == info[kidx][1]) && (info[i][2] == info[kidx][2]) && (info[i][3] > info[kidx][3]))) {
				cnt++;
			}
		}
		
		System.out.println(cnt+1);
		sc.close();
	}
}
