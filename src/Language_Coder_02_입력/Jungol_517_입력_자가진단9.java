package Language_Coder_02_입력;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 * @author HanHoon
 * http://www.jungol.co.kr/bbs/board.php?bo_table=pbank&wr_id=154&sca=1020
 */
public class Jungol_517_입력_자가진단9 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		for (int i = 0; i < 3; i++)
			System.out.printf("%.3f\n", Double.parseDouble(br.readLine()));
	}
}
