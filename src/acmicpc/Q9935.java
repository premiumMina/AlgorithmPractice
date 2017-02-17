package acmicpc;

import java.util.Scanner;
import java.util.Stack;

public class Q9935 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();
		String b = sc.nextLine();

		int n = a.length();
		int m = b.length();

		boolean[] remove = new boolean[n];

		if (m == 1) {
			for (int i = 0; i < n; i++) {
				if (a.charAt(i) == b.charAt(0)) {
					remove[i] = true;
				}
			}
		} else {
			Stack<Pair> s = new Stack<Pair>();
			for (int i = 0; i < n; i++) {
				// 폭발문자열의 첫번째와 같을 경우
				if (a.charAt(i) == b.charAt(0)) {
					s.push(new Pair(i, 0));
				} else {
					// 스택이 비었는지 확인
					if (!s.isEmpty()) {
						// 비어있지 않을 경우 스택 확인
						Pair p = s.peek();
						// 현재 문자와 스택에 저장된 다음번의 폭발문자열과 같을 경우
						if (a.charAt(i) == b.charAt(p.b + 1)) {
							s.push(new Pair(i, p.b + 1));
							if (p.b + 1 == m - 1) { // 폭발 문자열을 찾은 것, 스택 비움
								for (int k = 0; k < m; k++) {
									Pair top = s.pop();
									remove[top.a] = true;
								}
							}
						} else {
							while (!s.empty()) {
								// 스택 비움, 폭발문자열이 아님
								s.pop();
							}
						}
					}
				}
			}
		}

		boolean printed = false;
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < n; i++) {
			if (!remove[i]) {
				sb.append(a.charAt(i));
				printed = true;
			}
		}
		if (printed) {
			System.out.println(sb);
		} else {
			System.out.println("FRULA");
		}

	}
}

class Pair {
	int a, b;

	Pair(int a, int b) {
		this.a = a;
		this.b = b;
	}
}