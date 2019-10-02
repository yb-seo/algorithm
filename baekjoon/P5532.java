import java.util.Scanner;

public class P5532 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int l = sc.nextInt();	//방학 총 일수
		int a = sc.nextInt();	//풀어야 할 국어 페이지 수
		int b = sc.nextInt();	//풀어야 할 수학 페이지 수
		int c = sc.nextInt();	//하루에 최대로 풀 수 있는 국어 페이지 수
		int d = sc.nextInt();	//하루에 최대로 풀 수 있는 수학 페이지 수
		
		int kor = a / c + (a % c == 0 ? 0 : 1);		//국어 푸는 데 걸리는 일수
		int math = b / d + (b % d == 0 ? 0 : 1);	//수학 푸는 데 걸리는 일수
		
		System.out.println(l - Math.max(kor, math));
		
		sc.close();
	}
}
