import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P5586 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		int len = str.length();
		int cntJ = 0, cntI = 0;
		
		for (int i=0; i<len-2; i++) {
			String sub = str.substring(i, i+3);
			if (sub.equals("JOI")) cntJ++;
			else if (sub.equals("IOI")) cntI++;
		}
		
		System.out.println(cntJ);
		System.out.println(cntI);
	}
}
