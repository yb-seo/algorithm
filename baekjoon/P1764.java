import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;

public class P1764 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();	//듣도 못한 사람의 수
		int m = sc.nextInt();	//보도 못한 사람의 수
		
		//(ArrayList쓰면 시간 초과나서 HashSet 사요)
		HashSet<String> setN = new HashSet<>();			//듣도 못한 사람 리스트 
		ArrayList<String> arrNM = new ArrayList<>();	//듣보잡 리스트
		
		//듣도 못한 사람 입력 
		for (int i=0; i<n; i++) {
			setN.add(sc.next());
		}
		
		//보도 못한 사람 입력 받아서 듣도 못한 사람과 겹치면 듣보잡 리스트에 추가
		for (int i=0; i<m; i++) {
			String str = sc.next();
			if (setN.contains(str)) arrNM.add(str);
		}
		
		Collections.sort(arrNM);			//듣보잡 명단 사전순 정렬
		
		System.out.println(arrNM.size());	//듣보잡 수 출력
		for (String str : arrNM) {
			System.out.println(str);		//듣보잡 명단 출력
		}
		sc.close();
	}
}
