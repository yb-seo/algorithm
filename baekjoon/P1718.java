import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
	#1718. 암호
	평문을 암호화 키로 암호화한 암호문 출력
*/
public class P1718 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String sentence = br.readLine();	//평문
		String key = br.readLine();			//암호화 키
		int keyLen = key.length();			//암호화 키 길이
		
		//평문에서 문자 한 글자씩 암호화
		for (int i=0; i<sentence.length(); i++) {
			char sentenceChar = sentence.charAt(i);	//평문의 암호화할 문자
			char keyChar = key.charAt(i % keyLen);	//i번째 글자 위치에 필요한 암호화 키
			
			//평문의 공백은 공백으로 출력
			if (sentenceChar == ' ') {
				System.out.print(' ');
				continue;
			}
			
			//변형된 문자로 암호화
			int newCharIdx = sentenceChar - keyChar;
			if (newCharIdx > 0) {
				System.out.print((char)('a' - 1 + newCharIdx));
			} else {
				System.out.print((char)('z' + newCharIdx));
			}
		}
	}
}