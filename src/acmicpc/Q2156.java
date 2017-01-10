package acmicpc;

import java.util.Scanner;

public class Q2156 {
	public static int Max(int a, int b, int c) {
		if (b > c) {
			if (a > b)
				return a;
			else
				return b;
		} else {
			if (a > c)
				return a;
			else
				return c;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/* 포도주 잔의 수 */
		int input = sc.nextInt();
		/* 포도주의 양을 담을 배열 생성 */
		int[] cup = new int[10001];
		for (int i = 1; i <= input; i++) {
			cup[i] = sc.nextInt();
		}

		int[] dp = new int[10001];
		dp[0] = 0;
		dp[1] = cup[1];
		dp[2] = dp[1] + cup[2];

		for (int i = 3; i <= input; i++) {
			dp[i] = Max(dp[i - 3] + cup[i - 1] + cup[i], dp[i - 1], dp[i - 2] + cup[i]);
		}

		System.out.println(dp[input]);
	}
}