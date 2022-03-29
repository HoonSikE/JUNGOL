package Language_Coder_02_입력;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
/**
 * @author HanHoon
 * http://www.jungol.co.kr/bbs/board.php?bo_table=pbank&wr_id=152&sca=1020
 */
public class Jungol_515_입력_자가진단7 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		int[] num = new int[2];
		
		st = new StringTokenizer(br.readLine(), " ");
		
		for(int i = 0; i< 2; i++)
			num[i] = Integer.parseInt(st.nextToken());
		
		System.out.println(num[0] + " * " + num[1] + " = " + num[0]*num[1]);
		System.out.println(num[0] + " / " + num[1] + " = " + num[0]/num[1]);
	}
}
