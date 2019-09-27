import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
	#1032. 명령 프롬프트
	길이가 같은 n개의 파일이름 입력받아 공통의 패턴 출력 
*/
public class P1032 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String[] filename = new String[n];
		
		for (int i=0; i<n; i++) {
			filename[i] = br.readLine();
		}
		
		int len = filename[0].length();
		
		char ch = '\0';
		for (int i=0; i<len; i++) {
			boolean isPattern = true;
			for (int j=0; j<n; j++) {
				if (j == 0) ch = filename[0].charAt(i);
				else if (filename[j].charAt(i) != ch) {
					isPattern = false;
					break;
				}
			}
			
			if (isPattern) System.out.print(ch);
			else System.out.print("?");
		}
	}
}
