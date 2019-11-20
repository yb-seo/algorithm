import java.util.Scanner;
import java.util.StringTokenizer;

public class P10822 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		StringTokenizer st = new StringTokenizer(sc.nextLine(), ",");
		int sum = 0;
		
		while (st.hasMoreTokens()) {
			sum += Integer.parseInt(st.nextToken());
		}
		
		System.out.println(sum);
		sc.close();
	}
}
