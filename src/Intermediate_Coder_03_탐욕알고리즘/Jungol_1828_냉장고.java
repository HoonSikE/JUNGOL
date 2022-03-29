package Intermediate_Coder_03_탐욕알고리즘;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
/**
 * @author HanHoon
 * @category 그리디
 * http://www.jungol.co.kr/bbs/board.php?bo_table=pbank&wr_id=1101&sca=3050
 */
public class Jungol_1828_냉장고 {
	static class Temperature implements Comparable<Temperature>{
		int row, high;
		
		public Temperature(int row, int high) {
			this.row = row;
			this.high = high;
		}
		@Override
		public int compareTo(Temperature o) {
			// 최고보관온도 오름차순 정렬, 최고보관온도가 같다면 최저온도 오름차순 정렬 
			return this.high != o.high?this.high-o.high:this.row-o.row;
		}
		
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		// N : 화학 물질의 수
		int N = Integer.parseInt(br.readLine());
		Temperature[] temper = new Temperature[N]; 
		// 최저보관온도, 최고보관온도 값 입력
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			temper[i] = new Temperature(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
		}
		// 최고보관온도 오름차순 정렬
		Arrays.sort(temper);
		// 첫번쨰 냉장고를 첫번째 재료의 최대온도로 설정
		int count = 1;
		int max = temper[0].high;
		
		// 두번쨰 재료부터 검사
		for (int i = 1; i < N; i++) {
			// 냉장고의 온도보다 높은 최저보관온도를 가진 재료를 만나면
			if(max < temper[i].row) {
				// 다음냉장고 온도를 그 재료의 최고보관온도로 설정
				max = temper[i].high;
				count++;
			}
		}
		System.out.println(count);
		br.close();
	}
}
