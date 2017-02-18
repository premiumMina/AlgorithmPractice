package acmicpc;

import java.util.Arrays;
import java.util.Scanner;

public class Q2468 {
	static int[][] map;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		map = new int[n][n];
		int maxHeight = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				map[i][j] = sc.nextInt();
				if (maxHeight < map[i][j]) {
					maxHeight = map[i][j];
				}
			}
		}

		int result = 1;
		boolean[][] visit = new boolean[n][n];
		for (int h = 1; h < maxHeight; h++) {
			for (int i = 0; i < n; i++) {
				// 초기화 작업
				Arrays.fill(visit[i], false);
			}

			int cnt = 0;
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					if (visit[i][j]) {
						continue;
					}
					cnt += bfs(visit, h, i, j);
				}
			}
			result = Math.max(result, cnt);
		}
		System.out.println(result);

	}

	public static int bfs(boolean[][] visit, int h, int i, int j) {
		if (i < 0 || j < 0 || i == visit.length || j == visit.length) {
			return 0;
		}
		if (visit[i][j]) {
			return 0;
		}
		if (map[i][j] <= h) {
			return 0;
		}

		visit[i][j] = true;
		bfs(visit, h, i + 1, j);
		bfs(visit, h, i - 1, j);
		bfs(visit, h, i, j + 1);
		bfs(visit, h, i, j - 1);

		return 1;
	}
}
