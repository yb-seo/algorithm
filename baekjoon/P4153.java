import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/*
	#4153. 직각삼각형
	주어진 세변의 길이로 삼각형이 직각인지 아닌지 구분하시오.
*/
public class P4153 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] len = new int[3];
		
		while (true) {
			String[] input = br.readLine().split(" ");
			len[0] = Integer.parseInt(input[0]); 
			len[1] = Integer.parseInt(input[1]);
			len[2] = Integer.parseInt(input[2]);
			
			if (len[0] == 0 && len[1] == 0 && len[2] == 0)	break;
			
			Arrays.sort(len);
			
			if (Math.pow(len[0], 2) + Math.pow(len[1], 2) == Math.pow(len[2], 2)) System.out.println("right");
			else System.out.println("wrong");
		}
	}
}
