import java.util.Scanner;

public class P2864 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String a = sc.next();
		String b = sc.next();
		
		//두 수 합의 최소갓 6->5
		System.out.println(Integer.parseInt(a.replace("6", "5")) + Integer.parseInt(b.replace("6", "5")));
		//두 수 합의 최대값 5->6
		System.out.println(Integer.parseInt(a.replace("5", "6")) + Integer.parseInt(b.replace("5", "6")));
		
		sc.close();
	}
}
