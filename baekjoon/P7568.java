import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
	#7568. 덩치
	모든 사람을 비교하여 덩치 등수를 구하는 문제
*/
public class P7568 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int n = Integer.parseInt(br.readLine());	//사람 수
		int[][] info = new int[n][3];				//info[n][0]: 몸무게, info[n][1]: 키, info[n][2]: 자신보다 덩치 큰 사람 수
		
		// 사람 n명의 몸무게, 키 입력받기 
		for (int i=0; i<n; i++) {
			st = new StringTokenizer(br.readLine());
			info[i][0] = Integer.parseInt(st.nextToken());
			info[i][1] = Integer.parseInt(st.nextToken());
		}
		
		// 각 사람별로 자신보다 덩치 더 큰 사람 수 구하기
		for (int i=0; i<n; i++) {
			int cnt = 0;
			for (int j=0; j<n; j++) {
				if (i == j) continue;
				else {
					if (info[i][0] < info[j][0] && info[i][1] < info[j][1]) cnt++;
				}
			}
			info[i][2] = cnt;
		}
		
		// 등수 출력 : 등수 = 자신보다 덩치 큰 사람 수 + 1
		for (int i=0; i<n; i++) {
			System.out.print((info[i][2]+1) + " ");
		}
	}
}