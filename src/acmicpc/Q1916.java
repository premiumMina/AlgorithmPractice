package acmicpc;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Edge {
	int to, cost;

	Edge(int to, int cost) {
		this.to = to;
		this.cost = cost;
	}
}

public class Q1916 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); // 도시
		int m = sc.nextInt(); // 버스

		List<Edge>[] a = new List[n + 1];
		for (int i = 1; i <= n; i++) {
			a[i] = new ArrayList<>();
		}
		for (int i = 0; i < m; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			int z = sc.nextInt();
			a[x].add(new Edge(y, z));
		}
		int start = sc.nextInt();
		int end = sc.nextInt();

		int[] d = new int[n + 1]; // i번째까지의 최소 비용
		int[] visited = new int[n + 1];

		for (int i = 1; i <= n; i++) {
			d[i] = 1000000000;
		}

		d[start] = 0;
		for (int i = 0; i < n - 1; i++) {
			m = 1000000000 + 1;
			int x = -1;
			// 방문하지 않았으면서 , 가장 적은 도시 찾는다 .
			for (int j = 1; j <= n; j++) {
				if (visited[j] == 0 && m > d[j]) {
					m = d[j];
					x = j;
				}
			}
			// 도시를 방문하고
			visited[x] = 1;
			// 도시에 인접해 있는
			for (Edge y : a[x]) {
				if (d[y.to] > d[x] + y.cost) {
					d[y.to] = d[x] + y.cost;
				}
			}

		}

		System.out.println(d[end]);
	}
}
