package acmicpc;

import java.util.Scanner;

public class Q1912 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		int max = Integer.MIN_VALUE;

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		for (int i = 0; i < n; i++) {
			int temp = 0;
			for (int j = i; j < n; j++) {
				temp = temp + arr[j];
				if (temp > max) {
					max = temp;
				}
			}
		}

		System.out.println(max);
	}
}
