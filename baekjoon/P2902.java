import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P2902 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine(), "-");
		
		while (st.hasMoreTokens()) {
			String token = st.nextToken();
			System.out.print(token.charAt(0));	//성의 첫 글자만 출력
		}
	}
}
