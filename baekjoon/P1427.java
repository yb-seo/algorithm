import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class P1427 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		char[] arr = br.readLine().toCharArray();
		StringBuilder sb = new StringBuilder();
		
		//입력받은 숫자 오름차순
		Arrays.sort(arr);
		 
		for (int i=0; i<arr.length; i++) {
			sb.append(arr[i]);
		}
		
		//역순으로 출력(오름차순->내림차순)
		System.out.println(sb.reverse());
	}
}
