import java.util.Scanner;

/*
	#2490. 윷놀이
	네 개 윷짝을 던져서 나온 각 윷짝의 배 혹은 등 정보가 주어질 때 도(배 한 개, 등 세 개), 개(배 두 개, 등 두 개), 걸(배 세 개, 등 한 개), 윷(배 네 개), 모(등 네 개) 중 어떤 것인지를 결정하는 프로그램을 작성하라.
*/
public class P2490 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// 세 번 던짐
		for (int i=0; i<3; i++) {
			int cnt = 0;	// 배 개수
			
			// 윷 네 개 
			for (int j=0; j<4; j++) {
				int n = sc.nextInt();
				if (n == 0) cnt++;	// 0 : 배, 1 : 등  
			}
			
			switch (cnt) {
			case 0 : System.out.println("E"); break;
			case 1 : System.out.println("A"); break; 
			case 2 : System.out.println("B"); break;
			case 3 : System.out.println("C"); break;
			case 4 : System.out.println("D"); break;
			}
		}
		sc.close();
	}
}
