package acmicpc;

import java.util.Scanner;

public class Q1463 {
	public static int[] dp;

	public static int go(int n) {
		if (n == 1) {
			return 0;
		}
		if (dp[n] > 0) {
			return dp[n];
		}
		dp[n] = go(n - 1) + 1;

		if (n % 2 == 0) {
			int tmp = go(n / 2) + 1;
			if (dp[n] > tmp) {
				dp[n] = tmp;
			}
		}

		if (n % 3 == 0) {
			int tmp = go(n / 3) + 1;
			if (dp[n] > tmp) {
				dp[n] = tmp;
			}
		}

		return dp[n];
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		dp = new int[n + 1];
		System.out.println(go(n));
	}
}
