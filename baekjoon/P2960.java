import java.util.Scanner;

public class P2960 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int k = sc.nextInt();
		boolean[] isDeleted = new boolean[n];
		int first = 2;	//지워지지 않은 수 중 가장 작은 소수
		int cnt = 0;	//지워진 수 개수
		boolean isK = false;
		
		while (true) {
			
			//가장 작은 소수를 찾아 소수의 배수를 순서대로 지움
			for (int i=1; first*i<=n; i++) {
				int num = first * i;
				
				if (!isDeleted[num-1]) {
					isDeleted[num-1] = true;
					cnt++;
					
					//k번째 지우는 수 출력
					if (cnt == k) {
						isK = true;
						System.out.println(num);
						break;
					}
				}
			}
			
			if (isK) break;
			
			//남은 수 중 가장 작은 소수 찾기
			for (int i=first+1; i<=n; i++) {
				boolean isPrim = true;
				
				if (!isDeleted[i-1]) {
					for (int j=2; j<=Math.sqrt(i); j++) {
						if (i % j == 0){
							isPrim = false;
							break;
						}
					}
					if (isPrim) {
						first = i;
						break;
					}
				}
			}
		}
		sc.close();
	}
}
