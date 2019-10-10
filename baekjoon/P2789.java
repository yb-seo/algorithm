import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P2789 {
	
	public static void main(String[] args) throws IOException {
		
		StringBuilder sb = new StringBuilder("CAMBRIDGE");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();					//입력값
		StringBuilder res = new StringBuilder();	//결과값
		
		for (int i=0; i<str.length(); i++) {
			String tmp = str.charAt(i) + "";
			if (sb.indexOf(tmp) == -1) res.append(tmp);
		}
	
		System.out.println(res);
	}
}
