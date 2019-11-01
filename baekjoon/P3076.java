import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class P3076 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String[] input1 = br.readLine().split(" ");
		String[] input2 = br.readLine().split(" ");
		
		int r = Integer.parseInt(input1[0]);	//체스판 행 수
		int c = Integer.parseInt(input1[1]);	//체크판 열 수
		int a = Integer.parseInt(input2[0]);	//행의 높이
		int b = Integer.parseInt(input2[1]);	//열의 너비
		
		String[] marks = {"X", "."};
		
		//r:2, c:5, a:2, b:3
		//0 012(X) 345(.) 678(X) ...
		//1 012(X) 345(.) 678(X) ...
		//2 012(.) 345(X) 678(.) ...
		//3 012(.) 345(X) 678(.) ...
		
		for (int i=0; i<r; i++) {
			for (int j=0; j<a; j++) {
				for (int k=0; k<c*b; k++) {
					String mark = "";
					
					if (k/b%2 == 0) {
						mark = marks[i%2]; 
					}
					else {
						mark = marks[(i+1)%2];
					}
					bw.write(mark);
				}
				bw.write("\n");
			}
		}
		bw.flush();
	}
}
