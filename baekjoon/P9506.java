import java.util.Scanner;

public class P9506 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			int n = sc.nextInt();
			int sum = 0;	//n 자신을 제외한 약수들의 합
			String str = "";	
			
			//-1 입력시 종료
			if (n == -1) break;
			
			for (int i=1; i<n; i++) {
				//i가 약수일 때
				if (n % i == 0) {
					sum += i;	
					if (i == 1) {
						str += "1";
					} else {
						str += " + " + i;
					}
				}
			}
			
			if (sum == n) { //완전수
				System.out.println(n + " = " + str);
			} else {
				System.out.println(n + " is NOT perfect.");
			}
		}
		
		sc.close();
	}
}
