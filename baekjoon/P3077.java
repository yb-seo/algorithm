import java.util.HashMap;
import java.util.Scanner;

public class P3077 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		//ArrayList 시간초과나서 HashMap 사용
		HashMap<String, Integer> hm = new HashMap<>();	//정답	
		String[] answer = new String[n];				//답안
		int correctCnt = 0;	//순서 맞은 개수
		int pair = n * (n-1) / 2;
		
		//정답 순서대로 입력받기
		for (int i=0; i<n; i++) {
			hm.put(sc.next(), i);
		}
		
		//답안 순서 잉력받기
		for (int i=0; i<n; i++) {
			answer[i] = sc.next();
		}
		
		//답안의 쌍 비교하면서 정답과 순서 같으면 카운트 증가
		for (int i=0; i<n-1; i++) {
			for (int j=i+1; j<n; j++) {
				
				if (hm.get(answer[i]) < hm.get(answer[j])) {
					correctCnt++;
				}
			}
		}
		
		System.out.println(correctCnt + "/" + pair);
		sc.close();
	}
}