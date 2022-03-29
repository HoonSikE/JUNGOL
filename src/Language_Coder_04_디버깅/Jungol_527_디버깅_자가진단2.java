package Language_Coder_04_디버깅;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Jungol_527_디버깅_자가진단2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		int a, b;
		
		st = new StringTokenizer(br.readLine(), " ");

		a = Integer.parseInt(st.nextToken());
		b = Integer.parseInt(st.nextToken());
		
		// 소수점 자리 표현시 반올림해서 표현된다.
		System.out.printf("%d %.2f", a/b, (double)(a)/b);
	}
}
