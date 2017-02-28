package acmicpc;

import java.util.Scanner;

public class Q1654 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		long n = sc.nextLong();
		long[] line = new long[k];

		for (int i = 0; i < k; i++) {
			line[i] = sc.nextLong();
		}
		System.out.println(lineCut(n, line));

	}

	public static long lineCut(long n, long[] line) {
		long mid = 0;
		long first = 0;
		long last = 1000000000;
		while (first <= last) {
			mid = (first + last) / 2;
			int total = 0;

			for (int i = 0; i < line.length; i++) {
				// 최대 랜선의 길이로 주어진 랜선의 길이를 나눈 몫들의 합(랜선의 개수)을 구한다.
				int result = (int) (line[i] / mid);
				// 전체 랜선의 길이를 total에 더해준다.
				total += result;
			}

			// mid 값을 올려서 total값을 낮추기 위해
			// 기존의 K개의 랜선으로 N개의 랜선을 만들 수 없는 경우는 없다고 가정
			if (total >= n) {
				first = mid + 1;
			} else {
				last = mid - 1;
			}
		}
		return last;
	}
}
