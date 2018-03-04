package bfs;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/*
 * 7576
 */
public class 토마토 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int M = sc.nextInt();
		int N = sc.nextInt();
		int[][] mat = new int[N][M];

		Queue<Point> queue = new LinkedList<>();
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				int v = sc.nextInt();
				mat[i][j] = v;

				if (v == 1) {
					queue.add(new Point(i, j));
				}
			}
		}
		// end of input

		int[][] direction = { { -1, 0 }, { 1, 0 }, { 0, -1 }, { 0, 1 } };

		while (!queue.isEmpty()) {
			Point p = queue.poll();
			for (int i = 0; i < 4; i++) {
				int px = p.x + direction[i][0];
				int py = p.y + direction[i][1];

				if (px >= 0 && px < N && py >= 0 && py < M && mat[px][py] == 0) {
					queue.add(new Point(px, py));
					mat[px][py] = mat[p.x][p.y] + 1;
				}
			}
		}

		int flag = 0;
		int max = 0;
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				if (mat[i][j] == 0) {
					flag = -1;
				}

				if (max < mat[i][j]) {
					max = mat[i][j];
				}
			}
		}

		if (flag == -1) {
			System.out.println(flag);
		} else {
			System.out.println(max - 1);
		}
	}

	static class Point {
		int x, y;

		public Point(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}

}
