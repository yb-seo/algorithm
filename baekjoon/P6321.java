import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
	#6321. IBM 빼기 1
	입력받은 문자열의 각 글자를 다음 알파벳 글자로 바꿔 출력
*/
public class P6321 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		for (int i=1; i<=n; i++) {
			String str = br.readLine();
			int len = str.length();
			
			System.out.println("String #" + i);
			
			for (int j=0; j<len; j++) {
				char ch = str.charAt(j);
				char next = (ch == 'Z') ? 'A' : (char)(ch + 1);
				System.out.print(next);
			}
			System.out.println("\n");
		}
		
	}
}
