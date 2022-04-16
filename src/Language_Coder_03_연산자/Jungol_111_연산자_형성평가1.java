package Language_Coder_03_연산자;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
/**
 * @author HanHoon
 * http://www.jungol.co.kr/bbs/board.php?bo_table=pbank&wr_id=155&sca=1030
 */
public class Jungol_111_연산자_형성평가1 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		int[] arr = new int[4];
		int sum = 0;
		
		st = new StringTokenizer(br.readLine(), " ");
		
		for(int i = 0; i < 4; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
			sum += arr[i];
		}
		System.out.println("sum " + sum);
		System.out.println("avg " + sum/4);
		br.close();
	}
}
