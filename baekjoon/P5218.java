import java.util.Scanner;

/*
	#5218. 알파벳 거리
	각 테스트 케이스 마다 각 글자의 알파벳 거리를 공백으로 구분해 출력
	y ≥ x인 경우에는 y-x, y < x인 경우에는 (y+26)-x가 알파벳 거리
*/
public class P5218 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for (int i=0; i<n; i++) {
			String strX = sc.next();	
			String strY = sc.next();
			int len = strX.length(); //strX와 strY의 글자 길이는 동일
			
			System.out.print("Distances: ");
			for (int j=0; j<len; j++) {
				char x = strX.charAt(j);
				char y = strY.charAt(j);
				
				if (y - x >= 0) System.out.print((y - x) + " ");
				else {
					System.out.print((y + 26 - x) + " ");
				}
			}
			System.out.println();
		}
		sc.close();
	}
}