package acmicpc;

import java.util.Scanner;

public class Q5582 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = " " + sc.nextLine();
		String b = " " + sc.nextLine();
		int n = a.length();
		int m = b.length();
		int[][] d = new int[n][m];

		for (int i = 1; i < n; i++) {
			for (int j = 1; j < m; j++) {
				if (a.charAt(i) == b.charAt(j)) {
					d[i][j] = d[i - 1][j - 1] + 1;
				} else {
					d[i][j] = 0;
				}
			}
		}

		int result = 0;
		for (int i = 1; i < n; i++) {
			for (int j = 1; j < m; j++) {
				if (result < d[i][j]) {
					result = d[i][j];
				}
			}
		}
		System.out.println(result);
	}
}
