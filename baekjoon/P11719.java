import java.util.Scanner;

public class P11719 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int cnt = 0;
		
		while (sc.hasNextLine()) {
			String input = sc.nextLine();
			System.out.println(input);

			cnt++;
			if (cnt == 100) break;
		}
		sc.close();
	}
}
