package Language_Coder_03_연산자;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Jungol_524_연산자_자가진단7 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		boolean[] arr = new boolean[2];
		
		
		st = new StringTokenizer(br.readLine(), " ");
		
		for(int i = 0; i < 2; i++) {
			arr[i] = (Integer.parseInt(st.nextToken()) != 0);
		}
		
		System.out.println((arr[0]&&arr[1]) + " " + (arr[0]| arr[1]));
		br.close();
	}
}
