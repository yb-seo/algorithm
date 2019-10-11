import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P11586 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		char[][] mirror = new char[n][n];
		
		for (int i=0; i<n; i++) {
			mirror[i] = br.readLine().toCharArray();
		}
		
		int type = Integer.parseInt(br.readLine());
	
		switch (type) {
		case 1:	//그대로 출력 
			for (int i=0; i<n; i++) {
				System.out.println(mirror[i]);
			}
			break;
		case 2:	//좌우 반전
			for (int i=0; i<n; i++) {
				for (int j=n-1; j>=0; j--) {
					System.out.print(mirror[i][j]);
				}
				System.out.println();
			}
			break;
		case 3:	//상하 반전
			for (int i=n-1; i>=0; i--) {
				System.out.println(mirror[i]);
			}
			break;
		}
	}
}
