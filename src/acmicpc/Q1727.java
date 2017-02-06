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

		int[][] dp = new int[n + 1][m + 1];
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= m; j++) {
				dp[i][j] = 987654321;
			}
		}

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= m; j++) {
				dp[i][j] = Math.min(dp[i][j], dp[i - 1][j - 1] + Math.abs(narr[i] - marr[j]));
				if (i > j) {
					dp[i][j] = Math.min(dp[i][j], dp[i - 1][j]);
				}
				if (i < j) {
					dp[i][j] = Math.min(dp[i][j], dp[i][j - 1]);
				}
			}
		}

		System.out.println(dp[n][m]);

	}
}
