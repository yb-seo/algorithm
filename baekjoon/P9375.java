import java.util.HashMap;
import java.util.Scanner;

public class P9375 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		for (int i=0; i<t; i++) {
			HashMap<String, Integer> hm = new HashMap<>();
			int n = sc.nextInt();
			int res = 1;
			
			for (int j=0; j<n; j++) {
				String name = sc.next();
				String kind = sc.next();
				
				if (!hm.containsKey(kind)) {					
					hm.put(kind, 1);
				} else {
					hm.replace(kind, hm.get(kind) + 1);
				}
			}
			
			for (int val : hm.values()) {
				res *= (val+1);
			}
			
			System.out.println(res-1);
		}
		
		sc.close();
	}
}
