import java.util.Scanner;

public class P2897 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int row = sc.nextInt();
		int col = sc.nextInt();
		char[][] map = new char[row][col];
		int[] cnt = new int[5];	
		
		//주차장 지도 입력 받기 (#: 빌딩, X: 자동차, .: 빈칸) 
		for (int i=0; i<row; i++) {
			map[i] = sc.next().toCharArray();
		}
		
		for (int i=0; i<row-1; i++) {
			for (int j=0; j<col-1; j++) {
				//2행2열씩 비교
				char[] p = new char[4];
				p[0] = map[i][j];
				p[1] = map[i][j+1];
				p[2] = map[i+1][j];
				p[3] = map[i+1][j+1];
				int car = 0;
				
				//빌딩 있을 경우 주차 불가
				if (p[0] == '#' || p[1] == '#' || p[2] == '#' || p[3] == '#') continue;
				
				//자동차 몇 대 부수면 주차할 수 있는지 개수 카운트
				for (int k=0; k<4; k++) {
					if (p[k] == 'X') car++; 
				}
				
				cnt[car]++;
			}
		}
		
		//자동차 0~4대 부수고 주차할 수 있는 공간 개수 출력
		for (int i=0; i<5; i++) {
			System.out.println(cnt[i]);
		}
		sc.close();
	}
}
