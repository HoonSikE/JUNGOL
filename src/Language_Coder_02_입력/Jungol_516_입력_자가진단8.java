package Language_Coder_02_입력;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 * @author HanHoon
 * http://www.jungol.co.kr/bbs/board.php?bo_table=pbank&wr_id=153&sca=1020
 */
public class Jungol_516_입력_자가진단8 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		double a, b;
		char ch;
		
		a = Double.parseDouble(br.readLine());
		b = Double.parseDouble(br.readLine());
		ch = br.readLine().charAt(0);
		
		System.out.printf("%.2f\n", a);
		System.out.printf("%.2f\n", b);
		System.out.println(ch);
	}
}
