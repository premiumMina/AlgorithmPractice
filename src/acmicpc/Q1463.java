package acmicpc;

import java.util.Scanner;

public class Q1463 {
	static int[] dp;

	public static int solve(int n) {
		if (n == 1) {
			return 0;
		}

		// 2, 3으로 나누는 경우에서 solve(n)을 호출하는 경우 필요
		if (dp[n] > 0) {
			return dp[n];
		}

		// 비교하기 위한 대상
		dp[n] = solve(n - 1) + 1;

		if (n % 2 == 0) {
			int tmp = solve(n / 2) + 1;
			if (tmp < dp[n]) {
				dp[n] = tmp;
			}
		}
		if (n % 3 == 0) {
			int tmp = solve(n / 3) + 1;
			if (tmp < dp[n]) {
				dp[n] = tmp;
			}
		}

		return dp[n];

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		dp = new int[n + 1];
		System.out.println(solve(n));
	}
}
