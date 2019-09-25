import java.util.Scanner;

/*
	#2846. 오르막길
	일정 거리마다 높이가 주어질 때 가장 큰 오르막길의 크기 구하는 프로그램
*/
public class P2846 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();			// 높이 측정할 개수
		int[] heightArr = new int[n];	// n개 거리 각각의 측정 높이
		
		int max = 0;	// 가장 큰 오르막길 크기 
		int sum = 0;	// 오르막길 크기
		
		// n개의 높이 측정값 입력 받기
		for (int i=0; i<n; i++) {
			heightArr[i] = sc.nextInt();
		}
		
		// 현재 높이보다 다음 높이가 큰 오르막길이면 높이 차이 구하여 오르막길 아닐 때까지 더해주면 하나의 오르막길 크기가 됨
		for (int i=0; i<n-1; i++) {
			
			if (heightArr[i] < heightArr[i+1]) {
				sum += (heightArr[i+1] - heightArr[i]);
				
				// 다음에 내리막길 나올 때 최대 크기 비겨하므로 오르막길로 끝나는 경우는 따로 추가
				if ((i == n-2) && (sum > max)) max = sum; 
			} else {
				if (sum > max) max = sum;
				sum = 0;
			}
		}
		
		System.out.println(max);
		sc.close();
	}
}