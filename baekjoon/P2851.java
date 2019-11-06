import java.util.Scanner;

public class P2851 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[] point = new int[10];	//버섯 10개의 각 점수
		int sum = 0;
		
		for (int i=0; i<10; i++) {
			point[i] = sc.nextInt();
			
			int tsum = sum + point[i]; 
			
			if (tsum >= 100) {
				if (100 - sum >= tsum - 100) sum = tsum;
				break;
			} else {
				sum = tsum;
			}
		}
		
		System.out.println(sum);
		sc.close();
	}
}