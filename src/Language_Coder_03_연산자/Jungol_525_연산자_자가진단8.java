package Language_Coder_03_연산자;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Jungol_525_연산자_자가진단8 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		int[] arr = new int[3];
		
		st = new StringTokenizer(br.readLine(), " ");
		
		for(int i = 0; i < 3; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		System.out.println(((arr[0]>arr[1])&&(arr[0]>arr[2])) + " " + ((arr[0]==arr[1])&&(arr[1]==arr[2])));
		br.close();
	}
}
