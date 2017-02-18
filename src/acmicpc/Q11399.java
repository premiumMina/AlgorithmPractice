package acmicpc;

import java.util.Arrays;
import java.util.Scanner;

public class Q11399 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] p = new int[n];
		for (int i = 0; i < n; i++) {
			p[i] = sc.nextInt();
		}

		Arrays.sort(p);

		int sum = 0;
		int ans = 0;
		for (int i = 0; i < n; i++) {
			sum += p[i];
			ans += sum;
		}
		System.out.println(ans);
	}
}
