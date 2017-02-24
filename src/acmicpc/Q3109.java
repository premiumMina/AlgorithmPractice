package acmicpc;

import java.util.Scanner;

public class Q3109 {
	static boolean[][] visited;
	static int C;
	static int R;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		R = sc.nextInt();
		C = sc.nextInt();

		visited = new boolean[R][C];

		sc.nextLine();
		for (int i = 0; i < R; i++) {
			String tmp = sc.nextLine();
			for (int j = 0; j < C; j++) {
				if (tmp.charAt(j) == 'x') {
					visited[i][j] = true;
				}
			}
		}
		int count = 0;
		for (int i = 0; i < R; i++) {
			count += DFS(i, 0);
		}
		System.out.println(count);
	}

	public static int DFS(int x, int y) {
		int cnt = 0;
		int[] dx = { -1, 0, 1 };
		int[] dy = { 1, 1, 1 }; // 열은 앞으로 전진하는 것만 생각하면 됨

		visited[x][y] = true;
		if (y == C - 1) {
			return 1;
		}

		for (int i = 0; i < 3; i++) {
			int nx = x + dx[i];
			int ny = y + dy[i];

			if (isOkay(nx, ny) && cnt == 0) {
				cnt = DFS(nx, ny);
			}
		}

		return cnt;
	}

	// 범위 체크
	public static boolean isOkay(int nx, int ny) {
		return nx >= 0 && nx < R && ny >= 0 && ny < C && !visited[nx][ny];
	}
}
