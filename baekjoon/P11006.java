import java.util.Scanner;

public class P11006 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();	//테스트 케이스 수
		
		for (int i=0; i<T; i++) {
			int legs = sc.nextInt();	//다리 수
			int cnt = sc.nextInt();		//닭 수
			int lost = cnt * 2 - legs;	//잃어버린 다리 수 = 한 쪽 다리 닭 수
			
			System.out.println(lost + " " + (cnt-lost));	//한 쪽 다리 닭 수, 멀쩡한 닭 수 출력
		}
		sc.close();
	}
}
