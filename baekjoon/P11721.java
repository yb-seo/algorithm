import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P11721 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		
		while (true) {
			if (str.length() <= 10) { //글자 10개 이하 남았을 때 남은 거 그대로 출력
				System.out.println(str);
				break;
			} else { //글자 10개 출력하고 남은 글자 구하기
				System.out.println(str.substring(0,10));
				str = str.substring(10);
			}
		}
	}
}
