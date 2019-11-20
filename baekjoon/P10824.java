import java.util.Scanner;

public class P10824 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String[] input = sc.nextLine().split(" ");
		long n1 = Long.parseLong(input[0] + input[1]);
		long n2 = Long.parseLong(input[2] + input[3]);
		
		System.out.println(n1 + n2);
		sc.close();
	}
}
