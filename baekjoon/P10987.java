import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P10987 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int cnt = 0;
		int len = str.length();

		for (int i=0; i<len; i++) {
			char ch = str.charAt(i);
			if (ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') cnt++;
		}
		
		System.out.println(cnt);
	}
}
