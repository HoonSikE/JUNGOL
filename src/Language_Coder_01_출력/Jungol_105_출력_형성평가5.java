package Language_Coder_01_출력;
/**
 * @author HanHoon
 * http://www.jungol.co.kr/bbs/board.php?bo_table=pbank&wr_id=5&sca=10
 */
public class Jungol_105_출력_형성평가5 {
	public static void main(String[] args) {
		String[][] str = {{"Seoul", "10,312,545", "+91,375"},
						{"Pusan", "3,567,910", "+5,868"},
						{"Incheon", "2,758,296", "+64,888"},
						{"Daegu", "2,511,676", "+17,230"},
						{"Gwangju", "1,454,636", "+29,774"}	};
		
		for(int i = 0; i < str.length; i++) {
			for(int j = 0; j < str[i].length; j++) {
				System.out.printf("%15s", str[i][j]);
			}
			System.out.println();
		}
	}
}
