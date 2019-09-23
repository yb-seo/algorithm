import java.util.Scanner;

/*
 	#10871. X보다 작은 수
 	정수 N개로 이루어진 수열 A와 정수 X가 주어진다. 이때, A에서 X보다 작은 수를 모두 출력하는 프로그램을 작성하시오.
*/
public class P10871 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		int n = sc.nextInt();
		int max = sc.nextInt();
		
		for (int i=0; i<n; i++) {
			int input = sc.nextInt();
			if (input < max) {
				sb.append(input + " ");
			}
		}
		System.out.println(sb);
		sc.close();
	}
}
