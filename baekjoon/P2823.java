import java.util.Scanner;

public class P2823 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int r = sc.nextInt();
		int c = sc.nextInt();
		char[][] map = new char[r][c];
		boolean isBlocked = false;
		int road = 0; //도로 개수 (0이면 전부 빌딩)
		
		for (int i=0; i<r; i++) {
			map[i] = sc.next().toCharArray();
		}
		
		for (int i=0; i<r; i++) {
			for (int j=0; j<c; j++) {
				int cnt = 0; //갈 수 있는 방향 수
				
				if (map[i][j] == 'X') continue;
				
				if (j != 0 && map[i][j-1] == '.') cnt++;	//왼쪽
				if (j != c-1 && map[i][j+1] == '.') cnt++;	//오른쪽
				if (i != 0 && map[i-1][j] == '.') cnt++;	//위
				if (i != r-1 && map[i+1][j] == '.') cnt++;	//아래
				
				//막힘
				if (cnt < 2) {
					isBlocked = true;
					break;
				}
				
				road++;
			}
			if (isBlocked) break;
		}
		
		System.out.println((isBlocked || road == 0) ? 1 : 0);
		sc.close();
	}
}
