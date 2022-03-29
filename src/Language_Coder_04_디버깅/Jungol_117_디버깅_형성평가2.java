package Language_Coder_04_디버깅;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Jungol_117_디버깅_형성평가2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		double a, b, c, avg;
		int sum;

		st = new StringTokenizer(br.readLine(), " ");

		a = Double.parseDouble(st.nextToken());
		b = Double.parseDouble(st.nextToken());
		c = Double.parseDouble(st.nextToken());
		
		sum = (int)a+(int)b+(int)c;
		avg = (a+b+c)/3.0;
		// Integer형의 경우 정수형밖에 표현하지 못해 소수점이 있다면 버리게 된다.
		System.out.println("sum " + sum);
		System.out.println("avg " + (int)avg);
	}
}
