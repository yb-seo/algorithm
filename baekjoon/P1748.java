import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
	#1748. 수 이어 쓰기 1
	1부터 N까지의 수를 이어서 썼을 때 만들어진 수의 자릿수를 구하는 프로그램
*/
public class P1748 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int cnt = 0;	// 자릿수
		int dep = 1;
		
		while (true) {
			int start = (int)Math.pow(10, dep-1);
			int end = (int)Math.pow(10, dep);
			
			if (n >= end) {
				cnt += (end-start) * dep;
				dep++;
			} else {
				cnt += (n - start + 1) * dep;
				break;
			}
		}
		
		System.out.println(cnt);
		
//----- 방법1 => 메모리 초과
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		StringBuilder sb = new StringBuilder();
//		
//		int n = Integer.parseInt(br.readLine());
//		
//		for (int i=1; i<=n; i++) {
//			sb.append(i);
//		}
//		
//		System.out.println(sb.length());
		
//----- 방법2 => 메모리 초과		
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		int cnt = 0;
//		
//		int n = Integer.parseInt(br.readLine());
//		
//		for (int i=1; i<=n; i++) {
//			cnt += (i+"").length();
//		}
//		
//		System.out.println(cnt);

	}
}