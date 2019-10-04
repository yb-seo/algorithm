import java.util.Scanner;

public class P4504 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		while (true) {
			int list = sc.nextInt();	//목록에 들어있는 수
			if (list == 0) break;
			
			if (list % n == 0) {	//list값이 n의 배수일 때
				System.out.println(list + " is a multiple of " + n + ".");
			} else {
				System.out.println(list + " is NOT a multiple of " + n + ".");
			}
		}
		
		sc.close();
	}
}
