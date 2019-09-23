import java.util.Scanner;

/* 
	#2577. 숫자의 개수
	세 개의 자연수 A, B, C가 주어질 때 A×B×C를 계산한 결과에 0부터 9까지 각각의 숫자가 몇 번씩 쓰였는지를 구하는 프로그램을 작성하시오.
*/
public class P2577 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int[] cnt = new int[10];
		
		int a = in.nextInt();
		int b = in.nextInt();
		int c = in.nextInt();
		
		String res = (a * b * c) + "";
		
		// 결과값 한 자리씩 숫자 확인하여 해당 인덱스 카운트 증가
		for (int i=0; i<res.length(); i++) {
			cnt[res.charAt(i)-'0']++;
		}
		
		// 0~9 사용된 숫자 개수 출력
		for (int i=0; i<cnt.length; i++) {
			System.out.println(cnt[i]);
		}
		
		in.close();
	}
}