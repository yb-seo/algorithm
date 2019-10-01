import java.util.Scanner;

/*
	#9625. BABBA
	버튼 누르면 A->B, B->BA로 바뀔 때, 버튼을 K번 눌렀을 때 A,B의 개수
*/
public class P9625 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int cntA = 1, cntB = 0;
		
		for (int i=0; i<n; i++) {
			int tmpA = cntB;
			int tmpB = cntA + cntB;
			
			cntA = tmpA;
			cntB = tmpB;
		}
		
		System.out.println(cntA + " " + cntB);
		sc.close();
	}
}
