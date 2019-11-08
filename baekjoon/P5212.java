import java.util.Scanner;

public class P5212 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		int c = sc.nextInt();
		char[][] map = new char[r][c];
		int minr = -1, maxr = -1, minc = -1, maxc = -1;
		
		for (int i=0; i<r; i++) {
			map[i] = sc.next().toCharArray();
		}
		
		for (int i=0; i<r; i++) {
			for (int j=0; j<c; j++) {
				if (map[i][j] == '.') continue;
				
				int cnt = 0; //사면 중에 바다 접하는 개수
				
				//왼쪽
				if (j == 0) cnt++;
				else if (map[i][j-1] == '.') cnt++;
				//위
				if (i == 0) cnt++;
				else if (map[i-1][j] == '.') cnt++;
				//오린쪽
				if (j == c-1) cnt++;
				else if (map[i][j+1] == '.') cnt++;
				//아래
				if (i == r-1) cnt++;
				else if (map[i+1][j] == '.') cnt++;
				
				if (cnt >= 3) map[i][j] = '#'; //50년 뒤 사라질 부분
				else {
					//최소 직사각형 크기
					if (minr == -1 || i < minr) minr = i;
					if (maxr == -1 || i > maxr) maxr = i;
					if (minc == -1 || j < minc) minc = j;
					if (maxc == -1 || j > maxc) maxc = j;
				}
			}
		}
		
		
		for (int i=minr; i<=maxr; i++) {
			for (int j=minc; j<=maxc; j++) {
				if (map[i][j] == '#') System.out.print('.');
				else System.out.print(map[i][j]);
			}
			System.out.println();
		}
		
//		for (int i=0; i<r; i++) {
//			for (int j=0; j<c; j++) {
//				if (map[i][j] == '#') System.out.print('.');
//				else System.out.print(map[i][j]);
//			}
//			System.out.println();
//		}
		
		sc.close();
	}
}