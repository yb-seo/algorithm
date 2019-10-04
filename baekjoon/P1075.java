import java.util.Scanner;

public class P1075 {
	
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int f = sc.nextInt();
		int left = 0;		//나누어 떨어지기 위해 끝에 두 자리에 넣어주어야 할 값
		
		n = n / 100 * 100;	//가장 뒤 2자리 비우기
		
		//0으로 나누어 떨어지면 0, 그렇지 않으면 나머지에서 나누어준 값의 모자란 만큼 있어야 나누어 떨어짐  
		if ((left = n % f) != 0) {
			left = f - left;
		}
		
		System.out.printf("%02d\n", left);	//2자리 수 출력하고 자릿수 모자란 부분 0으로 채워줌
		
		sc.close();
	}
}
