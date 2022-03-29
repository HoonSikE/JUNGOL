package Language_Coder_02_입력;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 * @author HanHoon
 * http://www.jungol.co.kr/bbs/board.php?bo_table=pbank&wr_id=151&sca=1020
 */
public class Jungol_514_입력_자가진단6 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("height = ");
		
		int height = Integer.parseInt(br.readLine());
		
		System.out.println("Your height is " + height + "cm.");
	}
}
