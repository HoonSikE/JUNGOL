package Intermediate_Coder_04_백트래킹_DFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
/**
 * @author HanHoon
 * @category 백트래킹
 * http://jungol.co.kr/bbs/board.php?bo_table=pbank&wr_id=954&sca=3030
 */
public class Jungol_1681_해밀턴_순환회로 {
	static int N;
	static int result = Integer.MAX_VALUE;
	static int[][] map;
	static boolean[] visited;
	public static void dfs(int start, int index, int cost) {
		// 기저조건
		// 비용이 result보다 크다면 return
		if(cost>= result)	return;
		// 회사로 돌아간다.
		if(index == N-1) {
			// 회사로 돌아가는 길이 있다면
			if(map[start][0] != 0) {
				result = result > cost+map[start][0] ? cost+map[start][0] : result;
			}
			return;
		}
		// 회사(0)에서 다음으로 출발, i = 0부터 해도 되지만 굳이 할 필요가 없음.
		for (int i = 1; i < N; i++) {
			if(map[start][i] != 0 && !visited[i]) {
				visited[i] = true;
				dfs(i, index+1, cost + map[start][i]);
				visited[i] = false;
			}
		}
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;

		// N : 배달해야 하는 장소의 수 (단, 1은 출발지(회사))
		N = Integer.parseInt(br.readLine());
		// NxN 크기의 map
		map = new int[N][N];
		visited = new boolean[N];
		// map의 값 입력
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			for (int j = 0; j < N; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		dfs(0,0,0);
		System.out.println(result);
		br.close();
	}
}