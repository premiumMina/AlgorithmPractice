package acmicpc;

import java.util.Scanner;

public class Q2229 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] arr = new int[N + 1];
		for (int i = 1; i <= N; i++) {
			arr[i] = sc.nextInt();
		}

		int[] dp = new int[N + 1];

		for (int i = 1; i <= N; i++) {
			// 혼자서 조를 하게 되는 경우는 변화가 없으므로.. 이전의 값을 넣음
			dp[i] = dp[i - 1];
			int max = arr[i];
			int min = arr[i];
			for (int j = i - 1; j >= 1; j--) {
				if (max < arr[j])
					max = arr[j];
				if (min > arr[j])
					min = arr[j];
				int cur = dp[j - 1] + (max - min);
				if (dp[i] < cur) {
					dp[i] = cur;
				}
			}
		}
		System.out.println(dp[N]);
	}
}
