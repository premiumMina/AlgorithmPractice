package acmicpc;

import java.util.Scanner;

public class Q1012 {

	static int[][] area = null;
	static int m = 0, n = 0;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		for (int t = 0; t < tc; t++) {

			m = sc.nextInt();
			n = sc.nextInt();
			area = new int[m][n];

			// 벌레 개수 입력
			int k = sc.nextInt();

			for (int i = 0; i < k; i++) {
				area[sc.nextInt()][sc.nextInt()]++;
			}

			int warm = 0;
			for (int i = 0; i < m; i++) {
				for (int j = 0; j < n; j++) {

					if (area[i][j] == 1) { // 배추가 있는 곳을 만나면
						bfs(i, j); // 그 영역을 모두 0 으로 만듦
						warm++; // 벌레 수 증가
					}

				}
			}
			System.out.println(warm);
		}
	}

	static void bfs(int i, int j) {
		if (i < 0 || j < 0 || i >= m || j >= n) {
			return;
		}
		if (area[i][j] == 0) {
			return;
		}

		area[i][j]--;
		bfs(i + 1, j);
		bfs(i - 1, j);
		bfs(i, j + 1);
		bfs(i, j - 1);
	}
}
