import java.util.Scanner;

public class P1297 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n3 = sc.nextInt();	//대각선 길이
		int n1 = sc.nextInt();	//높이 비율
		int n2 = sc.nextInt();	//너비 비율
		
		long nn3 = n3 * n3;
		long nn1 = n1 * n1;
		long nn2 = n2 * n2;
		
		double x = (double)nn3 / (nn1 + nn2);	
		System.out.println((int)Math.sqrt(nn1*x) + " " + (int)Math.sqrt(nn2*x));	//소수점이면 소수점 자리 버리고 정수로 출력
		
		sc.close();
	}
}
