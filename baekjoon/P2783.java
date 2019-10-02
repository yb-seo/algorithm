import java.util.Scanner;

public class P2783 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt(); 
		double y = sc.nextDouble();
		int n = sc.nextInt();	//다른 편의점 개수
		
		double price = x / y * 1000;	//1000g당 가격 (초기값은 세븐25의 가격)
		double min = price;				//최저 가격
	
		//n개의 편의점 1000g당 가격 구해서 최저 가격인지 구하기
		for (int i=0; i<n; i++) {
			x = sc.nextInt();
			y = sc.nextDouble();
			
			price = x / y * 1000;
			if (price < min) min = price;
		}
		
		System.out.printf("%.2f\n", min);
		sc.close();
	}
}
