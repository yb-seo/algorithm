import java.math.BigInteger;
import java.util.Scanner;

public class P10826 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		BigInteger[] num = {new BigInteger("0"), new BigInteger("1")};
		BigInteger res = new BigInteger("0");
		
		if (n == 0 || n == 1) System.out.println(num[n]);
		else {
			for (int i=2; i<=n; i++) {
				res = num[0].add(num[1]);
				num[0] = num[1];
				num[1] = res;
			}
			System.out.println(res);
		}
		
		sc.close();
	}
}
