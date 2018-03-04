package naver;

import java.util.StringTokenizer;

class Animal {
	public static void speak() {
		System.out.println("animal");
	}

}

class Cat extends Animal {
	public static void speak() {
		System.out.println("cat");
	}
}

class Dog extends Animal {
	public static void speak() {
		System.out.println("dog");
	}
}

public class Test {

	public static void main(String[] arg) {
		// Animal a = new Cat();
		// // Cat c = new Animal();
		// a.speak();
		// PriorityQueue<Integer> pq = new PriorityQueue<>();
		String str = "4532647";
		solve(str);

		String exam = "I am developer";
		char[] c = exam.replaceAll(" ", "").toCharArray();
		System.out.println();
	}

	public static void solve(String str) {
		int strLen = str.length();
		int toInteger = Integer.parseInt(str);
		int[] arr = new int[strLen];

		StringBuilder sb = new StringBuilder();
		for (int i = strLen - 1; i >= 0; i--) {
			arr[i] = toInteger % 10;
			toInteger = toInteger / 10;
		}
		sb.append(str.substring(0, 1));
		for (int i = 0; i < strLen - 1; i++) {
			for (int j = i + 1; j < i + 2; j++) {
				if (arr[i] % 2 == 0 && arr[j] % 2 == 0) {
					sb.append("*");
				} else if (arr[i] % 2 != 0 && arr[j] % 2 != 0) {
					sb.append("-");
				}
				sb.append(str.substring(j, j + 1));
			}
		}
		// 4532647
		System.out.println(sb.toString());

	}

}