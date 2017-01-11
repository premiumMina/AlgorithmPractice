package acmicpc;

import java.util.Scanner;

public class Q1932 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		int[][] arr = new int[num][num];
		for (int i = 0; i < num; i++) {
			for (int j = 0; j <= i; j++) {
				arr[i][j] = sc.nextInt();
			}
		}

		/*
		 * dp[i][j] = 꼭대기에서 i번째 레벨의 j 인덱스까지 합 현재층은 바로 위층에서 해당되는 인덱스의 값을 더해준다.
		 */
		for (int i = 1; i < num; i++) {
			for (int j = 0; j <= i; j++) {
				if (j == 0) {
					arr[i][j] = arr[i][j] + arr[i - 1][j];
				} else if (i == j) {
					arr[i][j] = arr[i][j] + arr[i - 1][j - 1];
				} else {
					arr[i][j] = Math.max(arr[i][j] + arr[i - 1][j - 1], arr[i][j] + arr[i - 1][j]);
				}

			}
		}

		int max = 0;
		for (int i = 0; i < num; i++) {
			if (max < arr[num - 1][i]) {
				max = arr[num - 1][i];
			}
		}
		System.out.println(max);
	}
}
