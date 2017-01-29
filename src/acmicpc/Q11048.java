package acmicpc;

import java.util.Scanner;

public class Q11048 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[][] arr = new int[n + 1][m + 1];
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= m; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		int[][] dp = new int[n + 1][m + 1];
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= m; j++) {
				dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
				dp[i][j] = Math.max(dp[i - 1][j - 1], dp[i][j]);
				dp[i][j] += arr[i][j];
			}
		}
		System.out.println(dp[n][m]);
	}
}
