import java.util.Scanner;

public class P1371 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[] count = new int[26];	//a~z 각각 사용된 글자 수
		int max = 0;	//사용 횟수 최대값
		
		//ctrl+z 입력 시까지 입력받음
		while (sc.hasNextLine()) {
			String line = sc.nextLine();
		
			for (char ch : line.toCharArray()) {
				if (ch >= 'a' && ch <= 'z') {
					int idx = ch - 'a'; 
					count[idx]++;
					if (count[idx] > max) max = count[idx];
				}
			}
		}
		
		for (int i=0; i<26; i++) {
			if (count[i] == max) System.out.print((char)(i + 'a'));
		}
		sc.close();
	}
}
