package acmicpc;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Q1931 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] arr = new int[n][2];
		for (int i = 0; i < n; i++) {
			arr[i][0] = sc.nextInt();
			arr[i][1] = sc.nextInt();
		}

		Arrays.sort(arr, new Comparator<int[]>() {
			@Override
			public int compare(int[] o1, int[] o2) {
				if (o1[1] > o2[1] || (o1[1] == o2[1] && o1[0] > o2[0]))
					return 1;
				return -1;
			}
		});

		int end = arr[0][1];
		int ans = 1;
		for (int i = 1; i < n; i++) {
			if (arr[i][0] >= end) {
				ans++;
				end = arr[i][1];
			}
		}
		System.out.println(ans);
	}
}
// Scanner sc = new Scanner(System.in);
// int n = sc.nextInt();
// long[] a = new long[n];
// for (int i = 0; i < n; i++)
// a[i] = sc.nextInt() | (sc.nextLong()<<32);
//
// int c = 0;
// Arrays.sort(a);
// long lastEnd = -1;
// for (long e:a){
// if (e << 32 >> 32 >= lastEnd){
// lastEnd = e >> 32;
// c++;
// }
// }
// System.out.println(c);