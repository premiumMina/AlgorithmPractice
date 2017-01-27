package acmicpc;

import java.util.Scanner;

public class Q11057 {
	public static long mod = 10007;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long[][] dp = new long[n + 1][10];
		for (int i = 0; i < 10; i++) {
			dp[1][i] = 1;
		}
		for (int i = 2; i <= n; i++) {
			for (int j = 0; j <= 9; j++) {
				for (int k = 0; k <= j; k++) {
					dp[i][j] += dp[i - 1][k];
					dp[i][j] %= mod;
				}
			}
		}

		long ans = 0;
		for (int i = 0; i < 10; i++) {
			ans += dp[n][i];
		}
		ans %= mod;

		System.out.println(ans);
	}
}
