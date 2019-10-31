import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class P11651 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[][] arr = new int[n][2];
		
		//n개의 (x,y)값 입력받기
		for (int i=0; i<n; i++) {
			arr[i][0] = sc.nextInt(); //x
			arr[i][1] = sc.nextInt(); //y
		}
		
		Arrays.sort(arr, new Comparator<int[]>(){
			@Override
			public int compare(int[] o1, int[] o2) {
				//y 오름차순으로 정렬하되 y값 같은 경우는 x 오름차순 정렬
				if(o2[1] == o1[1]) {
					return o1[0] - o2[0];
				} else {
					return o1[1] - o2[1];
				}
			}
		});
		
		for (int i=0; i<n; i++) {
			System.out.println(arr[i][0] + " " + arr[i][1]);
		}
		sc.close();
	}
}
