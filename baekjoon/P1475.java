import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class P1475 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] count = new int[10];	//숫자 0~9 사용된 갯수
		
		String input = br.readLine();
		int len = input.length();
		
		for (int i=0; i<len; i++) {
			int idx = input.charAt(i) - '0';
			if (idx == 6) count[9]++;	
			else count[idx]++;
		}
		
		if (count[9] % 2 == 0) count[9] = count[9] / 2;
		else count[9] = count[9] / 2 + 1;
		
		Arrays.sort(count);
		System.out.println(count[9]);	//가장 많이 사용한 횟수 -> 세트 개수
	}
}
