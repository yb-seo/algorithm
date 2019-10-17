import java.util.Scanner;

public class P2455 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
			
		int max = 0;	//가장 많이 타고 있을 때의 승객 수
		int num = 0;	//승객 수
		
		for (int i=0; i<4; i++) {
			int off = sc.nextInt();	//내린 사람 수
			int on = sc.nextInt();	//탄 사람 수
			
			num = num - off + on;
			if (num > max) max = num;
		}
		
		System.out.println(max);
		
		sc.close();
	}
}
