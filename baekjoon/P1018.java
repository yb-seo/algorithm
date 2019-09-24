import java.util.Scanner;

/*
	#1018. 체스판 다시 칠하기
	체스판을 만드는 모든 경우를 시도하여 최적의 방법을 찾는 문제
*/
public class P1018 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		char[][] board = new char[n][m];
		int min = 64; // 칠해야 하는 최소 횟수
		
		// n*m 체스판 색깔 입력받기
		for (int i=0; i<n; i++) {
			String line = sc.next();
			for (int j=0; j<m; j++) {
				board[i][j] = line.charAt(j); 
			}
		}
		
		// 8*8 정사각형 만들 수 있는 모든 경우의 수
		int x = 0, y = 0; //세로축 x, 가로축 y
		while (true) {
			// cntB : 검정색(B)으로 시작하는 경우 새로 칠해야 하는 갯수
			// cntW : 흰색(W)으로 시작하는 경우 새로 칠해야 하는 갯수
			int cntB = 0, cntW = 0;	
			for (int i=x; i<x+8; i++) {
				for (int j=y; j<y+8; j++) {
					if ((i%2==0 && j%2==0) || (i%2==1 && j%2==1)) {
						//B로 시작하는 경우
						if (board[i][j] != 'B') cntB++;
						//W로 시작하는 경우
						if (board[i][j] != 'W') cntW++;
					} else {
						//B로 시작하는 경우
						if (board[i][j] != 'W') cntB++;
						//W로 시작하는 경우
						if (board[i][j] != 'B') cntW++;
					}
				}
			}
			
			//System.out.println("("+x+","+y+")");
			//System.out.println("cntB: "+cntB+", cntW: "+cntW);
			
			if (cntB < min) min = cntB;
			if (cntW < min) min = cntW;
			
			// 정사각형을 가로축으로 한 칸 이동하고 범위 넘어가면 다음 세로축으로 이동
			y++;
			if (y + 8 > m) {
				x++;
				y = 0;
			}
			if (x + 8 > n) break;
		}
		
		System.out.println(min);
		sc.close();
	}
}
