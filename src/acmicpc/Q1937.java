package acmicpc;

import java.util.Scanner;

public class Q1937 {
	static int[][] arr;
	static int[][] dp;
	static int n;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		arr = new int[n][n];
		dp = new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				arr[i][j] = sc.nextInt();
				dp[i][j] = -1;
			}
		}

		int result = 0;

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				result = Math.max(result, solution(i, j));
			}
		}
		System.out.println(result);
	}

	public static int solution(int i, int j) {

		if (dp[i][j] == -1) {
			dp[i][j] = 1;

			if (i > 0 && arr[i][j] < arr[i - 1][j]) {
				dp[i][j] = Math.max(dp[i][j], solution(i - 1, j) + 1);
			}

			if (j > 0 && arr[i][j] < arr[i][j - 1]) {
				dp[i][j] = Math.max(dp[i][j], solution(i, j - 1) + 1);
			}

			if (i + 1 < n && arr[i][j] < arr[i + 1][j]) {
				dp[i][j] = Math.max(dp[i][j], solution(i + 1, j) + 1);
			}

			if (j + 1 < n && arr[i][j] < arr[i][j + 1]) {
				dp[i][j] = Math.max(dp[i][j], solution(i, j + 1) + 1);
			}

		}

		return dp[i][j];
	}
}
