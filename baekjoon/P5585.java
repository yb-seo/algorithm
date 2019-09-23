import java.util.Scanner;

/*
	#5585. 거스름돈
	1000엔 지폐를 한장 냈을 때, 받을 잔돈에 포함된 잔돈의 개수를 구하는 프로그램을 작성하시오.
	(잔돈 : 500엔, 100엔, 50엔, 10엔, 5엔, 1엔) 
*/
public class P5585 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int[] coins = {500, 100, 50, 10, 5, 1}; // 잔돈 동전 종류
		int paid = 1000; 			// 지불한 돈
		int price = sc.nextInt();	// 물건 가격
		int change = paid - price;  // 잔돈
		int cnt = 0;				// 잔돈 개수
		
		if (change > 0) {
			int left = change;
			
			for (int coin : coins) {
				int n = left / coin;
				cnt += n;
				left -= coin * n;
				
				if (left == 0) break;
			} 
			
			System.out.println(cnt);
		}
		
		sc.close();
	}
}
