package Language_Coder_03_연산자;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Jungol_520_연산자_자가진단3 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int arr = Integer.parseInt(br.readLine());
		System.out.println(arr++);
		System.out.println(++arr);
		br.close();
	}
}
