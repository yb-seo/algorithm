import java.util.Scanner;

public class P10707 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();	//X사 1리터 당 요금
		int b = sc.nextInt();	//Y사 기본요금
		int c = sc.nextInt();	//Y사의 요금이 기본요금이 상한 사용량
		int d = sc.nextInt();	//Y사의 1리터 당 추가요금
		int p = sc.nextInt();	//한 달간 사요하는 수도의 양 P
		
		int x = a * p;
		int y = (p <= c) ? b : b + (p - c) * d;
		
		System.out.println(Math.min(x, y));
		sc.close();
	}
}
