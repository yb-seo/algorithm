import java.util.Scanner;

public class P1812 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] sum = new int[n];
		
		for (int i=0; i<n; i++) {
			sum[i] = sc.nextInt();
		}
		
		int mid = n / 2;
		int val = sum[mid];	
		
		for (int i=1; i<=mid; i++) {
			val = sum[mid-i] + sum[mid+i] - val;
		}
		
		int num1 = val / 2;	//1번 학생이 가지고 있는 사탕 수
		System.out.println(num1);
		
		for (int i=0; i<n-1; i++) {
			int num2 = sum[i]-num1;
			System.out.println(num2);
			num1 = num2;
		}
		sc.close();
	}
}
