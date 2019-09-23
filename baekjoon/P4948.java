import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
	#4948. 베르트랑 공준
	n이 주어졌을 때, n보다 크고, 2n보다 작거나 같은 소수의 개수를 구하는 프로그램을 작성하시오. 
*/
public class P4948 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = 0;
		
		while ((n = Integer.parseInt(br.readLine())) != 0) {
			int cnt = 0;
			
			for (int num=n+1; num<=n*2; num++) {
				boolean isPrime = true;
				
				if (num < 2) isPrime = false;
				
				int limit = (int)Math.sqrt(num) + 1;
				for (int j=2; j<limit; j++) {
					if (num % j == 0) {
						isPrime = false;
						break;
					}
				}
				
				if (isPrime) cnt++;
			}
			System.out.println(cnt);
		}
	}
}
