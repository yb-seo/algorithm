import java.util.Arrays;
import java.util.Scanner;

public class P2896 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] amount = new int[3];	//주스의 양
		int[] ratio = new int[3];	//주스 비율
		double[] k = new double[3];
				
		//각 주스의 양 입력받기
		for (int i=0; i<3; i++) {
			amount[i] = sc.nextInt();
		}
		
		//각 주스의 비율 입력받기
		for (int i=0; i<3; i++) {
			ratio[i] = sc.nextInt();
			k[i] = (double)amount[i] / ratio[i];
		}
		
		Arrays.sort(k);	//k[0] : 최대로 만들 수 있는 값
		
		//남는 주스 양 출력(정답과의 오차 10-4)
		for (int i=0; i<3; i++) {
			System.out.printf("%.4f ", (amount[i] - ratio[i]*k[0]));
		}
		
		sc.close();
	}
}