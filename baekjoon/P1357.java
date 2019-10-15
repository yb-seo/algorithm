import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P1357 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] input = br.readLine().split(" ");
		int x = Integer.parseInt(input[0]);
		int y = Integer.parseInt(input[1]);
		
		System.out.println(rev(rev(x)+rev(y)));
	}
	
	//모든 자리 수 역순으로 바꾼 숫자 리턴 
	public static int rev(int n) {
		StringBuilder sb = new StringBuilder(n + "");
		return Integer.parseInt(sb.reverse().toString());
	}
}
