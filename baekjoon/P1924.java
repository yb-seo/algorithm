import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/* 
	#1924. 2007년
	오늘은 2007년 1월 1일 월요일이다. 그렇다면 2007년 x월 y일은 무슨 요일일까? 이를 알아내는 프로그램을 작성하시오.
*/
public class P1924 {

	public static void main(String[] args) throws IOException {
		
		String[] week = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"}; 
		int[] mdays = {31,28,31,30,31,30,31,31,30,31,30,31};	//2007년 월별 일 수
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int month = Integer.parseInt(st.nextToken());
		int day = Integer.parseInt(st.nextToken());
		int days = 0;	
		
		for (int i=1; i<month; i++) {
			days += mdays[i-1];
		}
		days += day - 1;
		
		System.out.println(week[(days+1)%7]);
	}
}
