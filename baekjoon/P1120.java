import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
	#1120. 문자열
*/
public class P1120 {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		String str1 = st.nextToken();
		String str2 = st.nextToken();
		int len1 = str1.length();
		int len2 = str2.length();
		int len = len2 - len1;
		int min = 0;
		
		for (int i=0; i<=len; i++) {
			int cnt = 0;	//같은 위치에 같은 문자 개수
			String sub = str2.substring(i, i+len1);
			for (int j=0; j<len1; j++) {
				if (str1.charAt(j) != sub.charAt(j)) cnt++;
			}
			if (i == 0) min = cnt;
			else if (cnt < min) min = cnt;
		}
		System.out.println(min);
	}
}
