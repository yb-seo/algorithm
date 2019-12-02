import java.util.LinkedList;
import java.util.Scanner;

public class P9322 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		for (int i=0; i<t; i++) {
			int n = sc.nextInt();
			
			LinkedList<String> key1 = new LinkedList<>();
			int[] key2Idx = new int[n];
			String[] state = new String[n]; //평문
			
			//제1공개키 입력
			for (int j=0; j<n; j++) {
				key1.add(sc.next());
			}
			
			//제2공개키 입력받아 제1공개키에서 해당 위치 인덱스 저장
			for (int j=0; j<n; j++) {
				key2Idx[j] = key1.indexOf(sc.next());
			}
			
			//암호문 입력
			for (int j=0; j<n; j++) {
				state[key2Idx[j]] = sc.next();
			}
			
			//평문 출력
			for (int j=0; j<n; j++) {
				System.out.print(state[j] + ((j==n-1)?"":" "));
			}
			System.out.println();
		}
		sc.close();
	}
}
