package acmicpc;

import java.util.Scanner;

public class Q9251 {

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
					d[i][j] = Math.max(d[i - 1][j], d[i][j - 1]);
				}
			}
		}
		System.out.println(d[n - 1][m - 1]);
	}
}
