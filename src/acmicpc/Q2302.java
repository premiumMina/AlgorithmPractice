package acmicpc;

import java.util.Scanner;

public class Q2302 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i, t, n = sc.nextInt(); // 9
		int m = sc.nextInt(); // 2
		int[] dp = new int[n + 1];
		fib(dp, n);
		int cur = 0;
		int ans = 1;

		for (int k = 0; k < m; k++) {
			t = sc.nextInt();
			/* 고정좌석 사이에 존재하는 좌석의 수를 구해서 해당 좌석의 경우의 수 곱하기 */
			ans = ans * dp[t - cur - 1];
			cur = t;
		}
		/* 고정좌석이 n개라면 움직일수있는 좌석의 공간은 n+1이기 때문에 (총 좌석수 - 마지막고정좌석)의 경우의 수도 곱하기 */
		ans *= dp[n - cur];
		System.out.println(ans);

	}

	public static void fib(int[] dp, int n) {
		dp[0] = 1;
		dp[1] = 1;

		for (int i = 2; i <= n; i++) {
			dp[i] = dp[i - 1] + dp[i - 2];
		}
	}

}
