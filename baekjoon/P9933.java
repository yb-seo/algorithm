import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;

public class P9933 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		HashSet<String> set = new HashSet<>();
		
		int n = Integer.parseInt(br.readLine());
		
		for (int i=0; i<n; i++) {
			StringBuilder str = new StringBuilder(br.readLine());
			String orig = str.toString();
			String rev = str.reverse().toString();
			
			if (orig.equals(rev) || set.contains(rev)) {	//앞뒤 뒤집어서 똑같은 문자이거나 뒤집은 문자를 입력받은 경우
				int len = str.length();
				bw.write(len + " " + str.charAt(len/2) + "\n");
			} else {
				set.add(orig);
			}
		}
		bw.flush();
	}
}
