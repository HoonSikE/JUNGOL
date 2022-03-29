package Language_Coder_03_연산자;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Jungol_115_연산자_형성평가5 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;

		st = new StringTokenizer(br.readLine(), " ");
		int min_height = Integer.parseInt(st.nextToken());
		int min_weight = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine(), " ");
		int gi_height = Integer.parseInt(st.nextToken());
		int gi_weight = Integer.parseInt(st.nextToken());
		
		System.out.println((min_height > gi_height)&&(min_weight>gi_weight));
		br.close();
	}
}
