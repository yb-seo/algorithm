import java.util.Scanner;

/*
	#2884. 알람 시계
	현재 상근이가 맞춰논 알람 시각이 주어졌을 때, 알람을 45분 앞서는 시간으로 바꾸는  프로그램을 작성하시오.
*/
public class P2884 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int h = in.nextInt();
		int m = in.nextInt();
		
		int setM = 60 * h + m - 45; // 일어나야 하는 시간을 분으로 계산
		
		if (setM < 0) {
			setM = 60 * 24 + setM;
		}
		
		System.out.println(setM/60 + " " + setM%60);
				
		in.close();
	}
}
