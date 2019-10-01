import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
	#2857. FBI
	5개의 첩보원명이 주어질 때 FBI가 들어간 요원이 몇 번째에 있는지 오름차순으로 출력
*/
public class P2857 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder result = new StringBuilder("");
		
		for (int i=1; i<=5; i++) {
			String input = br.readLine();
			if (input.indexOf("FBI") != -1) {
				result.append(i + " ");
			}
		}
		
		if (result.toString().equals("")) {
			System.out.println("HE GOT AWAY!");
		} else {
			System.out.println(result);
		}
	}
}
