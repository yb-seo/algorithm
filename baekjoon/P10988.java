import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
	#10988. 팰린드롬인지 확인하기
	입력받은 단어가 앞으로 읽을 때와 거꾸로 읽을 때 똑같으면 1 출력, 아니면 0 출력
*/
public class P10988 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String input = br.readLine();	//단어 입력 받음
		StringBuilder reverse = new StringBuilder(input);
		reverse.reverse();				//입력 받은 단어 앞뒤 거꾸로
		
		//단어가 앞뒤 거꾸로 했을 때와 같다면 1 출력, 아니면 0 
		System.out.println(input.equals(reverse.toString()) ? "1" : "0");
	}
}
