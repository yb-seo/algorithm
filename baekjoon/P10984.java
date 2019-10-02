import java.util.Scanner;

public class P10984 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();	//학기 수
	
		for (int i=0; i<t; i++) {
			int n = sc.nextInt();	//해당 학기에 들은 과목 수
			int totalC = 0;			//해당 학기에 들은 총 학점
			double totalG = 0;		//과목 학점에 따른 성적들의 총 합
			
			for (int j=0; j<n; j++) {
				int c = sc.nextInt();		//해당 과목이 학점
				double g = sc.nextDouble();	//해당 과목의 성적
				
				totalC += c;
				totalG += g * c;
			}
			
			System.out.printf("%d %.1f\n", totalC, (totalG / totalC));
		}
		
		sc.close();
	}
}
