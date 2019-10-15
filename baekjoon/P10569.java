import java.util.Scanner;

public class P10569 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for (int i=0; i<n; i++) {
			int v = sc.nextInt();	//꼭지점 개수
			int e = sc.nextInt();	//모서리 개수
			
			System.out.println(2 + e - v);	//면의 수 출력
		}
		sc.close();
	}
}
