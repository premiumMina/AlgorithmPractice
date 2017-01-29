package acmicpc;

import java.util.Scanner;

public class Q1890 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] arr = new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				arr[i][j] = sc.nextInt();
			}
		}

		long[][] dp = new long[n][n];
		dp[0][0] = 1;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (arr[i][j] == 0)
					continue;
				if (j + arr[i][j] < n) {
					dp[i][j + arr[i][j]] += dp[i][j];
				}
				if (i + arr[i][j] < n) {
					dp[i + arr[i][j]][j] += dp[i][j];
				}
			}
		}
		System.out.println(dp[n - 1][n - 1]);

	}
}
