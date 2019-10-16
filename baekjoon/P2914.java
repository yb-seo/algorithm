import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P2914 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] input = br.readLine().split(" ");
		int tracks = Integer.parseInt(input[0]);
		int avg = Integer.parseInt(input[1]);
		
		System.out.println(tracks * (avg-1) + 1);
	}
}
