package acmicpc;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q1786 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String t = sc.nextLine();
		String p = sc.nextLine();

		List<Integer> list = kmp(t, p);

		System.out.println(list.size());
		for (int i : list) {
			System.out.println(i);
		}

	}

	public static ArrayList<Integer> kmp(String str, String pattern) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		int[] pi = getPi(pattern);
		int n = str.length();
		int m = pattern.length();
		char[] s = str.toCharArray();
		char[] p = pattern.toCharArray();

		for (int i = 0, j = 0; i < n; i++) {
			while (j > 0 && s[i] != p[j]) {
				j = pi[j - 1];
			}
			if (s[i] == p[j]) {
				if (j == m - 1) { // pattern과 똑같은 문자를 찾은 경우 m:pattern의 길이
					list.add(i - m + 2); // str에서 pattern이 시작되는 위치를 저장
					j = pi[j];
				} else {
					j++;
				}
			}
		}
		return list;
	}

	public static int[] getPi(String pattern) {
		int m = pattern.length();
		char[] p = pattern.toCharArray();
		int[] pi = new int[m];
		for (int i = 1, j = 0; i < m; i++) {
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
