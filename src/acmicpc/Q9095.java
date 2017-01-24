package acmicpc;

import java.util.Scanner;

public class Q9095 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] dp = new int[11];
		dp[0] = 1;
		dp[1] = 2;
		dp[2] = 4;
		for (int i = 3; i < 11; i++) {
			dp[i] = dp[i-3]+ dp[i - 2] + dp[i - 1];
		}
		
		int n = sc.nextInt();
		while (n-- > 0) {
			int t = sc.nextInt();
			System.out.println(dp[t-1]);
		}
		
	}

}
