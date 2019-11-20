import java.math.BigDecimal;
import java.util.Scanner;

public class P10827 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		BigDecimal a = new BigDecimal(sc.next());
		int b = Integer.parseInt(sc.next());
		
		System.out.println(a.pow(b).toPlainString());
		
//		BigDecimal res = new BigDecimal("1");
//		for (int i=0; i<b; i++) {
//			res = res.multiply(a);
//		}
//		System.out.println(res.toPlainString());
		
		sc.close();
	}
}
