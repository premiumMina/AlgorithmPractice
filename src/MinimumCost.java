import java.util.ArrayList;
import java.util.Scanner;

/* 
 * 1060 : 최소비용신장트리
 * 제한시간: 1Sec    메모리제한: 32mb
 * 해결횟수: 860회    시도횟수: 2796회   
 * 
 * 모든 학원이 네트워크로 연결하기 위해서
 * 비용이 최소가 되는 프로그램을 작성하라.
 * 
 */

public class MinimumCost {

	static int N;
	static int[][] board;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		board = new int[N][N];

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				board[i][j] = sc.nextInt();
			}
		}

		sc.close();

		ArrayList<Integer> node = new ArrayList<Integer>();
		ArrayList<Integer> connected = new ArrayList<Integer>();

		for (int i = 1; i < N; i++)
			node.add(new Integer(i));

		connected.add(new Integer(0));
		int result = 0;

		while (!node.isEmpty()) {
			int minVertex = 100001;
			int minNode = -1;

			for (int i = 0; i < connected.size(); i++) {
				for (int j = 0; j < node.size(); j++) {
					if (board[connected.get(i)][node.get(j)] < minVertex) {
						minVertex = board[connected.get(i)][node.get(j)];
						minNode = node.get(j);
					}
				}
			}

			result += minVertex;
			node.remove(new Integer(minNode));
			connected.add(new Integer(minNode));
		}

		System.out.println(result);
	}

}
