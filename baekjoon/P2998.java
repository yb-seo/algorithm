import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P2998 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();	//입력받을 2진수
		String res = "";			//8진수로 변환할 결과값
		int n = str.length();
		int ex = 0;
		
		//2진수 뒤에서부터 3자리씩 끊어서 값 계산
		for (int i=0; i<n; i++) {
			int num = str.charAt(n-i-1) - '0';
			ex += (int)Math.pow(2,(i%3)) * num;

			if (i%3 == 2 || i == n-1) {
				res = ex + res;
				ex = 0;
			}
		}
		
		System.out.println(res);
	}
}
