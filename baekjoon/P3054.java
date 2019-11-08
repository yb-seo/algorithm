import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P3054 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String word = br.readLine();
		int len = word.length(); 
		int width = 5+(4*(len-1));
		char[][] draw = new char[5][width];
		int row = 2;
		
		for (int i=0; i<len; i++) {
			int col = 2 + (4 * i); //문자 찍히는 col 위치
			char ch = ((i+1) % 3 == 0) ? '*' : '#'; //3의 배수는 웬디, 그 외는 피터팬 프레임
			
			draw[row][col] = word.charAt(i);
			
			if (draw[row][col-2] != '*') draw[row][col-2] = ch;
			if (draw[row][col+2] != '*') draw[row][col+2] = ch;
			if (draw[row-2][col] != '*') draw[row-2][col] = ch;
			if (draw[row+2][col] != '*') draw[row+2][col] = ch;
			
			if (draw[row-1][col-1] != '*') draw[row-1][col-1] = ch;
			if (draw[row-1][col+1] != '*') draw[row-1][col+1] = ch;
			if (draw[row+1][col-1] != '*') draw[row+1][col-1] = ch;
			if (draw[row+1][col+1] != '*') draw[row+1][col+1] = ch;
		}
		
		for (int i=0; i<5; i++) {
			for (int j=0; j<width; j++) {
				if (draw[i][j] == '\0') System.out.print('.');
				else System.out.print(draw[i][j]);
			}
			System.out.println();
		}
	}
}