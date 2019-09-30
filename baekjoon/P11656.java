import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/*
	#11656. 접미사 배열
	주어진 단어의 접미사들을 알파벳 순으로 출력
*/
public class P11656 {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine(); //문자열 입력받기
		int len = str.length();
		String[] suffix  = new String[len];	//접미사들 모음(문자열 길이만큼 생김)
		
		//주어진 문자열에 대한 모든 접미사 구하기
		for (int i=0; i<len; i++) {
			suffix[i] = str.substring(i);
		}
		
		//접미사들을 알파벳 오름차순으로 정렬
		Arrays.sort(suffix);
		
		//접미사 모두 출력
		for (int i=0; i<len; i++) {
			System.out.println(suffix[i]);
		}
	}
}