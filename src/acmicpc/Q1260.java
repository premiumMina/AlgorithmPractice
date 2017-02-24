package acmicpc;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Q1260 {
	static int[][] graph; // 간선 유무
	static boolean[] visited; // 방문 유무
	static int n; // 정점의 수

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		n = sc.nextInt(); // 정점의 수
		int m = sc.nextInt(); // 간선의 수
		int v = sc.nextInt(); // 시작 정점
		graph = new int[n + 1][n + 1];
		visited = new boolean[n + 1];
		for (int i = 1; i <= m; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			graph[a][b] = graph[b][a] = 1;
		}

		dfs(v);
		// 초기화
		Arrays.fill(visited, false);
		System.out.println();
		bfs(v);
	}

	public static void dfs(int i) {
		visited[i] = true;
		System.out.print(i + " ");
		for (int j = 1; j <= n; j++) {
			if (graph[i][j] == 1 && !visited[j]) {
				dfs(j);
			}
		}

	}

	public static void bfs(int i) {
		Queue<Integer> q = new LinkedList<Integer>();
		q.offer(i);
		visited[i] = true;
		System.out.print(i + " ");

		int tmp;
		while (!q.isEmpty()) {
			tmp = q.poll();
			for (int j = 0; j < n + 1; j++) {
				if (graph[tmp][j] == 1 && visited[j] == false) {
					q.offer(j);
					visited[j] = true;
					System.out.print(j + " ");
				}
			}
		}
	}

}
