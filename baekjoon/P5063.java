import java.util.Scanner;

public class P5063 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for (int i=0; i<n; i++) {
			int r = sc.nextInt();	//광고 안 했을 때 수익
			int e = sc.nextInt();	//광고 했을 때 수익
			int c = sc.nextInt();	//광고 비용
			
			int ec = e - c;	// 광고 했을 때 광고비 뺀 순수익
			
			if (r == ec) {
				System.out.println("does not matter");
			} else if (r < ec) {
				System.out.println("advertise");
			} else {
				System.out.println("do not advertise");
			}
		}
		
		sc.close();
	}
}
