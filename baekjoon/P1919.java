import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P1919 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str1 = br.readLine();
		String str2 = br.readLine();
		int cnt = 0; //지워야 하는 문자 수
		
		while (!str1.equals("")) {
			String ch = str1.charAt(0) + "";
			if (str2.indexOf(ch) == -1) { //같은 문작가 없으면 지워야 하므로 카운트 증가
				cnt++;
			} else {
				str2 = str2.replaceFirst(ch, "");
			}
			str1 = str1.replaceFirst(ch, "");
		}
		
		cnt += str2.length();
		
		System.out.println(cnt);
	}
}
