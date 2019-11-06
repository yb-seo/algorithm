import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class P2839 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int kg = Integer.parseInt(br.readLine());
		int max5 = kg / 5; 	//5kg 가방 최대 수
		int bags = -1; 		//최소로 필요한 가방 수
		
		for (int i=max5; i>=0; i--) {
			int left = kg - i * 5;
			
			if (left % 3 == 0) {
				bags = i + (left / 3);
				break;
			}
		}
		
		bw.write(bags + "");
		bw.flush();
	}
}
