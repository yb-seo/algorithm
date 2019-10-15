import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P1964 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		long sum = (n - 1) * 5 + 5;	//n이 1000000일 때 int 범위 벗어나므로 long 사용
		
		for (int i=n-2; i>=0; i--) {
			sum += (i*3 + 2);
		}
		
		System.out.println(sum % 45678);
	}
}
