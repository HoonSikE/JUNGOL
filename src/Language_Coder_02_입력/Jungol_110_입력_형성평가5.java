package Language_Coder_02_입력;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 * @author HanHoon
 * http://www.jungol.co.kr/bbs/board.php?bo_table=pbank&wr_id=10&sca=1020
 */
public class Jungol_110_입력_형성평가5 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		double yard_cm = 91.44;
		
		System.out.print("yard? ");
		double yard = Double.parseDouble(br.readLine());
		System.out.printf("%.1fyard = %.1fcm", yard, yard*yard_cm);
	}
}
