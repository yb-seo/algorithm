import java.util.Scanner;

public class P2010 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();	//멀티탭 개수
		int totalPlug = 1;		//총 플러그 수
		
		for (int i=0; i<n; i++) {
			int plug = sc.nextInt();	//각 멀티탭의 플러그 수
			totalPlug += plug;
		}
		
		System.out.println(totalPlug - n);	//컴퓨터 플러그 연결 가능 개수(총 플러그 수에서 멀티탭 꼽을 플러그 수 뺀 값)
		sc.close();
	}
}
