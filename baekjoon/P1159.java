import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.TreeMap;

/*
	#1159. 농구경기
	성의 첫 글자가 같은 선수가 5명 이상인 경우를 모두 출력, 없을 경우 기권
*/
public class P1159 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// key를 오름차순 정렬하려고 TreeMap 사용함 (key: 성 첫 글자, value: key에 해당하는 서수 수)
		TreeMap<Character, Integer> tm = new TreeMap<>();
		
		int n = Integer.parseInt(br.readLine()); // 선수 수
		
		// 선수 수만큼 선수의 성 입력 받음
		for (int i=0; i<n; i++) {
			String input = br.readLine();
			char ch = input.charAt(0);	// 성의 알파벳 첫 글자
			
			if (tm.containsKey(ch)) {
				tm.replace(ch, tm.get(ch)+1);
			} else {
				tm.put(ch, 1);
			}
		}
		
		boolean isPredaja = true;
		
		// 성의 첫 글자가 key인 선수 수가 5명 이상이면 출력
		for (char key : tm.keySet()) {
			if (tm.get(key) >= 5) {
				isPredaja = false;
				System.out.print(key);
			}
		}
		
		// 성의 첫 글자가 같은 선수가 5명 이상인 경우가 없으면 기권
		if (isPredaja) System.out.println("PREDAJA");
	}
}
