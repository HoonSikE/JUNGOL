package Language_Coder_03_연산자;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Jungol_518_연산자_자가진단1 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		int[] arr = new int[3];
		int sum = 0;
		
		st = new StringTokenizer(br.readLine(), " ");
		
		for(int i = 0; i < 3; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
			sum += arr[i];
		}
		System.out.println("sum : " + sum);
		System.out.println("avg : " + sum/3);
		br.close();
	}
}
