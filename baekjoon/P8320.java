import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
	#8320. 직사각형을 만드는 방법
	n개의 정사각혀으로 만들 수 있는 직사각형 개수
*/
public class P8320 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int cnt = 0;	//만들 수 있는 직사각형 수
		
		//n개 중 i개의 정사각형을 사용하여 만들 수 있는 직사각형
		for (int i=1; i<=n; i++) {
			for (int j=1; j<=Math.sqrt(i); j++) {
				if (i % j == 0) cnt++; //i개의 정사각형으로 한 변이 j인 직사각형 만들 수 있으며 cnt 증가
			}
		}
		
		System.out.println(cnt);
	}
}
