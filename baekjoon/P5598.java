import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/*
	#5598. 카이사르 암호
	입력받은 카이사르 단어를 원래 단어로 고친 걸 출력
*/
public class P5598 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringBuilder after = new StringBuilder(br.readLine());
		StringBuilder before = new StringBuilder();
		
		int len = after.length();
		
		for (int i=0; i<len; i++) {
			char afterCh = after.charAt(i);			//카이사르 문자
			char beforeCh = (char) (afterCh - 3);	//원래 문자
			
			if (beforeCh < 'A') {
				beforeCh = (char)('Z' - ('A' - beforeCh - 1));
			} 
			before.append(beforeCh);
		}
		bw.write(before.toString());
		bw.flush();
	}
}
