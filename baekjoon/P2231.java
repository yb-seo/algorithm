import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
	#2231. 분해합
	모든 경우를 시도하여 N의 생성자를 구하는 문제 (256 = 245+2+4+5 => 생성자: 245)
*/
public class P2231 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int res = 0;	// 생성자
		
		// 1<=x<=n 까지 모든 경우의 수 구하기
		for (int x=1; x<=n; x++) {
			int tmp = x;
			int sum = x;
			
			// 각 자리 수 값 더하기
			while (true) {
				sum += tmp % 10;
				if (tmp / 10 == 0) break;
				else tmp /= 10;
			}
			
			// sum = x + x의 각 자리 수 합 = 입력한 값과 같으면 x는 생성자
			if (sum == n) {		
				res = x;
				break;
			}
		}
		
		// 생성자 출력 (생성자가 없을 경우 선언값인 0 출력됨)
		System.out.println(res);
	}
}