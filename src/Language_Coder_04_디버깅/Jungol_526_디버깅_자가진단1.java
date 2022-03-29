package Language_Coder_04_디버깅;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Jungol_526_디버깅_자가진단1 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		double a, b;
		
		st = new StringTokenizer(br.readLine(), " ");

		a = Double.parseDouble(st.nextToken());
		b = Double.parseDouble(st.nextToken());
		
		// Integer형의 경우 정수형밖에 표현하지 못해 소수점이 있다면 버리게 된다.
		System.out.println((int)(a*b) + " " + ((int)(a) * (int)(b)));
	}
}
