import java.util.LinkedList;
import java.util.Scanner;

public class P1158 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int k = sc.nextInt();
		
		LinkedList<Integer> list = new LinkedList<>();
		for (int i=1; i<=n; i++) {
			list.add(i);
		}
	
		int idx = -1;
		int cnt = 0;
		
		String result = "";
		
		while (!list.isEmpty()) {
			cnt++;
			idx++;
			
			if (idx > list.size()-1) idx = 0;
			
			if (cnt == k) {
				result = result + (result.equals("") ? "" : ", ") + list.remove(idx);
				idx--;
				cnt = 0;
			}
		}
		
		System.out.println("<" + result + ">");
		sc.close();
	}
	
}
