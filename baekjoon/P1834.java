import java.util.Scanner;

public class P1834 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long sum = 0;			//n 최대 2000000일 때 int 범위 넘으므로 long 사용
		
		//몫과 나머지 같은 수들의 합 (나머지는 n보다 작보다 작아야)
		for (int i=1; i<n; i++) {
			sum += ((long)n * i + i);
		}
		
		System.out.println(sum);
		sc.close();
	}
}
