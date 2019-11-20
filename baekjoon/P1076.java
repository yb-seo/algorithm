
import java.util.ArrayList;
import java.util.Scanner;

public class P1076 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		ArrayList<String> color = new ArrayList<>();
		color.add("black");
		color.add("brown");
		color.add("red");
		color.add("orange");
		color.add("yellow");
		color.add("green");
		color.add("blue");
		color.add("violet");
		color.add("grey");
		color.add("white");
		
		// 저항색 3개 입력받기
		String c1 = sc.next();
		String c2 = sc.next();
		String c3 = sc.next();
		
		// 저항 값 구하기
		StringBuilder res = new StringBuilder();
		res.append(Integer.parseInt(""+color.indexOf(c1)+color.indexOf(c2)));

		if (!res.toString().equals("0")) {
			// 저항 곱
			int multi = color.indexOf(c3);
			for (int i=0; i<multi; i++) {
				res.append("0");
			}
		} 
		
		// 결과 값 출력
		System.out.println(res);
		sc.close();
	}
}
