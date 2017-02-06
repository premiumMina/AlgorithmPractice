package acmicpc;

import java.util.Arrays;
import java.util.Scanner;

public class Q1727 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();

		int[] narr = new int[n + 1];
		for (int i = 1; i <= n; i++) {
			narr[i] = sc.nextInt();
		}

		int[] marr = new int[m + 1];
		for (int i = 1; i <= m; i++) {
			marr[i] = sc.nextInt();
		}

		Arrays.sort(narr);
		Arrays.sort(marr);

		// dp[i][j]가 의미하는 것: man[i]와 woman[i]가 커플이 된 경우
		int[][] dp = new int[n + 1][m + 1];
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= m; j++) {
				dp[i][j] = 987654321;
			}
		}

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= m; j++) {
				dp[i][j] = Math.min(dp[i][j], dp[i - 1][j - 1] + Math.abs(narr[i] - marr[j]));
				// i가 큰경우 여성 j와 매치된 모든 남자와의 최소 값을 비교하여 제일 작은 값을 구한다.
				if (i > j) {
					dp[i][j] = Math.min(dp[i][j], dp[i - 1][j]);
				}
				// j가 큰경우 i와 매치되는 여성 j를 모두 비교하여 제일 작은 값을 구한다.
				if (i < j) {
					dp[i][j] = Math.min(dp[i][j], dp[i][j - 1]);
				}
			}
		}

		System.out.println(dp[n][m]);

	}
}
