import java.util.Scanner;

/*
	#5618. 공약수
	입력으로 주어진 n개 수의 공약수를 한 줄에 하나씩 증가하는 순서대로 출력
*/
public class P5618 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();		//입력받을 숫자 개수
		int[] nums = new int[n];	//입력받는 숫자들이 저장되는 곳
		int min = 0;				//입력받은 숫자들 중 가장 작은 수
		
		//n개의 숫자 입력받기
		for (int i=0; i<n; i++) {
			nums[i] = sc.nextInt();
			
			if (i == 0) {
				min = nums[i];
			} else if (nums[i] < min) {
				min = nums[i];
			}
		}
		
		for (int i=1; i<=min; i++) {
			boolean isDiv = true;
		
			//n개의 숫자가 모두 i로 나누어지는지 확인 (하나라도 나누어지지 않으면 공약수 아니므로 false)
			for (int j=0; j<n; j++) {
				if (nums[j] % i != 0) {
					isDiv = false;
					break;
				}
			}
			
			//i가 공약수이면 출력
			if(isDiv) System.out.println(i);
		}
		sc.close();
	}
}