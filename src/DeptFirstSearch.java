import java.util.Scanner;

public class DeptFirstSearch {
	static void DFS(int start, int count, int[][] list, int[] visited) {
		visited[start - 1] = 1;
		for (int i = 1; i <= count; i++) {
			if (list[start][i] == 1 && visited[i - 1] == 0) {
				System.out.print(start + "에서 " + i + "로 이동한다.");
				System.out.println();
				DFS(i, count, list, visited);
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("시작 정점과 정점의 개수를 입력하시오 : ");
		int start = sc.nextInt();
		int count = sc.nextInt();
		int[] visited = new int[count];
		for (int i = 0; i < count; i++) {
			visited[i] = 0;
		}
		int[][] list = new int[30][30];

		while (true) {
			int v1 = sc.nextInt();
			int v2 = sc.nextInt();
			if (v1 == -1 && v2 == -1)
				break;
			list[v1][v2] = list[v2][v1] = 1;
		}
		DFS(start, count, list, visited);
	}

}
