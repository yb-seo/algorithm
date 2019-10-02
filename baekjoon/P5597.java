
import java.util.Scanner;

public class P5597 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		//int N = 28;		//제출한 학생 수
		
		boolean[] isSubmit = new boolean[30]; //학생 30명 과제 제출 여부 
		//int num = 0;	//출석번호 
		
		//과제 제출한 28명 출석번호 입력받기
		for (int i=0; i<28; i++) {
			int n = sc.nextInt();	//과제 제출한 학생 출석번호 
			isSubmit[n-1] = true;
		}
		
		//1~30번순으로 과제 제출 안했으면 출석번호 출력
		for (int i=0; i<30; i++) {
			if (!isSubmit[i]) System.out.println(i+1);
		}
		
		sc.close();
	}
}