import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/*
	#1100. 하얀 칸
	체스칸(8x8) 하얀 칸에 있는 말의 개수 출력
*/
public class P1100 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int cnt = 0; //하얀 칸에 있는 말의 개수
		
		//8줄 입력받음
		for (int i=0; i<8; i++) {
			String line = br.readLine();
			int start = i % 2; //하얀 칸 시작하는 위치

			for (int j=start; j<8; j+=2) {
				if (line.charAt(j) == 'F') cnt++; //해당 줄의 하얀 칸에 말이 있으면 cnt 증가
			}
		}
		
		bw.write(cnt+"");
		bw.flush();
	}
}
