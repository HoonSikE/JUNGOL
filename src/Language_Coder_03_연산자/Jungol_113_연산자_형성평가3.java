package Language_Coder_03_연산자;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Jungol_113_연산자_형성평가3 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		int[] arr = new int[2];
		
		st = new StringTokenizer(br.readLine(), " ");
		
		for(int i = 0; i < 2; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		arr[0] += 5;
		arr[1] *= 2;
		System.out.println("width = " + arr[0]);
		System.out.println("length = " + arr[1]);
		System.out.println("area = " + arr[0]*arr[1]);
		br.close();
	}
}
