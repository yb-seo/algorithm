import java.util.Scanner;

public class P5543 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int minB = 0;	//버거 최저가
		int minD = 0;	//음료 최저가
		
		//버거 가격
		for (int i=0; i<3; i++) {
			int p = sc.nextInt();
			if (i == 0) minB = p;
			else if (minB > p) minB = p;
		}
			
		//음료 가격
		for (int i=0; i<2; i++) {
			int p = sc.nextInt();
			if (i == 0) minD = p;
			else if (minD > p) minD = p;
		}
		
		System.out.println(minB + minD - 50);
		sc.close();
	}
}
