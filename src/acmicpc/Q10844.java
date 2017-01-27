package acmicpc;

import java.util.Scanner;

public class Q10844 {
	/*
	 * 현재 계단 위치에서 커지는 계단의 경우 -> 1, 현재 계단 위치에서 작아지는 계단의 경우 ->1 총 2의 경우의 수이다.
	 * 
	 */

	public static long mod = 1000000000L;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long[][] dp = new long[n + 1][10];
		for (int i = 1; i < 10; i++) {
			dp[1][i] = 1;
		}

		for (int i = 2; i <= n; i++) {
			for (int j = 0; j < 10; j++) {
				dp[i][j] = 0;
				if (j - 1 >= 0) {
					dp[i][j] += dp[i - 1][j - 1];
				}

				if (j + 1 <= 9) {
					dp[i][j] += dp[i - 1][j + 1];
				}
				dp[i][j] %= mod;
			}
		}

		long ans = 0;
		for (int i = 0; i <= 9; i++) {
			ans += dp[n][i];
		}
		ans %= mod;
		System.out.println(ans);
	}
}
