import java.util.Scanner;

public class P9093 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		sc.nextLine();
		
		for (int i=0; i<t; i++) {
			String[] str = sc.nextLine().split(" ");
			
			for (int j=0; j<str.length; j++) {
				StringBuilder sb = new StringBuilder(str[j]);
				System.out.print(sb.reverse() + ((j == str.length-1) ? "" : " "));
			}
			System.out.println();
		}
		sc.close();
	}
}
