import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
	#10808. 알파벳 개수
	알파벳 소문자로만 이루어진 단어가 주어질 때, 각 알파벳이 단어에 몇 개가 포함되어 있는지 구하는 프로그램
*/
public class P10808 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] alpha = new int[26];	//주어진 문자열에서 a~z 각각의 개수
		String str = br.readLine();	//문자열 입력받기
		
		for (char ch : str.toCharArray()) {
			int idx = ch - 'a';
			alpha[idx]++;
		}
		
		for (int i=0; i<alpha.length; i++) {
			System.out.print(alpha[i] + " ");
		}
	}
}
