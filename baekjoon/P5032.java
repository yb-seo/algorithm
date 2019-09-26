import java.util.Scanner;

/*
	#5032. 탄산 음료
*/
public class P5032 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int e = sc.nextInt();	//가지고 있는 빈 병의 수
		int f = sc.nextInt();	//발견한 빈 병의 수
		int c = sc.nextInt();	//새 병으로 바꾸는데 필요한 빈 병의 수
		
		int newCntTotal = 0;	//새로 먹을 수 있는  탄산음료 개수
		int empty = e + f;		//빈 병 개수
		
		//새 병으로 바꿀 수 없을 때까지 반복
		while (empty / c != 0) {
			int newCnt = empty / c;	//현재 빈 병으로 바꿀 수 있는 새 병의 수
			newCntTotal += newCnt;
			empty = empty - newCnt * c + newCnt; //새 병으로 바꾸고 남은 빈 병 수에 새 병 다 먹은 후의 빈 병의 합
		}
		
		System.out.println(newCntTotal);
		
		sc.close();
	}
}