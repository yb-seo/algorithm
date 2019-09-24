import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
	#10798. 세로읽기
	입력받은 단어들을 세로로 읽은 순서대로 출력
*/
public class P10798 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = 5;	// 입력 받을 단어 개수
		char[][] words = new char[N][];
		int maxLen = 0;	// 입력 받은 단어들 중 최대 길이
		
		// 단어 입력 받기, 단어들 중 최대 길이 찾기
		for (int i=0; i<N; i++) {
			words[i] = br.readLine().toCharArray();
			int len = words[i].length; 
			if (len > maxLen) maxLen = len;
		}
		
		for (int i=0; i<maxLen; i++) {
			for (int j=0; j<N; j++){
				if (words[j].length >= i+1) System.out.print(words[j][i]);
			}
		}
	}
}
