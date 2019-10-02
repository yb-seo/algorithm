
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
	#10872. 팩토리얼
	N이 주어질 때 N! 값 출력
*/
public class P10872 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int res = 1;
		
		// n * (n-1) * (n-2) * ... * 1
		for (int i=n; i>0; i--) {
			res *= i;
		}
		
		System.out.println(res);
	}
}
