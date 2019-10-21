import java.util.Scanner;

public class P5575 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		for (int i=0; i<3; i++) {
			int sh = sc.nextInt();
			int sm = sc.nextInt();
			int ss = sc.nextInt();
			
			int eh = sc.nextInt();
			int em = sc.nextInt();
			int es = sc.nextInt();
			
			int gap = (eh * 3600 + em * 60 + es) - (sh * 3600 + sm * 60 + ss);
			
			System.out.println(gap/3600 + " " + gap%3600/60 + " " + gap%3600%60);
		}
		sc.close();
	}
}
