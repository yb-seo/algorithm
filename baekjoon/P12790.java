import java.util.Scanner;

public class P12790 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();	//테스트 케이스 수
		
		for (int i=0; i<t; i++) {
			//(h:hp, m:mp, a:공격력, d:방어력)
			//기본 값 
			int h1 = sc.nextInt();
			int m1 = sc.nextInt();
			int a1 = sc.nextInt();
			int d1 = sc.nextInt();
			//장비 후 증감되는 값
			int h2 = sc.nextInt();
			int m2 = sc.nextInt();
			int a2 = sc.nextInt();
			int d2 = sc.nextInt();
			
			int h = (h1 + h2) < 1 ? 1 : (h1 + h2);
			int m = (m1 + m2) < 1 ? 1 : (m1 + m2);
			int a = (a1 + a2) < 0 ? 0 : (a1 + a2);
			int d = d1 + d2;
			
			//최종 전투력 출력
			System.out.println(1*h + 5*m + 2*a + 2*d);
		}
		sc.close();
	}
}