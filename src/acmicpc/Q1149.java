package acmicpc;

import java.util.Scanner;

public class Q1149 {
	static final int R = 0;
	static final int G = 1;
	static final int B = 2;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		if (input < 1 || input > 1000)
			return;

		int[][] result = new int[3][input];
		int r, g, b;

		result[R][0] = sc.nextInt();
		result[G][0] = sc.nextInt();
		result[B][0] = sc.nextInt();

		for (int i = 1; i < input; i++) {
			r = sc.nextInt();
			g = sc.nextInt();
			b = sc.nextInt();

			result[R][i] = r + Math.min(result[G][i - 1], result[B][i - 1]);
			result[G][i] = g + Math.min(result[R][i - 1], result[B][i - 1]);
			result[B][i] = b + Math.min(result[R][i - 1], result[G][i - 1]);
		}

		System.out.println(Math.min(Math.min(result[R][input - 1], result[G][input - 1]), result[B][input - 1]));
	}

}
