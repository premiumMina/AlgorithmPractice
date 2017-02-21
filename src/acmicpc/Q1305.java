package acmicpc;

import java.io.IOException;
import java.util.Scanner;

public class Q1305 {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String str = sc.next();
		int m = str.length();
		int[] pi = getPi(str);

		System.out.println(n - pi[m - 1]);
	}

	private static int[] getPi(String pattern) {
		int m = pattern.length();
		int j = 0;
		char[] p = new char[m];
		int[] pi = new int[m];

		p = pattern.toCharArray();
		for (int i = 1; i < m; i++) {
			while (j > 0 && p[i] != p[j]) {
				j = pi[j - 1];
			}
			if (p[i] == p[j]) {
				pi[i] = ++j;
			}
		}

		return pi;
	}
}