import java.util.Arrays;
import java.util.Scanner;

public class P2959 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[] num = new int[4];
		int[] area = new int[3]; //조합 가능한 면적 값들
		
		for (int i=0; i<4; i++) { 
			num[i] = sc.nextInt();
		}
		
		//(01,23),(02,13),(03,12)
		area[0] = Math.min(num[0], num[1]) * Math.min(num[2], num[3]);
		area[1] = Math.min(num[0], num[2]) * Math.min(num[1], num[3]);
		area[2] = Math.min(num[0], num[3]) * Math.min(num[1], num[2]);
		
		Arrays.sort(area);
		System.out.println(area[2]); //가장 큰 면적
		
		sc.close();
	}
}
