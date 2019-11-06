import java.util.Scanner;

public class P2909 {
	
	public static void main(String[] args) {
		
		//ex: 1940 2 => 1900, 1950 2 => 2000
		
		Scanner sc = new Scanner(System.in);
		
		int candy = sc.nextInt();	//사탕 가격
		int zero = sc.nextInt();	//지폐 액면가 0 개수
		int paper = (int)(Math.pow(10, zero));	//지폐 액면가
		
		int n = candy / paper;
		if (candy % paper * 2 >= paper) {	//반올림 자리수 5 넘으면 올림
			n += 1;
		}
		
		System.out.println(n * paper);
		sc.close();
	}
}
