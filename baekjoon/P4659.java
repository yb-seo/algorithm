import java.util.Scanner;

/*
	#4659. 비밀번호 발음하기
	입력한 비밀번호가 3가지 테스트 케이스 만족하는지 판단
*/
public class P4659 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			String str = sc.nextLine();
			boolean isAcceptable = true;
			int type = 0;	//type: 1(모음), 2(자음)
			int cnt = 0;	//연속 글자 개수
			int len = str.length();
			int start = 0;
			
			//end 입력 시 종료
			if (str.equals("end")) break;
			
			
			//case 1 : 모음(a,e,i,o,u) 하나를 반드시 포함
			if (!str.contains("a") && !str.contains("e") && !str.contains("i") && !str.contains("o") && !str.contains("u")) {
				isAcceptable = false;
				start = len;	//case 1 만족 안 하면 case 2,3 조건 건너뜀
			}
			
			for (int i=start; i<len; i++) {
				char ch = str.charAt(i);
				
				//case 3 : 같은 글자가 연속적으로 두번 오면 안되나, ee 와 oo는 허용
				if (i != 0 && (ch != 'e' && ch != 'o')) {
					if (ch == str.charAt(i-1)) {
						isAcceptable = false;
						break;
					}
				}
				
				//case 2 : 모음이 3개 혹은 자음이 3개 연속으로 오면 안 됨
				if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
					if (type == 0 || type == 1) {
						type = 1;
						cnt++;
					} else {
						type = 1;
						cnt = 1;
					}
				} else {
					if (type == 0 || type == 2) {
						type = 2;
						cnt++;
					} else {
						type = 2;
						cnt = 1;
					}
				}
				
				if (cnt == 3) {
					isAcceptable = false;
					break;
				}
			}
			
			System.out.println("<"+str+"> is "+(isAcceptable?"":"not ")+"acceptable.");
		}
		
		sc.close();
	}
}