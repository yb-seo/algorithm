import java.util.Scanner;

public class P3035 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int r = sc.nextInt();
		int c = sc.nextInt();
		int zr = sc.nextInt();
		int zc = sc.nextInt();
		
		char[][] input = new char[r][c];
		
		for (int i=0; i<r; i++) {
			input[i] = sc.next().toCharArray();
		}
		
		//3 4 2 5
		//abcd    
		//efgh
		//ijkl
		//0 aaaaabbbbbcccccddddd
		
		//(0,0)~(0,4)->(0,0) 
		//(1,0)~(1,4)->(0,0) 
		//(0,5)~(0,9)->(0,1)
		//(1,5)~(1,9)->(0,1) 
		//(2,0)~(2,4)->(1,0)
		//(3,0)~(3,4)->(1,0)
		
		for (int i=0; i<r*zr; i++) {
			for (int j=0; j<c*zc; j++) {
				System.out.print(input[i/zr][j/zc]);
			}
			System.out.println();
		}
		sc.close();
	}
}
