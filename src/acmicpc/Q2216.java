package acmicpc;

import java.util.Scanner;

public class Q2216 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t1 = sc.nextInt();
		int t2 = sc.nextInt();
		int t3 = sc.nextInt();
		sc.nextLine();
		String a = sc.nextLine();
		String b = sc.nextLine();
		int n = a.length();
		int m = b.length();
		int[][] d = new int[n + 1][m + 1];
		a = " " + a;
		b = " " + b;
		for (int i = 1; i <= n; i++) {
			d[i][0] = t2 * i;
		}
		for (int i = 1; i <= m; i++) {
			d[0][i] = t2 * i;
		}

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= m; j++) {
				if (a.charAt(i) == b.charAt(j)) {
					d[i][j] = d[i - 1][j - 1];
				} else {
					d[i][j] = Math.max(d[i - 1][j], d[i][j - 1]) + t2;
					d[i][j] = Math.max(d[i][j], d[i - 1][j - 1] + t3);
				}
			}
		}
		System.out.println(d[n][m]);
	}
}
