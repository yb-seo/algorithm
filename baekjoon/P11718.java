import java.util.Scanner;

public class P11718 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int cnt = 0;
		
		while (sc.hasNext()) {
			System.out.println(sc.nextLine());
			cnt++;
			if (cnt == 100) break;
		}
		sc.close();
	}
}
