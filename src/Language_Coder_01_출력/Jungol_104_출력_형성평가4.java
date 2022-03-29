package Language_Coder_01_출력;
/**
 * @author HanHoon
 * http://www.jungol.co.kr/bbs/board.php?bo_table=pbank&wr_id=9&sca=1020
 */
public class Jungol_104_출력_형성평가4 {
	public static void main(String[] args) {
		int kor = 90, mat = 80, eng = 100;
		int sum = kor+mat+eng;
		double avg = 1.0 * sum / 3;
		
		System.out.println("kor " + kor);
		System.out.println("mat " + mat);
		System.out.println("eng " + eng);
		System.out.println("sum " + sum);
		System.out.println("avg " + (int)avg);
	}
}
