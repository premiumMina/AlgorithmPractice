package acmicpc;

import java.util.Scanner;

public class Q1309 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int line = sc.nextInt();

		int[][] dp = new int[line+1][3];

		dp[0][0] = 1;
		dp[0][1] = 1;
		dp[0][2] = 1;

		for (int i = 1; i <= line; i++) {
			dp[i][0] = (dp[i - 1][0] + dp[i - 1][1] + dp[i - 1][2]) % 9901;
			dp[i][1] = (dp[i - 1][0] + dp[i - 1][2]) % 9901;
			dp[i][2] = (dp[i - 1][0] + dp[i - 1][1]) % 9901;
		}

		System.out.println(dp[line][0]);

	}
}
