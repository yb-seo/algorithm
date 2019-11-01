import java.util.Arrays;
import java.util.Scanner;

public class P3047 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] num = new int[3];
		String order;
		
		//A,B,C값 입력받기 (순서대로X)
		for (int i=0; i<3; i++) {
			num[i] = sc.nextInt();
		}
		order = sc.next(); //출력할 A,B,C 순서
		
		Arrays.sort(num);  //오름차순->A,B,C순서
		
		for (int i=0; i<order.length(); i++) {
			char ch = order.charAt(i);
			System.out.print(num[ch-65] + " ");
		}
		sc.close();
	}
}
