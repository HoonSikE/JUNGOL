package Language_Coder_02_입력;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
/**
 * @author HanHoon
 * http://www.jungol.co.kr/bbs/board.php?bo_table=pbank&wr_id=8&sca=1020
 */
public class Jungol_109_입력_형성평가4 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		int[] arr = new int[3];
		int sum = 0;
		
		st = new StringTokenizer(br.readLine(), " ");
		
		for(int i = 0; i < 3; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
			sum += arr[i];
		}
		System.out.println("sum = " + sum);
		System.out.println("avg = " + sum/3);
	}
}
