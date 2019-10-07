import java.util.Scanner;

public class P1138 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();			//사람 수
		int[] line = new int[n];		//줄 선 순서
		
		//키 작은 순서대로(1~>n) 줄 서기
		for (int i=1; i<=n; i++) {
			int left = sc.nextInt();	//i보다 키 큰 사람이 왼쪽에 몇 명 있는지
			
			int idx = -1;
			for (int j=0; j<=left; j++) {
				idx++;
				if (line[idx] != 0) {
					j--;
				} 				
			}
			line[idx] = i;
		}
		
		for (int num : line) System.out.print(num + " ");
		
		sc.close();
	}
}
